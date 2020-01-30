package com.rpg.map;

import java.util.ArrayList;
import java.util.List;


public class GameMap {

    final int X_MAX = 10; // end of my line 'x'

    public void display(){

        List<Tile> map = new ArrayList<>();

        map.add(new EmptyTile()); // 0.0
        map.add(new EmptyTile()); // 0.1
        map.add(new EmptyTile()); // 1.0
        map.add(new EmptyTile()); // 1.1
        map.add(new EmptyTile()); // 2.0
        map.add(new EmptyTile()); // 2.1


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
