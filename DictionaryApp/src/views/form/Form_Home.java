package views.form;

import controller.HomeController;

public class Form_Home extends javax.swing.JPanel {

    private HomeController homeController;

    public Form_Home() {
        initComponents();
        if (homeController == null) {
            homeController = new HomeController(searchBar.getSearchText(), searchBar.getSearchOptions(), wordLabel, meanTextArea, favoriteBtn, deleteBtn);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchResultPanel = new views.custom.PanelBorder();
        wordLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        meanTextArea = new javax.swing.JTextArea();
        favoriteBtn = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JLabel();
        searchBar = new views.component.Header();

        setBackground(new java.awt.Color(247, 247, 247));

        searchResultPanel.setBackground(new java.awt.Color(255, 255, 255));

        wordLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        wordLabel.setText("Word");

        meanTextArea.setEditable(false);
        meanTextArea.setColumns(20);
        meanTextArea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        meanTextArea.setLineWrap(true);
        meanTextArea.setRows(5);
        meanTextArea.setText("Meaning");
        jScrollPane1.setViewportView(meanTextArea);

        favoriteBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        favoriteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icon/love_black.png"))); // NOI18N

        deleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icon/delete.png"))); // NOI18N

        javax.swing.GroupLayout searchResultPanelLayout = new javax.swing.GroupLayout(searchResultPanel);
        searchResultPanel.setLayout(searchResultPanelLayout);
        searchResultPanelLayout.setHorizontalGroup(
            searchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(searchResultPanelLayout.createSequentialGroup()
                        .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(favoriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        searchResultPanelLayout.setVerticalGroup(
            searchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(favoriteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
            .addComponent(searchResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(searchResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteBtn;
    private javax.swing.JLabel favoriteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea meanTextArea;
    private views.component.Header searchBar;
    private views.custom.PanelBorder searchResultPanel;
    private javax.swing.JLabel wordLabel;
    // End of variables declaration//GEN-END:variables
}
