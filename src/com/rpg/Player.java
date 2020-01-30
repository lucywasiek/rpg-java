package com.rpg;

import com.rpg.map.TileWithCoordinates;
import java.awt.Color;

public class Player implements TileWithCoordinates {

    private Coordinate coordinate = new Coordinate(0, 0);


    @Override
    public char getCharacter() {
        return 'P';
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }

    public void moveUp() {
        //player move to the upper case
        coordinate.y = coordinate.y - 1;
    }

    public void moveLeft(){
        coordinate.x = coordinate.x - 1;
    }

    public void moveRight(){
        coordinate.x = coordinate.x + 1;
    }

    public void moveDown(){
        coordinate.y = coordinate.y + 1;
    }

    ///////////////////////////////// getters and setters

    public Coordinate getCoordinate() {
        return coordinate;
    }


    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void debugCoordinates() {
        System.out.println(coordinate.y + "." + coordinate.x);
    }
}
