package com.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColourChooserDemo extends JFrame implements ActionListener {
    JButton button = new JButton("Colour");
    public ColourChooserDemo() {
        setLayout(new FlowLayout());
        setTitle("Colour chooser");
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color init = Color.BLUE;
        Color colour = JColorChooser.showDialog(this, "Choose a colour", init);
        button.setBackground(colour);
    }

    public static void main(String[] args) {
            new ColourChooserDemo();
    }
}
