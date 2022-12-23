import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame
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
        setVisible(true);
        setSize(600,600);
        menuBar.add(menuRecord);
            menuRecord.add(menuItemAdd);
            menuRecord.add(menuItemEdit);
            menuRecord.add(menuItemExit);
        menuBar.add(menuReport);
            menuReport.add(menuItemAll);
            menuReport.add(menuItemIndividual);
        menuBar.add(menuHelp);
            menuHelp.add(menuItemAbout);

    }
}
