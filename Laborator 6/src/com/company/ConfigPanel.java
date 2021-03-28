package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ConfigPanel extends JPanel implements ActionListener {
    final MainFrame frame;
    JLabel sidesLabel;
    JSpinner sidesField;
    JLabel typeLabel;
    JSpinner availableShapes;
    JLabel sizeLabel;
    JSpinner selectSize;
    JLabel colorLabel;
    JSpinner selectColor;
    String[] shapes;
    String[] colors;

    static Integer input;
    static String shapeInput;
    static Integer sizeInput;
    static String colorInput;
    static Integer drawByHand;
    Button button;
    Button secondButton;
    Button freeDrawing;
    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //insert the hand drawing mode
        freeDrawing = new Button("Free Drawing");
        add(freeDrawing);
        freeDrawing.addActionListener(this::setFreeDrawing);
        //create the label and the spinner
        sidesLabel = new JLabel("Number of sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(3, 3, 100, 1));
        button = new Button("OK");

        add(sidesLabel); //JPanel uses FlowLayout by default
        add(sidesField);
        add(button);
        button.addActionListener(this::enterSides);

        //support for drawing predefined shapes
        typeLabel = new JLabel("Draw a:");
        add(typeLabel);
        shapes = new String[]{"Circle", "Square"};
        availableShapes = new JSpinner(new SpinnerListModel(Arrays.asList(shapes)));
        add(availableShapes);
        secondButton = new Button("OK");
        add(secondButton);
        secondButton.addActionListener(this::enterShape);

        sizeLabel = new JLabel("Pick a size:");
        add(sizeLabel);
        selectSize = new JSpinner(new SpinnerNumberModel(1, 1, 4, 1));
        add(selectSize);
        Button confirmSize = new Button("OK");
        add(confirmSize);
        confirmSize.addActionListener(this::setSize);

        colorLabel = new JLabel("Pick a color:");
        add(colorLabel);
        colors = new String[]{"Cyan", "Blue", "Red", "Black"};
        selectColor = new JSpinner(new SpinnerListModel(Arrays.asList(colors)));
        add(selectColor);
        Button confirmColor = new Button("OK");
        add(confirmColor);
        confirmColor.addActionListener(this::setColor);


    }

    public void setFreeDrawing(ActionEvent e) {
        drawByHand = 1;
    }

    public void enterSides(ActionEvent e) {
       input = (Integer)sidesField.getValue();

    }

    public void enterShape(ActionEvent e){
        shapeInput = availableShapes.getValue().toString();
    }

    public void setSize(ActionEvent e){
        sizeInput = (Integer) selectSize.getValue();
    }

    public void setColor(ActionEvent e){
        colorInput = selectColor.getValue().toString();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
