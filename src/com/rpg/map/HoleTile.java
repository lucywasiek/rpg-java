package com.rpg.map;

import java.awt.Color;

public class HoleTile implements Tile {

    @Override
    public char getCharacter() {
        return 'o';
    }

    @Override
    public Color getColor() {
        return Color.BLACK;
    }
}
