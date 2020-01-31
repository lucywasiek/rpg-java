package com.rpg.map;

import com.rpg.Coordinate;
import com.rpg.KeyControl;
import com.rpg.Player;
import com.rpg.TextView;
import com.rpg.Window;
import com.rpg.Window.Squares;
import java.util.ArrayList;
import java.util.List;


public class GameMap {

    public static final int X_MAX = 12; // end of my line 'x'
    public static final int Y_MAX = 12;

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
        for (int index = 0; index < X_MAX * Y_MAX; index++) {
            map.add(new EmptyTile());
        }

        setTileOnCoordinates(new HoleTile(), 9, 10);
        setTileOnCoordinates(new HoleTile(), 6, 9);
        setTileOnCoordinates(new HoleTile(), 5, 5);
        setTileOnCoordinates(new GoldenTile(), 5, 8);
        setTileOnCoordinates(new BushTile(), 2, 3);
        setTileOnCoordinates(new BushTile(), 3, 3);
        setTileOnCoordinates(new BushTile(), 10, 8);
        setTileOnCoordinates(new BushTile(), 2, 9);
        setTileOnCoordinates(new BushTile(), 7, 3);
        setTileOnCoordinates(new BushTile(), 7, 2);
        setTileOnCoordinates(new BushTile(), 4, 7);
        setTileOnCoordinates(new BushTile(), 5, 7);
        setTileOnCoordinates(new BushTile(), 2, 5);

        for (int y = 0; y < Y_MAX; y++) {
            setTileOnCoordinates(new WallTile(), y, X_MAX - 1);
            setTileOnCoordinates(new WallTile(), y, 0);
        }

        for (int x = 0; x < X_MAX; x++) {
            setTileOnCoordinates(new WallTile(), Y_MAX - 1, x);
            setTileOnCoordinates(new WallTile(), 0, x);
        }

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
       // return (y * X_MAX + Math.max(x - 1, 0));
        return(x + X_MAX * y);
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


            squares.addSquare(x * 62, y * 62, 60, 60, tile.getColor());
          //  System.out.print(tile.getCharacter());
            i++;
        }
        System.out.print("\n");
        System.out.print("\n");

        TextView hpTextView = new TextView("PLAYER 1 --> " + String.valueOf(player.getHp()) + " HP", 100, Window.WINDOW_WIDTH - 200);
        TextView rulesTextView = new TextView("RULES in README", 120, Window.WINDOW_WIDTH - 200);
        window.drawWindow(squares, hpTextView, rulesTextView);
    }

    public Player getPlayer() {
        return player;
    }
}
