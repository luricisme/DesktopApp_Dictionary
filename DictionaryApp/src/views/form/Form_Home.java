package views.form;

import controller.HomeController;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        new HomeController(searchBar.getSearchText(), searchBar.getSearchOptions(), wordLabel, meanLabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchResultPanel = new views.custom.PanelBorder();
        wordLabel = new javax.swing.JLabel();
        meanLabel = new javax.swing.JLabel();
        searchBar = new views.component.Header();

        setBackground(new java.awt.Color(247, 247, 247));

        searchResultPanel.setBackground(new java.awt.Color(255, 255, 255));

        wordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        wordLabel.setText("Word");

        meanLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        meanLabel.setText("Meaning");

        javax.swing.GroupLayout searchResultPanelLayout = new javax.swing.GroupLayout(searchResultPanel);
        searchResultPanel.setLayout(searchResultPanelLayout);
        searchResultPanelLayout.setHorizontalGroup(
            searchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(meanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        searchResultPanelLayout.setVerticalGroup(
            searchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(meanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
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
    private javax.swing.JLabel meanLabel;
    private views.component.Header searchBar;
    private views.custom.PanelBorder searchResultPanel;
    private javax.swing.JLabel wordLabel;
    // End of variables declaration//GEN-END:variables
}
