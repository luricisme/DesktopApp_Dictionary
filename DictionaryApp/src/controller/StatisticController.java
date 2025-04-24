package controller;

import com.toedter.calendar.JDateChooser;
import dao.DictStatisticDAO;
import java.util.Date;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StatisticController {

    private DictStatisticDAO statDao;
    private JDateChooser startDateChooser;
    private JDateChooser endDateChooser;
    private JButton findBtn;
    private JTable tableInfo;

    public StatisticController() {

    }

    public StatisticController(JDateChooser startDateChooser, JDateChooser endDateChooser, JButton findBtn, JTable tableInfo) {
        this.startDateChooser = startDateChooser;
        this.endDateChooser = endDateChooser;
        this.findBtn = findBtn;
        this.tableInfo = tableInfo;

        statDao = new DictStatisticDAO("./src/data/Statistic.xml");

        findBtn.addActionListener(e -> {
            loadTableData();
        });
    }

    public void loadTableData() {
        Date startDate = startDateChooser.getDate();
        System.out.println("Start date: " + startDate);
        Date endDate = endDateChooser.getDate();
        System.out.println("End date: " + endDate);

        if (startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày bắt đầu và ngày kết thúc");
            return;
        }

        Map<String, Integer> data = statDao.getInformation(startDate, endDate);
        System.out.println("data: " + data);

        DefaultTableModel model = new DefaultTableModel();
        if (model.getRowCount() > 0) {
            model.setRowCount(0); // Clear all rows
        }

        if (model.getColumnCount() == 0) {
            model.addColumn("Từ");
            model.addColumn("Số lần");
        }
        
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            model.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }
        tableInfo.setModel(model);
    }
}
