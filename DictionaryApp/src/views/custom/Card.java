package views.custom;

public class Card extends javax.swing.JPanel {

    public Card() {
        initComponents();
        meanTextArea.setLineWrap(true);
    }

    public void setTextWord(String word) {
        wordLabel.setText(word);
    }

    public void setTextMean(String meaning) {
        meanTextArea.setText(meaning);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wordLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        meanTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        wordLabel.setBackground(new java.awt.Color(1, 195, 253));
        wordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wordLabel.setText("Word");
        wordLabel.setOpaque(true);

        meanTextArea.setColumns(20);
        meanTextArea.setRows(5);
        jScrollPane1.setViewportView(meanTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea meanTextArea;
    private javax.swing.JLabel wordLabel;
    // End of variables declaration//GEN-END:variables
}
