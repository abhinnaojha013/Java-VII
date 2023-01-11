package com.GUI.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ModifyRecord extends JFrame implements ActionListener {
    JLabel labelRoll, labelName, labelLevel, labelFaculty, labelSemester;
    JTextField textFieldName;
    JComboBox comboBoxRoll, comboBoxLevel, comboBoxFaculty, comboBoxSemester;
    JButton buttonSave;

    DBConnection dbConnection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public ModifyRecord() {
        setLayout(null);
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(400, 400);
        setVisible(true);
        setTitle("Modify record");

        dbConnection = new DBConnection();

        labelRoll = new JLabel("Roll");
        labelName = new JLabel("Name");
        labelLevel = new JLabel("Level");
        labelFaculty = new JLabel("Faculty");
        labelSemester = new JLabel("Semester");

        comboBoxRoll = new JComboBox(   );
        try {
            preparedStatement = dbConnection.connection.prepareStatement("SELECT roll FROM student_table");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                comboBoxRoll.addItem(resultSet.getString(1));
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        comboBoxRoll.addActionListener(this);

        textFieldName = new JTextField();

        buttonSave = new JButton("Modify");

        comboBoxLevel = new JComboBox();
            comboBoxLevel.addItem("+2");
            comboBoxLevel.addItem("Bachelor's");
            comboBoxLevel.addItem("Master's");
            comboBoxLevel.addItem("PhD");

        comboBoxSemester = new JComboBox();
            comboBoxSemester.addItem("I");
            comboBoxSemester.addItem("II");
            comboBoxSemester.addItem("III");
            comboBoxSemester.addItem("IV");
            comboBoxSemester.addItem("V");
            comboBoxSemester.addItem("VI");
            comboBoxSemester.addItem("VII");
            comboBoxSemester.addItem("VIII");

        comboBoxFaculty = new JComboBox();
            comboBoxFaculty.addItem("CSIT");
            comboBoxFaculty.addItem("BIM");
            comboBoxFaculty.addItem("BCA");


        add(labelRoll);
        labelRoll.setBounds(10, 10, 60, 30);
        add(comboBoxRoll);
        comboBoxRoll.setBounds(80, 10, 80, 30);

        add(labelName);
        labelName.setBounds(10, 50, 60, 30);
        add(textFieldName);
        textFieldName.setBounds(80, 50, 80, 30);

        add(labelLevel);
        labelLevel.setBounds(10, 90, 60, 30);
        add(comboBoxLevel);
        comboBoxLevel.setBounds(80, 90, 80, 30);

        add(labelFaculty);
        labelFaculty.setBounds(10, 130, 60, 30);
        add(comboBoxFaculty);
        comboBoxFaculty.setBounds(80, 130, 80, 30);

        add(labelSemester);
        labelSemester.setBounds(10, 170, 60, 30);
        add(comboBoxSemester);
        comboBoxSemester.setBounds(80, 170, 80, 30);

        add(buttonSave);
        buttonSave.setBounds(80, 210, 80, 30);
        buttonSave.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == comboBoxRoll) {
            try {
                preparedStatement = dbConnection.connection.prepareStatement("SELECT * FROM student_table WHERE roll = ?");
                preparedStatement.setString(1, comboBoxRoll.getSelectedItem().toString());

                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    textFieldName.setText(resultSet.getString(2));
                    comboBoxLevel.setSelectedItem(resultSet.getString(3));
                    comboBoxFaculty.setSelectedItem(resultSet.getString(4));
                    comboBoxSemester.setSelectedItem(resultSet.getString(5));
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        if (actionEvent.getSource() == buttonSave)
        {
            try {
                preparedStatement = dbConnection.connection.prepareStatement("UPDATE student_table SET full_name = ?,level = ?, faculty = ?, semester = ? WHERE roll = ?");
                preparedStatement.setString(1, textFieldName.getText());
                preparedStatement.setString(2, comboBoxLevel.getSelectedItem().toString());
                preparedStatement.setString(3, comboBoxFaculty.getSelectedItem().toString());
                preparedStatement.setString(4, comboBoxSemester.getSelectedItem().toString());
                preparedStatement.setString(5, comboBoxRoll.getSelectedItem().toString());

                int result = preparedStatement.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Success");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Fail");
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

//    public static void main(String[] args) {
//        new ModifyRecord();
//    }
}
