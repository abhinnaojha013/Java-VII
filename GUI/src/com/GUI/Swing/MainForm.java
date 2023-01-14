package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame implements ActionListener
{
    JMenuBar menuBar;
    JMenu menuRecord, menuReport, menuHelp;

//    for menuRecord
    JMenuItem menuItemAdd, menuItemEdit, menuItemExit;
//    for menuReport
    JMenuItem menuItemAll, menuItemIndividual;
//    for menuExit
    JMenuItem menuItemAbout;




    public MainForm()
    {
        setVisible(true);
        setSize(600,600);

        menuBar = new JMenuBar();
            menuRecord = new JMenu("Record operation");
                menuItemAdd = new JMenuItem("Add new record");
                menuItemEdit = new JMenuItem("Edit record");
                menuItemExit = new JMenuItem("Exit");
            menuReport = new JMenu("Report");
                menuItemAll = new JMenuItem("View all record");
                menuItemIndividual = new JMenuItem("View particular record");
            menuHelp = new JMenu("Help");
                menuItemAbout = new JMenuItem("About");

        setJMenuBar(menuBar);

        menuBar.add(menuRecord);
            menuRecord.add(menuItemAdd);
                menuItemAdd.addActionListener(this);
            menuRecord.add(menuItemEdit);
                menuItemEdit.addActionListener(this);
            menuRecord.add(menuItemExit);
        menuBar.add(menuReport);
            menuReport.add(menuItemAll);
                menuItemAll.addActionListener(this);
            menuReport.add(menuItemIndividual);
                menuItemIndividual.addActionListener(this);
        menuBar.add(menuHelp);
            menuHelp.add(menuItemAbout);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == menuItemAdd) {
            new AddRecords();
        }
        if (actionEvent.getSource() == menuItemEdit) {
            new ModifyRecord();
        }
        if (actionEvent.getSource() == menuItemAll) {
            new AllRecords();
        }
        if (actionEvent.getSource() == menuItemIndividual) {
            new SearchAndView();
        }
    }
}
