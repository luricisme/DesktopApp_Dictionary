package dao;

import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DictionaryDAO {
    private String xmlFilePath;

    public DictionaryDAO() {

    }
    
    public DictionaryDAO(String xmlFilePath) {
        this.xmlFilePath = xmlFilePath;
    }
    
    public String getXmlFilePath() {
        return xmlFilePath;
    }

    public void setXmlFilePath(String xmlFilePath) {
        this.xmlFilePath = xmlFilePath;
    }

    // Get all
    public Map<String, String> getAllWords() {
        Map<String, String> dictionary = new LinkedHashMap<>();
        try {
            Document doc = loadXML();
            Element root = doc.getRootElement();

            for (Iterator<Element> it = root.elementIterator("record"); it.hasNext();) {
                Element record = it.next();
                String word = record.elementText("word").trim();
                String meaning = record.elementText("meaning").trim();
                dictionary.put(word, meaning);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dictionary;
    }
    
    // Find meaning
    public String findMeaning(String word){
        Map<String, String> dict = getAllWords();
        return dict.getOrDefault(word, "Không tìm thấy từ này");
    }
    
    // Find word
    public boolean findWord(String word) {
        Map<String, String> dict = getAllWords();
        return dict.containsKey(word);
    }
    
    // Add word
    public boolean addWord(String word, String meaning){
        try{
            Map<String, String> dict = getAllWords();
            if(dict.containsKey(word)){
                return false; // Từ đã tồn tại
            }
            
            Document doc = loadXML();
            Element root = doc.getRootElement();
            
            Element newRecord = root.addElement("record");
            newRecord.addElement("word").addText(word);
            newRecord.addElement("meaning").addText(meaning);
            
            saveXML(doc);
            return true;
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    // Delete word
    public boolean deleteWord(String word){
        try{
            Document doc = loadXML();
            Element root = doc.getRootElement();
            
            for(Iterator<Element> it = root.elementIterator("record"); it.hasNext();){
                Element record = it.next();
                if (word.equalsIgnoreCase(record.elementText("word").trim())) {
                    root.remove(record);
                    saveXML(doc);
                    return true;
                }
            }
            return false;
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    // Update word
    public boolean updateWord(String word, String newMeaning) {
        try {
            Document doc = loadXML();
            Element root = doc.getRootElement();

            for (Iterator<Element> it = root.elementIterator("record"); it.hasNext(); ) {
                Element record = it.next();
                if (word.equalsIgnoreCase(record.elementText("word").trim())) {
                    record.element("meaning").setText(newMeaning);
                    saveXML(doc);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // HELPER
    private Document loadXML() throws Exception {
        SAXReader reader = new SAXReader();
        return reader.read(new File(xmlFilePath));
    }

    private void saveXML(Document doc) throws Exception {
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(new FileWriter(xmlFilePath), format);
        writer.write(doc);
        writer.close();
    }
}
