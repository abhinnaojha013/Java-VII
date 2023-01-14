package com.GUI.Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchAndView extends JFrame implements ActionListener {
    JLabel label;
    JComboBox comboBoxParameter;
    JTextField textFieldKeyword;
    JButton buttonSearch;

    DefaultTableModel tableModel;
    JTable table;

    DBConnection dbConnection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public SearchAndView() {
        setLayout(null);
        setSize(600, 600);
        setVisible(true);
        setTitle("Search");

        label = new JLabel("Search:");
        comboBoxParameter = new JComboBox();
        textFieldKeyword = new JTextField();
        buttonSearch = new JButton("Search");

        add(label);
        label.setBounds(10, 10, 80, 30);

        add(comboBoxParameter);
        comboBoxParameter.setBounds(10, 50, 80, 30);
            comboBoxParameter.addItem("Roll");
            comboBoxParameter.addItem("Name");
            comboBoxParameter.addItem("Level");
            comboBoxParameter.addItem("Faculty");
            comboBoxParameter.addItem("Semester");

        add(textFieldKeyword);
        textFieldKeyword.setBounds(10, 90, 80, 30);

        add(buttonSearch);
        buttonSearch.setBounds(10, 130, 80, 30);
        buttonSearch.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == buttonSearch) {
            try {
                dbConnection = new DBConnection();

                String parameter = comboBoxParameter.getSelectedItem().toString();

                switch (parameter) {
                    case "Roll" -> {
                        preparedStatement = dbConnection.connection.prepareStatement("SELECT * FROM student_table WHERE roll = ?");
                        preparedStatement.setString(1, textFieldKeyword.getText());
                    }
                    case "Name" -> {
                        preparedStatement = dbConnection.connection.prepareStatement("SELECT * FROM student_table WHERE full_name = ?");
                        preparedStatement.setString(1, textFieldKeyword.getText());
                    }
                    case "Level" -> {
                        preparedStatement = dbConnection.connection.prepareStatement("SELECT * FROM student_table WHERE level = ?");
                        preparedStatement.setString(1, textFieldKeyword.getText());
                    }
                    case "Faculty" -> {
                        preparedStatement = dbConnection.connection.prepareStatement("SELECT * FROM student_table WHERE faculty = ?");
                        preparedStatement.setString(1, textFieldKeyword.getText());
                    }
                    case "Semester" -> {
                        preparedStatement = dbConnection.connection.prepareStatement("SELECT * FROM student_table WHERE semester = ?");
                        preparedStatement.setString(1, textFieldKeyword.getText());
                    }
                }

                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
//                    or use do while instead of resultSet.previous()
                    resultSet.previous();
                    tableModel = new DefaultTableModel();
                    table = new JTable(tableModel);
                    tableModel.addColumn("Roll");
                    tableModel.addColumn("Name");
                    tableModel.addColumn("Level");
                    tableModel.addColumn("Faculty");
                    tableModel.addColumn("Semester");

                    //do {
                    while (resultSet.next()) {
                        tableModel.addRow(new Object[]{
                                resultSet.getString(1),
                                resultSet.getString(2),
                                resultSet.getString(3),
                                resultSet.getString(4),
                                resultSet.getString(5),
                        });
                    }
//                    } while (resultSet.next());
                    int vertical_scroll = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
                    int horizontal_scroll = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

                    JScrollPane scrollPane = new JScrollPane((table), vertical_scroll, horizontal_scroll);

                    add(scrollPane);
                    scrollPane.setBounds(10, 170, 500, 300);
                }
                else {
                    JOptionPane.showMessageDialog(null, "No record found, sorry");
                }

            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
//
//    public static void main(String[] args) {
//        new SearchAndView();
//    }
}
