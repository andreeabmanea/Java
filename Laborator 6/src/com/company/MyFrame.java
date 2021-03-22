package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener {
    String title;
    JLabel label;
    JPanel panel;
    JTextField text;

    public MyFrame(String title){
        this.title = title;
        panel = new JPanel();
        setTitle(title);
        setLayout(new FlowLayout());
        setSize(1000,800);
        setVisible(true);

    };

    public void addConfigurationPanel() {

        text = new JTextField(10);
        label = new JLabel("Size");
        panel.add(label);
        panel.add(text);

        text = new JTextField(10);
        label = new JLabel("Number of sides");
        panel.add(label);
        panel.add(text);

        text = new JTextField(10);
        label = new JLabel("Stroke");
        panel.add(label);
        panel.add(text);

        add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
