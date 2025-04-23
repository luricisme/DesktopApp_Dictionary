package views.component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComboBox;
import views.custom.SearchText;

public class Header extends javax.swing.JPanel {
    public Header() {
        initComponents();
        setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchText = new views.custom.SearchText();
        searchOptions = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icon/search.png"))); // NOI18N

        searchOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anh - Việt", "Việt - Anh" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchOptions, 0, 92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
            .addComponent(searchOptions, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(searchText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(grphcs); 
    }
    
    public SearchText getSearchText(){
        return this.searchText;
    }
    
    public JComboBox<String> getSearchOptions(){
        return this.searchOptions;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> searchOptions;
    private views.custom.SearchText searchText;
    // End of variables declaration//GEN-END:variables
}
