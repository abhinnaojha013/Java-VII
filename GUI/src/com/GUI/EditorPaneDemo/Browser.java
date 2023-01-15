package com.GUI.EditorPaneDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Browser extends JFrame implements ActionListener {
    JLabel labelURL;
    JTextField textFieldURL;
    JButton buttonGo;
    JEditorPane editorPane;
    JScrollPane scrollPane;

    public Browser() {
        setLayout(null);
        setTitle("Java Browser");
        setSize(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        int vertical = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int horizontal = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

        labelURL = new JLabel("url: ");
        textFieldURL = new JTextField();
        buttonGo = new JButton("Go");
        editorPane = new JEditorPane();
        scrollPane = new JScrollPane((editorPane), vertical, horizontal);



        add(labelURL);
        labelURL.setBounds(10, 10, 30, 30);

        add(textFieldURL);
        textFieldURL.setBounds(45, 10, 675, 30);

        add(buttonGo);
        buttonGo.setBounds(720, 10, 50, 30);
        buttonGo.addActionListener(this);

//        add(editorPane);
//        editorPane.setBounds(10, 50, 760, 350);

        add(scrollPane);
        scrollPane.setBounds(10, 50, 760, 350);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == buttonGo) {
            try {
                editorPane.setContentType("text/html");
                editorPane.setPage(textFieldURL.getText().toLowerCase());
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Error");
                exception.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Browser();
    }
}
