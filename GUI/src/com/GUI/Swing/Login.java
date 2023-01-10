package com.GUI.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener
{
    JLabel labelUser, labelPassword;
    JTextField textFieldUser;
    JPasswordField passwordFieldPassword;
    JButton buttonLogin, buttonReset, buttonNew;

    DBConnection dbConnection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    ActionListener actionListener;

    public Login()
    {
//        setLayout(new FlowLayout());
        setLayout(null);
        setSize(600, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(400, 300);
        setTitle("Login Page");

        labelUser = new JLabel("Username");
        labelPassword = new JLabel("Password");
        textFieldUser = new JTextField();
        passwordFieldPassword = new JPasswordField();
        buttonLogin = new JButton("Login");
        buttonReset = new JButton("Reset");
        buttonNew = new JButton("New user");

        dbConnection = new DBConnection();


        add(labelUser);
        labelUser.setBounds(50, 50, 90, 20);

        add(textFieldUser);
        textFieldUser.setBounds(150, 50, 90, 20);

        add(labelPassword);
        labelPassword.setBounds(50, 80, 90, 20);

        add(passwordFieldPassword);
        passwordFieldPassword.setBounds(150, 80, 90, 20);

        add(buttonLogin);
        buttonLogin.setBounds(150, 110, 90, 20);
        buttonLogin.addActionListener(this);

        add(buttonReset);
        buttonReset.setBounds(150, 140, 90, 20);

        add(buttonNew);
        buttonNew.setBounds(250, 110, 90, 20);
        buttonNew.addActionListener(this);

    }
//        old code before db connection
    /*
    @Override
    public void actionPerformed(ActionEvent e)
    {

//        String uname = "Abhinna";
//        String pass = "Abhinna013";
//
//        if ((uname.equals(textFieldUser.getText().toString())) && (pass.equals((passwordFieldPassword.getText().toString()))))
//        {
////            JOptionPane.showMessageDialog(null, "login success");
//            new MainForm();
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "login fail");
//        }
    }
*/
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == buttonLogin) {
            try {
                preparedStatement = dbConnection.connection.prepareStatement("SELECT * FROM user WHERE u_name = ? and u_password = ?");
                preparedStatement.setString(1, textFieldUser.getText());
                preparedStatement.setString(2, String.valueOf(passwordFieldPassword.getPassword()));

                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "Login Success");
                    new MainForm();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Login Failed");
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        if (actionEvent.getSource() == buttonNew) {
            try {
                preparedStatement = dbConnection.connection.prepareStatement("INSERT INTO user VALUES (?,?,?)");
                preparedStatement.setString(1, "7");
                preparedStatement.setString(2, "Meeta");
                preparedStatement.setString(3, "Meeta111" );

                int result = preparedStatement.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(null,"Successfully inserted");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Insert failed");
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }


    public static void main(String[] args)
    {
        setDefaultLookAndFeelDecorated(true);
        new Login();
    }
}
