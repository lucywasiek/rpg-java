package com.rpg;

import com.rpg.map.Tile;
import com.rpg.map.TileWithCoordinates;

public class Player implements TileWithCoordinates {

    Coordinate coordinate = new Coordinate(0, 0);


    @Override
    public char getCharacter() {
        return 'P';
    }


    ///////////////////////////////// getters and setters

    public Coordinate getCoordinate() {
        return coordinate;
    }


    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
