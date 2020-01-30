package com.rpg.map;

import java.awt.Color;

public class EmptyTile implements Tile {

    @Override
    public char getCharacter() {
        return '*';
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }
}
