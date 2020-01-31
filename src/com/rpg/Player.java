package com.rpg;

import com.rpg.map.TileWithCoordinates;
import java.awt.Color;

public class Player implements TileWithCoordinates {

    private static final int DEFAULT_HP = 20;
    private Coordinate coordinate = new Coordinate(1, 2);

    private int hp = DEFAULT_HP;

    public int getHp() {
        return hp;
    }

    public void reduceHp(int hpReduce) {
        this.hp = hp - hpReduce;
    }

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
