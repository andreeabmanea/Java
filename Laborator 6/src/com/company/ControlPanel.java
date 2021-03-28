package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static com.company.DrawingPanel.H;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    File file;
    Scanner fileIn;
    JFileChooser chooser = new JFileChooser();
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //we set where our images will be saved or load

        setLayout(new GridLayout(1, 5));
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);

        //configure listeners for all buttons
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);

    }


    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "PNG", new File("C:\\Users\\andre\\Laborator 6\\test.png"));
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    private void load(ActionEvent e) {
        int response;
        chooser = new JFileChooser(".");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        response = chooser.showOpenDialog(null);
        if (response == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            if (file.isFile()) {
                try {
                    fileIn = new Scanner(file);
                } catch (FileNotFoundException exception) {
                }
            }
        }
    }

    private void reset(ActionEvent e) {
        frame.canvas.clearCanvas();
    }
}

