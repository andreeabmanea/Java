package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigPanel extends JPanel implements ActionListener {
    final MainFrame frame;
    JLabel sidesLabel; // we’re drawing regular polygons
    JSpinner sidesField; // number of sides
    JComboBox colorCombo; // the color of the shape
    JTextField text;
    JPanel panel;
    static Integer input;
    Button button;
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //create the label and the spinner
        sidesLabel = new JLabel("Number of sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        button = new Button("Submit");
        sidesField.setValue(3); //default number of sides

        //create the colorCombo, containing the values: Random and Black
        add(sidesLabel); //JPanel uses FlowLayout by default
        add(sidesField);
        add(button);
        button.addActionListener(this);
        //add(colorCombo);

    }

    public void actionPerformed(ActionEvent e){
       input = (Integer)sidesField.getValue();
    }
}
