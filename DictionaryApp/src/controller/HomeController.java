package controller;

import dao.DictionaryDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import views.custom.SearchText;

public class HomeController {
    private DictionaryDAO dictDao;
    private SearchText searchText;
    private JLabel wordLabel;
    private JLabel meanLabel;
    private JComboBox searchOptions;
    
    public HomeController(){
        
    }
    
    public HomeController(SearchText searchText, JComboBox searchOptions, JLabel wordLabel, JLabel meanLabel){
        this.searchText = searchText;
        this.searchOptions = searchOptions;
        this.wordLabel = wordLabel;
        this.meanLabel = meanLabel;
        
        System.out.println("Current path: " + System.getProperty("user.dir"));
        dictDao = new DictionaryDAO("./src/data/Anh_Viet.xml");
        searchOptions.addActionListener(e -> {
            String selected = (String) searchOptions.getSelectedItem();
            if ("Anh - Việt".equals(selected)) {
                dictDao.setXmlFilePath("./src/data/Anh_Viet.xml");
            } else {
                dictDao.setXmlFilePath("./src/data/Viet_Anh.xml");
            }
        });
        
        searchText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) { 
                    search();
                }
            }
        });
    }
    
    private void search() {
        String word = searchText.getText().trim();
        if (!word.isEmpty()) {
            String meaning = dictDao.findMeaning(word);
            wordLabel.setText("Word: " + word);
            meanLabel.setText(meaning != null ? meaning : "Không tìm thấy từ.");
        }
    }
}
