package com.GUI.Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;

public class AllRecords extends JFrame{
    DefaultTableModel tableModel;
    JTable table;

    public AllRecords() {
        setTitle("All records");
        setVisible(true);
        setSize(700, 500);
        setLocation(300, 30);

        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);

        tableModel.addColumn("Roll");
        tableModel.addColumn("Name");
        tableModel.addColumn("Level");
        tableModel.addColumn("Faculty");
        tableModel.addColumn("Semester");

        try {
            DBConnection dbConnection = new DBConnection();
            Statement statement = dbConnection.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student_table");

            while (resultSet.next()) {
                tableModel.addRow(new Object[] {resultSet.getString(1),
                                                resultSet.getString(2),
                                                resultSet.getString(3),
                                                resultSet.getString(4),
                                                resultSet.getString(5),
                });
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }

        int horizontal_scroll = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        int vertical_scroll = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

        JScrollPane scrollPane = new JScrollPane((table), vertical_scroll, horizontal_scroll);

        add(scrollPane);
        scrollPane.setBounds(20, 20, 600, 400);
    }

//    public static void main(String[] args) {
//        new AllRecords();
//    }
}
