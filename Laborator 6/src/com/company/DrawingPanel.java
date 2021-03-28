package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class DrawingPanel extends JPanel implements MouseListener {
    ArrayList<Shape> shapes; //we need this in order to implement a retained mode drawing
    ArrayList<Integer> coordX;
    ArrayList<Integer> coordY;
    Random rand = new Random();
    final MainFrame frame;
    final static int W = 1200, H = 590;
    private int oldX, oldY, newX, newY;
    int currentSize;
    BufferedImage image; //the offscreen image
    Graphics2D graphics; //the "tools" needed to draw in the image

    public DrawingPanel(MainFrame frame) {
        this.frame = frame; createOffscreenImage(); init();
    }
    private void createOffscreenImage() {
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        this.clearCanvas();
        shapes = new ArrayList<>();
    }

    public void clearCanvas() {
        graphics.setColor(Color.WHITE); //fill the image with white
        graphics.fillRect(0, 0, W, H);
        repaint();
    }

    private void init() {
        coordX = new ArrayList<>();
        coordY = new ArrayList<>();
        setPreferredSize(new Dimension(W, H));
        setBorder(BorderFactory.createEtchedBorder());
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    drawShape(e.getX(), e.getY());
                    repaint();
                }
                //if we click right on a shape, we delete it both from the canvas and memory
                if (e.getButton() == MouseEvent.BUTTON3 && e.getClickCount()==1) {
                    //we iterate through the array of shapes and if we detect a shape which has that point, we delete it
                    for (Shape shape : shapes)
                        if (shape.contains(e.getPoint())) {
                            graphics.setColor(Color.WHITE);
                            graphics.fill(shape);
                            shapes.remove(shape);
                            repaint();
                            break;
                        }
                }

                //if we detect the draw by hand mode, we get the initial coordinates of the mouse
                if (ConfigPanel.drawByHand == 1 && e.getButton() == MouseEvent.BUTTON1) {
                    oldX = e.getX();
                    oldY = e.getY();
                    coordX.add(oldX);
                    coordY.add(oldY);

                }
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                //we drag a line wherever our mouse gets dragged
                newX = e.getX();
                newY = e.getY();
                coordX.add(newX);
                coordY.add(newY);

                if (ConfigPanel.colorInput != null) {
                    setColor();
                }
                if (graphics != null) {
                    graphics.drawLine(oldX, oldY, newX, newY);
                    repaint();
                    oldX = newX;
                    oldY = newY;
                }
            }
        });

        //this was a try of line recognition, it draws a straight line from initial coordinates of the mouse to the last ones
        //(when it was released)
/*
        this.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e) {
                if (ConfigPanel.drawByHand == 1){
                    graphics.setColor(Color.BLACK);
                    graphics.drawLine(coordX.get(0), coordY.get(0), coordX.get(coordX.size()-1), coordY.get(coordY.size()-1));
                    coordX.clear();
                    coordY.clear();
                    }
                }
        });
*/
    }

    private void setColor(){
        if (ConfigPanel.colorInput != null) {
            switch (ConfigPanel.colorInput) {
                case "Cyan":
                    graphics.setColor(Color.CYAN);
                    break;
                case "Blue":
                    graphics.setColor(Color.BLUE);
                    break;
                case "Black":
                    graphics.setColor(Color.BLACK);
                    break;
                case "Red":
                    graphics.setColor(Color.RED);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + ConfigPanel.colorInput);
            }
        }
    }

    private void setSize() {
        //we check what size has been picked
        if (ConfigPanel.sizeInput != null) {
            switch (ConfigPanel.sizeInput) {
                case 1:
                    currentSize = 40;
                    break;
                case 2:
                    currentSize = 50;
                    break;
                case 3:
                    currentSize = 60;
                    break;
                case 4:
                    currentSize = 70;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + ConfigPanel.sizeInput);
            }
        }
    }

    private void drawShape(int x, int y) {
        int radius = rand.nextInt(100); //generate a random number
        Shape newShape = null;
        setColor();
        setSize();

        if (ConfigPanel.input != null) {
            int sides = ConfigPanel.input;
            Color color = new Color(1f, 0f, 0f, .5f); //create a transparent random Color.
            graphics.setColor(color);
            newShape = new RegularPolygon(x, y, radius, sides);
            graphics.fill(newShape);
            //each time we draw a new shape, we add it to the list, so we can manipulate them
            shapes.add(newShape);
            ConfigPanel.input = null;

        }
        //if the user selects a predefined shape
        if (ConfigPanel.shapeInput != null) {
            String predefinedShape = ConfigPanel.shapeInput;
            if (predefinedShape.compareTo("Square") == 0) {
                graphics.drawRect(x, y, currentSize, currentSize);
                graphics.fillRect(x, y, currentSize, currentSize);
            }
            else {
                graphics.drawOval(x, y, currentSize, currentSize);
                graphics.fillOval(x, y, currentSize, currentSize);
            }
            ConfigPanel.shapeInput = null;
        }
        System.out.println(shapes);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}