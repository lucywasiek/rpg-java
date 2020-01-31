package com.rpg;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class TextView extends JPanel {

    private String text;

    private int x;

    private int y;

    public TextView(String text, int y, int x) {
        this.text = text;
        this.x = x;
        this.y = y;
    }

    //
    //
    //

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLACK);
        g.drawString(text, x, y);
    }

    //
    //
    //

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
