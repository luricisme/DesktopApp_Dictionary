package controller;

import dao.DictionaryDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import views.custom.SearchText;

public class HomeController {

    private DictionaryDAO dictDao;
    private DictionaryDAO favDao;
    private SearchText searchText;
    private JLabel wordLabel;
    private JTextArea meanTextArea;
    private JComboBox searchOptions;
    private JLabel favoriteBtn;
    private JLabel deleteBtn;

    public HomeController() {

    }

    public HomeController(SearchText searchText, JComboBox searchOptions, JLabel wordLabel, JTextArea meanTextArea, JLabel favoriteBtn, JLabel deleteBtn) {
        this.searchText = searchText;
        this.searchOptions = searchOptions;
        this.wordLabel = wordLabel;
        this.meanTextArea = meanTextArea;
        this.favoriteBtn = favoriteBtn;
        this.deleteBtn = deleteBtn;

        dictDao = new DictionaryDAO("./src/data/Anh_Viet.xml");
        favDao = new DictionaryDAO("./src/data/Favorite.xml");
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

//        favoriteBtn.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                String word = wordLabel.getText().trim();
//                String meaning = meanTextArea.getText().trim();
//
//                if (word.isEmpty() || meaning.isEmpty()) {
//                    JOptionPane.showMessageDialog(null, "Không có từ nào để thêm vào mục yêu thích!");
//                    return;
//                }
//
//                boolean success = favDao.addWord(word, meaning);
//                if (success) {
//                    favoriteBtn.setIcon(new ImageIcon("./src/views/icon/love_red.png"));
//                } else {
//                    JOptionPane.showMessageDialog(null, "Từ đã tồn tại trong mục yêu thích.");
//                }
//            }
//        });
        favoriteBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String word = wordLabel.getText().trim();
                String meaning = meanTextArea.getText().trim();

                if (word.isEmpty() || meaning.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Không có từ nào để xử lý!");
                    return;
                }

                if (favDao.findWord(word)) {
                    boolean removed = favDao.deleteWord(word);
                    if (removed) {
                        favoriteBtn.setIcon(new ImageIcon("./src/views/icon/love_black.png")); 
//                        JOptionPane.showMessageDialog(null, "Đã xóa khỏi mục yêu thích.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lỗi khi xóa khỏi yêu thích.");
                    }
                } else {
                    boolean success = favDao.addWord(word, meaning);
                    if (success) {
                        favoriteBtn.setIcon(new ImageIcon("./src/views/icon/love_red.png")); 
//                        JOptionPane.showMessageDialog(null, "Đã thêm vào mục yêu thích.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lỗi khi thêm vào yêu thích.");
                    }
                }
            }
        });

        deleteBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String word = wordLabel.getText().trim();
                if (favDao.findWord(word)) {
                    boolean success_fav = favDao.deleteWord(word);
                    if (success_fav) {
                        System.out.println("Deleted from favorite");
                    } else {
                        System.out.println("Error while deleting word from favorite");
                    }
                }

                boolean success_dict = dictDao.deleteWord(word);
                if (success_dict) {
                    JOptionPane.showMessageDialog(null, "Từ đã bị xóa khỏi từ điển");
                    wordLabel.setText("Word");
                    meanTextArea.setText("Meaning");
                    favoriteBtn.setIcon(new ImageIcon("./src/views/icon/love_black.png"));
                } else {
                    JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi xóa từ");
                }
            }

        });
    }

    private void search() {
        String word = searchText.getText().trim();
        if (!word.isEmpty()) {
            String meaning = dictDao.findMeaning(word);
            wordLabel.setText(word);
            meanTextArea.setText(meaning != null ? meaning : "Không tìm thấy từ.");
            if (favDao.findWord(word)) {
                favoriteBtn.setIcon(new ImageIcon("./src/views/icon/love_red.png"));
            } else {
                favoriteBtn.setIcon(new ImageIcon("./src/views/icon/love_black.png"));
            }
        }
    }
}
