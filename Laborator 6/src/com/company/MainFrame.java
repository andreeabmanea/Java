package com.company;

import javax.swing.*;

import java.awt.*;


public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame() {
        super("Geometry Drawing");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //create the components
        canvas = new DrawingPanel(this);


        //arrange the components in the container (frame)
        //JFrame uses a BorderLayout by default
        add(canvas, BorderLayout.CENTER); //this is BorderLayout.CENTER
        configPanel = new ConfigPanel(this);
        add(configPanel, BorderLayout.NORTH);
        controlPanel = new ControlPanel(this);
        add(controlPanel, BorderLayout.SOUTH);
        //invoke the layout manager
        pack();
    }
}