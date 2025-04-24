package views.form;

import controller.FavoriteController;

public class Form_Favorite extends javax.swing.JPanel {
    private FavoriteController favoriteController;

    public Form_Favorite() {
        initComponents();
        if(favoriteController == null){
            favoriteController = new FavoriteController(filterOptions, mainPanel);
        }
    }
    
    public void updateFavoriteWords() {
        favoriteController.loadFavoriteWords();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        titleText = new javax.swing.JLabel();
        filterPanel = new javax.swing.JPanel();
        filterText = new javax.swing.JLabel();
        filterOptions = new javax.swing.JComboBox<>();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(611, 558));
        setLayout(new java.awt.BorderLayout());

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setOpaque(false);

        titleText.setBackground(new java.awt.Color(106, 225, 240));
        titleText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleText.setText("DANH SÁCH TỪ YÊU THÍCH");
        titleText.setOpaque(true);

        filterPanel.setLayout(new java.awt.BorderLayout());

        filterText.setBackground(new java.awt.Color(253, 114, 114));
        filterText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        filterText.setText("Lựa chọn chế độ xem");
        filterText.setOpaque(true);
        filterPanel.add(filterText, java.awt.BorderLayout.PAGE_START);

        filterOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Từ A-Z", "Từ Z-A" }));
        filterPanel.add(filterOptions, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(filterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(titleText, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(titlePanel, java.awt.BorderLayout.PAGE_START);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setOpaque(false);
        mainPanel.add(jScrollPane1);

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> filterOptions;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JLabel filterText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}
