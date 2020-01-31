package com.rpg;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

    public static final int WINDOW_WIDTH = 1200;
    public static final int WINDOW_HEIGHT = 1200;

    public Window(KeyControl keyControl) {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        addKeyListener(keyControl);

//        setLayout(null);//no layout now bydefault BorderLayout

        // Je demande à ce que ce soit ma fenetre qui intercepte les touches du clavier
        requestFocusInWindow();
    }

    public void drawWindow(Squares squares, TextView textView, TextView textView2) {
        Container container = getContentPane();
        container.removeAll();

        squares.addText(textView, textView2);

        container.add(squares);

        setVisible(true);//now frame willbe visible, bydefault not visible

//        pack();
//        setSize(Window.WINDOW_WIDTH, Window.WINDOW_HEIGHT);
//        setVisible(true);
//
//        Container.removeAll();
//        container.add(squares);
//        squares.paint(container.getGraphics());
//        container.invalidate();

          container.validate();
//        container.doLayout();

    }

    public static class Squares extends JPanel {
        private static final int PREF_W = WINDOW_HEIGHT;//1200;//
        private static final int PREF_H = WINDOW_HEIGHT;//1200;//GameMap.Y_MAX * 62;

        private List<Rectangle> squares = new ArrayList<Rectangle>();
        private List<Color> colors = new ArrayList<>();
        private TextView textView;
        private TextView textView2;

//        public void reset() {
//            this.squares = new ArrayList<>();
//            this.colors = new ArrayList<>();
//            this.getRootPane().invalidate();
//        }

        public void addSquare(int x, int y, int width, int height, Color color) {
            this.colors.add(color);
            Rectangle rect = new Rectangle(x, y, width, height);

            squares.add(rect);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(PREF_W, PREF_H);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.clearRect(0,0, PREF_W, PREF_H);
//            g2.clearRect(0,0, 1000, 1000);
            int index = 0;
            for (Rectangle rect : squares) {
                g2.setColor(colors.get(index));
//                g2.draw(rect);
                g2.fill(rect);
                index++;
            }

            this.textView.paint(g);
            this.textView2.paint(g);
        }

        public void addText(TextView textView, TextView textView2) {
            this.textView = textView;
            this.textView2 = textView2;
        }
    }

}