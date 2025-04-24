package views.form;

import controller.AddWordController;

public class Form_AddWord extends javax.swing.JPanel {
    private AddWordController addWordController;
    public Form_AddWord() {
        initComponents();
        if(addWordController == null){
            addWordController = new AddWordController(wordTextField, meanTextField, typeOptions, addBtn);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.custom.PanelBorder();
        titlePanel = new javax.swing.JPanel();
        titleText = new javax.swing.JLabel();
        mainFormPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        wordPanel = new javax.swing.JPanel();
        wordTitle = new javax.swing.JLabel();
        wordTextField = new javax.swing.JTextField();
        meanPanel = new javax.swing.JPanel();
        meanTitle = new javax.swing.JLabel();
        meanTextField = new javax.swing.JTextField();
        typePanel = new javax.swing.JPanel();
        typeTitle = new javax.swing.JLabel();
        typeOptions = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(611, 558));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(611, 558));
        panelBorder1.setLayout(new java.awt.BorderLayout());

        titlePanel.setPreferredSize(new java.awt.Dimension(600, 100));

        titleText.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleText.setText("THÊM TỪ VÀO TỪ ĐIỂN");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleText, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panelBorder1.add(titlePanel, java.awt.BorderLayout.PAGE_START);

        mainFormPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainFormPanel.setPreferredSize(new java.awt.Dimension(600, 350));
        mainFormPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 15));

        formPanel.setBackground(new java.awt.Color(255, 255, 255));
        formPanel.setPreferredSize(new java.awt.Dimension(600, 250));

        wordPanel.setLayout(new java.awt.BorderLayout());

        wordTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        wordTitle.setText("Từ");
        wordPanel.add(wordTitle, java.awt.BorderLayout.PAGE_START);

        wordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        wordPanel.add(wordTextField, java.awt.BorderLayout.CENTER);

        meanPanel.setLayout(new java.awt.BorderLayout());

        meanTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        meanTitle.setText("Nghĩa của từ");
        meanPanel.add(meanTitle, java.awt.BorderLayout.PAGE_START);

        meanTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        meanPanel.add(meanTextField, java.awt.BorderLayout.CENTER);

        typePanel.setLayout(new java.awt.BorderLayout());

        typeTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        typeTitle.setText("Loại từ điển");
        typePanel.add(typeTitle, java.awt.BorderLayout.PAGE_START);

        typeOptions.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        typeOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anh - Việt", "Việt - Anh" }));
        typePanel.add(typeOptions, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(wordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(typePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addComponent(wordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(meanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(175, 175, 175))
            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                    .addContainerGap(126, Short.MAX_VALUE)
                    .addComponent(typePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );

        mainFormPanel.add(formPanel);

        addBtn.setText("THÊM");
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainFormPanel.add(addBtn);

        panelBorder1.add(mainFormPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel mainFormPanel;
    private javax.swing.JPanel meanPanel;
    private javax.swing.JTextField meanTextField;
    private javax.swing.JLabel meanTitle;
    private views.custom.PanelBorder panelBorder1;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel titleText;
    private javax.swing.JComboBox<String> typeOptions;
    private javax.swing.JPanel typePanel;
    private javax.swing.JLabel typeTitle;
    private javax.swing.JPanel wordPanel;
    private javax.swing.JTextField wordTextField;
    private javax.swing.JLabel wordTitle;
    // End of variables declaration//GEN-END:variables
}
