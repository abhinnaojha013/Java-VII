package com.GUI.AWTlogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginAWT extends Frame implements ActionListener
{
    Label labelUser, labelPassword;
    TextField textFieldUser, textFieldPassword;
    Button buttonLogin, buttonReset;

    ActionListener actionListener;

    public LoginAWT()
    {
//        setLayout(new FlowLayout());
        setLayout(null);
        setSize(300, 150);
        setVisible(true);
        setResizable(false);
        setLocation(400, 300);
        setTitle("Login Page");

        labelUser = new Label("Username");
        labelPassword = new Label("Password");
        textFieldUser = new TextField();
        textFieldPassword = new TextField();
        buttonLogin = new Button("Login");
        buttonReset = new Button("Reset");

        add(labelUser);
        labelUser.setBounds(50, 50, 90, 20);

        add(textFieldUser);
        textFieldUser.setBounds(150, 50, 90, 20);

        add(labelPassword);
        labelPassword.setBounds(50, 80, 90, 20);

        add(textFieldPassword);
        textFieldPassword.setEchoChar('*');
        textFieldPassword.setBounds(150, 80, 90, 20);

        add(buttonLogin);
        buttonLogin.setBounds(150, 110, 60, 20);
        buttonLogin.addActionListener(this);

        add(buttonReset);
        buttonReset.setBounds(150, 140, 60, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String uname = "Alex";
        String pass = "Alex123";

        if ((uname.equals(textFieldUser.getText().toString())) && (pass.equals((textFieldPassword.getText().toString()))))
        {
            JOptionPane.showMessageDialog(null, "login success");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "login fail");
        }
    }

    public static void main(String[] args)
    {
        new LoginAWT();
    }
}
