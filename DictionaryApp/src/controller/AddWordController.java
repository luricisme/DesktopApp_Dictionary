package controller;

import dao.DictionaryDAO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddWordController {

    private DictionaryDAO dictDao;
    private JTextField wordTextField;
    private JTextField meanTextField;
    private JComboBox<String> typeOPtions;
    private JButton addBtn;

    public AddWordController() {

    }

    public AddWordController(JTextField wordTextField, JTextField meanTextField, JComboBox<String> typeOptions, JButton addBtn) {
        this.wordTextField = wordTextField;
        this.meanTextField = meanTextField;
        this.typeOPtions = typeOptions;
        this.addBtn = addBtn;

        dictDao = new DictionaryDAO();

        addBtn.addActionListener(e -> {
            String word = wordTextField.getText().trim();
            String meaning = meanTextField.getText().trim();
            String type = (String) typeOptions.getSelectedItem();

            if ("Anh - Việt".equals(type)) {
                dictDao.setXmlFilePath("./src/data/Anh_Viet.xml");
            } else {
                dictDao.setXmlFilePath("./src/data/Viet_Anh.xml");
            }

            boolean success = dictDao.addWord(word, meaning);

            if (success) {
                JOptionPane.showMessageDialog(null, "Thêm từ thành công!");
                wordTextField.setText("");
                meanTextField.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Từ đã tồn tại trong từ điển.");
            }
        });
    }
}
