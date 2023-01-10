package com.GUI.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

public class AddRecords extends JFrame implements ActionListener {
    JLabel labelRoll, labelName, labelLevel, labelFaculty, labelSemester;
    JTextField textFieldRoll, textFieldName;
    JComboBox comboBoxLevel, comboBoxFaculty, comboBoxSemester;
    JButton buttonSave;

    DBConnection dbConnection;
    PreparedStatement preparedStatement;

    public AddRecords()
    {
        setLayout(null);
        setSize(600, 600);
        setLocation(400, 400);
        setVisible(true);
        setTitle("Add records");

        labelRoll = new JLabel("Roll");
        labelName = new JLabel("Name");
        labelLevel = new JLabel("Level");
        labelFaculty = new JLabel("Faculty");
        labelSemester = new JLabel("Semester");

        textFieldRoll = new JTextField();
        textFieldName = new JTextField();

        buttonSave = new JButton("Save");

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
        add(textFieldRoll);
        textFieldRoll.setBounds(80, 10, 80, 30);

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

        new MainForm();
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == buttonSave) {
            try {
                preparedStatement = dbConnection.connection.prepareStatement("INSERT INTO student_table VALUES (?,?,?,?,?)");
                preparedStatement.setString(1, textFieldRoll.getText());
                preparedStatement.setString(2, textFieldName.getText());
                preparedStatement.setString(3, comboBoxLevel.getSelectedItem().toString());
                preparedStatement.setString(4, comboBoxFaculty.getSelectedItem().toString());
                preparedStatement.setString(5, comboBoxSemester.getSelectedItem().toString());

                int result = preparedStatement.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Success");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Failed");
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}