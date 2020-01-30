package com.rpg;

import com.rpg.map.GameMap;
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

    static final int SQUARE_WIDTH = 1200;
    static final int SQUARE_HEIGHT = 1200;

    Window() {
        Squares squares = new Squares();
        getContentPane().add(squares);

        GameMap gameMap = new GameMap();

        gameMap.display(squares);
//        for (int i = 0; i < 10; i++) {
//           squares.addSquare(i * 60, i * 60, 60, 60);
//        }

        pack();


        setSize(SQUARE_WIDTH, SQUARE_HEIGHT);
        setLayout(null);//no layout now bydefault BorderLayout
        setVisible(true);//now frame willbe visible, bydefault not visible
        addKeyListener(new KeyControl());

        // Je demande à ce que ce soit ma fenetre qui intercepte les touches du clavier
        requestFocusInWindow();
    }

    public class Squares extends JPanel {
        private static final int PREF_W = SQUARE_WIDTH;
        private static final int PREF_H = PREF_W;
        private List<Rectangle> squares = new ArrayList<Rectangle>();
        private List<Color> colors = new ArrayList<>();

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

            int index = 0;
            for (Rectangle rect : squares) {
                g2.setColor(colors.get(index));
//                g2.draw(rect);
                g2.fill(rect);
                index++;
            }
        }

    }

}