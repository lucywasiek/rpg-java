package com.rpg.map;

import java.awt.Color;

public class HoleTile implements Tile {

    @Override
    public char getCharacter() {
        return ' ';
    }

    @Override
    public Color getColor() {
        return Color.BLACK;
    }
}
