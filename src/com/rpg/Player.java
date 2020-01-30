package com.rpg;

import com.rpg.map.TileWithCoordinates;
import java.awt.Color;

public class Player implements TileWithCoordinates {

    Coordinate coordinate = new Coordinate(0, 0);


    @Override
    public char getCharacter() {
        return 'P';
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }


    ///////////////////////////////// getters and setters

    public Coordinate getCoordinate() {
        return coordinate;
    }


    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
