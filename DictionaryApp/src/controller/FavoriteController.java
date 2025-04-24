package controller;

import dao.DictionaryDAO;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import views.custom.Card;

public class FavoriteController {

    private DictionaryDAO favDao;
    private JComboBox<String> filterOptions;
    private JPanel mainPanel;

    public FavoriteController() {

    }

    public FavoriteController(JComboBox<String> filterOptions, JPanel mainPanel) {
        this.filterOptions = filterOptions;
        this.mainPanel = mainPanel;

        favDao = new DictionaryDAO("./src/data/Favorite.xml");

        this.filterOptions.addActionListener(e -> {
            loadFavoriteWords(); // Gọi lại khi có lựa chọn mới
        });
        
        loadFavoriteWords();
    }

//    public void loadFavoriteWords(){
//        Map<String, String> favoriteWords = favDao.getAllWords();
//        mainPanel.removeAll();
//        for (Map.Entry<String, String> entry : favoriteWords.entrySet()) {
//            String word = entry.getKey();
//            String meaning = entry.getValue();
//            
//            Card card = new Card();
//            card.setTextWord(word);
//            card.setTextMean(meaning);
//            
//            mainPanel.add(card);
//        }
//        mainPanel.revalidate();
//        mainPanel.repaint();
//    }
    public void loadFavoriteWords() {
        Map<String, String> favoriteWords = favDao.getAllWords();

        String selectedOption = (String) filterOptions.getSelectedItem();

        List<Map.Entry<String, String>> wordList = new ArrayList<>(favoriteWords.entrySet());

        if ("Từ A-Z".equals(selectedOption)) {
            wordList.sort(Map.Entry.comparingByKey());
        } else if ("Từ Z-A".equals(selectedOption)) {
            wordList.sort((e1, e2) -> e2.getKey().compareTo(e1.getKey()));
        }

        mainPanel.removeAll();
        for (Map.Entry<String, String> entry : wordList) {
            String word = entry.getKey();
            String meaning = entry.getValue();

            Card card = new Card();
            card.setTextWord(word);
            card.setTextMean(meaning);

            mainPanel.add(card);
        }
        mainPanel.revalidate();
        mainPanel.repaint();
    }
}
