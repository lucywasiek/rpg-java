package com.rpg;

public class Coordinate {
    public int x;
    public int y;



    public Coordinate(int y, int x) {
        this.x = x;
        this.y = y;
    }

    //ici le copy constructor, le constructor aui recoit le meme type que lui-meme pour copier les infos
    public Coordinate(Coordinate coordinate) {
        this.y = coordinate.y;
        this.x = coordinate.x;
    }
}
