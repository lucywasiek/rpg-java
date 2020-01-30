package com.rpg;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {


    Window() {
        Squares squares = new Squares();

        getContentPane().add(squares);
        for (int i = 0; i < 15; i++) {
           squares.addSquare(i * 100, i * 100, 100, 100);
        }

        pack();

        Button b = new Button("click me");
        b.setBounds(30, 100, 80, 30);// setting button position

        add(b);//adding button into frame
        setSize(800, 800);//frame size 300 width and 300 height
        setLayout(null);//no layout now bydefault BorderLayout
        setVisible(true);//now frame willbe visible, bydefault not visible
        addKeyListener(new KeyControl());

        // Je demande à ce que ce soit ma fenetre qui intercepte les touches du clavier
        requestFocusInWindow();
    }

    class Squares extends JPanel {
        private static final int PREF_W = 500;
        private static final int PREF_H = PREF_W;
        private List<Rectangle> squares = new ArrayList<Rectangle>();

        public void addSquare(int x, int y, int width, int height) {
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
            for (Rectangle rect : squares) {
                g2.setColor(Color.BLUE);
//                g2.draw(rect);
                g2.fill(rect);
            }
        }

    }

}