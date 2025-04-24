package dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.Element;

public class DictStatisticDAO extends DictionaryDAO {

    public DictStatisticDAO() {

    }

    public DictStatisticDAO(String xmlFilePath) {
        super(xmlFilePath);
    }

    public void addInformation(String word, String meaning, Date date) {
        try {
            Document doc = loadXML();
            Element root = doc.getRootElement();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = sdf.format(date);

            boolean found = false;

            @SuppressWarnings("unchecked")
            List<Element> records = root.elements("record");
            for (Element record : records) {
                String existingWord = record.elementText("word");
                String existingDate = record.elementText("date");

                if (word.equals(existingWord) && dateStr.equals(existingDate)) {
                    Element countElement = record.element("count");
                    int currentCount = Integer.parseInt(countElement.getText());
                    countElement.setText(String.valueOf(currentCount + 1));
                    found = true;
                    break;
                }
            }

            if (!found) {
                Element newRecord = root.addElement("record");
                newRecord.addElement("word").setText(word);
                newRecord.addElement("meaning").setText(meaning);
                newRecord.addElement("count").setText("1");
                newRecord.addElement("date").setText(dateStr);
            }
            saveXML(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, Integer> getInformation(Date startDate, Date endDate) {
        Map<String, Integer> result = new HashMap<>();
        try {
            Document doc = loadXML();
            Element root = doc.getRootElement();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String startStr = sdf.format(startDate);
            String endStr = sdf.format(endDate);

            @SuppressWarnings("unchecked")
            List<Element> records = root.elements("record");

            for (Element record : records) {
                String word = record.elementText("word");
                String dateStr = record.elementText("date");
                int count = Integer.parseInt(record.elementText("count"));
                
                Date recordDate = sdf.parse(dateStr);
                if (!recordDate.before(startDate) && !recordDate.after(endDate)) {
                    result.put(word, result.getOrDefault(word, 0) + count);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
