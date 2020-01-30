package com.rpg.map;

import com.rpg.Coordinate;
import com.rpg.KeyControl;
import com.rpg.Player;
import com.rpg.Window;
import com.rpg.Window.Squares;
import java.util.ArrayList;
import java.util.List;


public class GameMap {

    final int X_MAX = 12; // end of my line 'x'
    final int Y_MAX = 10;

    private final Window window;

    Player player = new Player();

    List<Tile> map = new ArrayList<>();

    public GameMap() {
        KeyControl keyControl = new KeyControl(player, this);
        this.window = new Window(keyControl);

        this.display();
    }

    public void createMap() {
        map = new ArrayList<>();
        for (int index = 0; index < X_MAX * Y_MAX; index++){
            map.add(new EmptyTile());
        }

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

    public Tile getTileForCoordinates(Coordinate coordinate) {

       int index = getIndexForCoordinate(coordinate.y, coordinate.x);
       return map.get(index);
    }

    public void display() {
        Squares squares = new Window.Squares();

        createMap();

        setTileOnCoordinates(player);

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
        System.out.print("\n");
        System.out.print("\n");

        window.drawWindow(squares);
    }

    public Player getPlayer() {
        return player;
    }
}
