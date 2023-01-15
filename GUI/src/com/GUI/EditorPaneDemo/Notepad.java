package com.GUI.EditorPaneDemo;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Notepad extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuHelp;

//    for menuFile
    JMenuItem menuItemNew, menuItemOpen, menuItemSave, menuItemExit;
//    for menuEdit
    JMenuItem menuItemEdit1, menuItemEdit2;
//    for menuHelp
    JMenuItem menuItemHelp1;

    JEditorPane editorPane;
    JScrollPane scrollPane;

    JFileChooser fileChooser;


    public Notepad() {
        setLayout(null);
        setTitle("Java Notepad");
        setSize(800, 450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
            menuFile = new JMenu("File");
                menuItemNew = new JMenuItem("New");
                menuItemOpen = new JMenuItem("Open");
                menuItemSave = new JMenuItem("Save");
                menuItemExit = new JMenuItem("Exit");
            menuEdit = new JMenu("Edit");
                menuItemEdit1 = new JMenuItem("Edit1");
                menuItemEdit2 = new JMenuItem("Edit2");
            menuHelp = new JMenu("Help");
                menuItemHelp1 = new JMenuItem("Help1");

        editorPane = new JEditorPane();
//        scrollPane = new JScrollPane((editorPane), ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());


        setJMenuBar(menuBar);
        menuBar.add(menuFile);
            menuFile.add(menuItemNew);
                menuItemNew.addActionListener(this);
            menuFile.add(menuItemOpen);
                menuItemOpen.addActionListener(this);
            menuFile.add(menuItemSave);
                menuItemSave.addActionListener(this);
            menuFile.add(menuItemExit);
                menuItemExit.addActionListener(this);
        menuBar.add(menuEdit);
            menuEdit.add(menuItemEdit1);
            menuEdit.add(menuItemEdit2);
        menuBar.add(menuHelp);
            menuHelp.add(menuItemHelp1);

        add(editorPane);
        editorPane.setBounds(0, 0, 800, 450);

//        add(scrollPane);
//        scrollPane.setBounds(0, 0, 760, 390);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == menuItemNew) {
            editorPane.setText("");
        }
        if (actionEvent.getSource() == menuItemOpen) {
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = fileChooser.getSelectedFile();
                    editorPane.setPage(file.toURI().toURL());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error");
                    exception.printStackTrace();
                }
            }
        }
        if (actionEvent.getSource() == menuItemSave) {
            int result = fileChooser.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    File file;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (actionEvent.getSource() == menuItemExit) {

        }
    }

    public static void main(String[] args) {
        new Notepad();
    }
}
