package com.rpg.map;

import java.util.ArrayList;
import java.util.List;


public class GameMap {

    final int X_MAX = 20; // end of my line 'x'
    final int Y_MAX = 10;

    List<Tile> map = new ArrayList<>();

    public GameMap() {
        for (int index = 0; index < X_MAX * Y_MAX; index++){
            map.add(new EmptyTile());
        }
        setTileOnCoordinates(new BushTile(), 1, 2);
        setTileOnCoordinates(new BushTile(), 2, 2);
        setTileOnCoordinates(new BushTile(), 3, 2);

    }

    public void setTileOnCoordinates(Tile tile, int y, int x) {
        map.set(getIndexForCoordinate(y, x), tile);
    }

    public int getIndexForCoordinate(int y, int x) {
        return (y * X_MAX + x) - 1;
    }


    public void display(){

        int i = 0;

        for (Tile tile : map){

            if ((i % X_MAX) == 0 && i != 0){
                System.out.print("\n");
            }
            System.out.print(tile.getCharacter());
            i++;
        }

        // display the map with outer walls
        // - display tile.getCharacter()

        // display the player
    }

}
