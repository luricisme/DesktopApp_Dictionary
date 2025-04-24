package views.form;

import controller.StatisticController;

public class Form_Statistic extends javax.swing.JPanel {
    private StatisticController statisticController;
   
    public Form_Statistic() {
        initComponents();
        if(statisticController == null){
            statisticController = new StatisticController(startDateChooser, endDateChooser, findBtn, tableInfo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JPanel();
        titleText = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        startDateTitle = new javax.swing.JLabel();
        endDateTitle = new javax.swing.JLabel();
        findBtn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(611, 558));
        setLayout(new java.awt.BorderLayout());

        titleLabel.setOpaque(false);

        titleText.setBackground(new java.awt.Color(106, 225, 240));
        titleText.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleText.setText("THỐNG KÊ TỪ ĐÃ TRA");
        titleText.setOpaque(true);

        startDateTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startDateTitle.setText("Ngày bắt đầu");

        endDateTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        endDateTitle.setText("Ngày kết thúc");

        findBtn.setText("Thống kê");

        javax.swing.GroupLayout titleLabelLayout = new javax.swing.GroupLayout(titleLabel);
        titleLabel.setLayout(titleLabelLayout);
        titleLabelLayout.setHorizontalGroup(
            titleLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(titleLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(titleLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(endDateTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(endDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(findBtn)
                .addGap(125, 125, 125))
        );
        titleLabelLayout.setVerticalGroup(
            titleLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLabelLayout.createSequentialGroup()
                .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(titleLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleLabelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(titleLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startDateTitle)
                            .addComponent(endDateTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(titleLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(titleLabelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        add(titleLabel, java.awt.BorderLayout.PAGE_START);

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableInfo.setOpaque(false);
        tableInfo.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableInfo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableInfo);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel endDateTitle;
    private javax.swing.JButton findBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JLabel startDateTitle;
    private javax.swing.JTable tableInfo;
    private javax.swing.JPanel titleLabel;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}
