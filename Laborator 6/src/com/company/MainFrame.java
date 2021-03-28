package com.company;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ItemEvent;


public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;
    DrawingPanel secondCanvas;
    DrawingPanel mainPanel;


    public MainFrame() {
        super("Geometry Drawing");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //create the components

        canvas = new DrawingPanel(this);
        add(canvas, BorderLayout.CENTER);
        configPanel = new ConfigPanel(this);
        add(configPanel, BorderLayout.NORTH);
        controlPanel = new ControlPanel(this);
        add(controlPanel, BorderLayout.SOUTH);

        pack();
    }

}