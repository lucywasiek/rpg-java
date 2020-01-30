package com.rpg.map;

import com.rpg.Coordinate;
import com.rpg.Player;
import com.rpg.Window;
import java.util.ArrayList;
import java.util.List;


public class GameMap {

    final int X_MAX = 12; // end of my line 'x'
    final int Y_MAX = 10;

    Player player = new Player();

    List<Tile> map = new ArrayList<>();

    public GameMap() {
        for (int index = 0; index < X_MAX * Y_MAX; index++){
            map.add(new EmptyTile());
        }

        setTileOnCoordinates(player);
        setTileOnCoordinates(new BushTile(), 1, 2);
        setTileOnCoordinates(new BushTile(), 2, 2);
        setTileOnCoordinates(new BushTile(), 3, 2);

    }

    private void setTileOnCoordinates(TileWithCoordinates tile) {
        setTileOnCoordinates(tile, tile.getCoordinate());
    }

    private void setTileOnCoordinates(Tile tile, Coordinate coordinate) {
        setTileOnCoordinates(tile, coordinate.y, coordinate.x);
    }

    public void setTileOnCoordinates(Tile tile, int y, int x) {
        map.set(getIndexForCoordinate(y, x), tile);
    }

    public int getIndexForCoordinate(int y, int x) {
        return (y * X_MAX + Math.max(x - 1, 0));
    }


    public void display(Window.Squares squares) {

        int i = 0;

        for (Tile tile : map) {

            if ((i % X_MAX) == 0 && i != 0){
                System.out.print("\n");
            }
            int y = i / X_MAX;
            int x = i % X_MAX;

            squares.addSquare(x * 65, y * 65, 60, 60, tile.getColor());
            System.out.print(tile.getCharacter());
            i++;
        }

        // display the map with outer walls
        // - display tile.getCharacter()

        // display the player
    }

}
