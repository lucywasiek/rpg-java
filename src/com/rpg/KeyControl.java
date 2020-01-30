package com.rpg;


import com.rpg.map.BushTile;
import com.rpg.map.GameMap;
import com.rpg.map.HoleTile;
import com.rpg.map.Tile;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl implements KeyListener {

    Player player = null;
    GameMap gameMap = null;


    public KeyControl(Player player, GameMap gameMap) {
        this.player = player;
        this.gameMap = gameMap;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent key) {

            int codeDeLaTouche = key.getKeyCode();
                //creer un objet new coordinate = player.coordinate (voir; copy constructor)

            Coordinate backupCoordinate = new Coordinate(player.getCoordinate());

            switch (codeDeLaTouche) // Les valeurs sont contenue dans KeyEvent. Elles commencent par VK_ et finissent par le nom de la touche
            {
                case KeyEvent.VK_UP: // si la touche enfoncée est celle du haut
                    player.moveUp();

                    //System.out.println("going up");
                    break;
                case KeyEvent.VK_LEFT: // si la touche enfoncée est celle de gauche
                    player.moveLeft();
                    break;
                case KeyEvent.VK_RIGHT: // si la touche enfoncée est celle de droite
                    player.moveRight();
                    break;
                case KeyEvent.VK_DOWN: // si la touche enfoncée est celle du bas
                    player.moveDown();
                    break;
            }
            player.debugCoordinates();

            //recuperer les coordinates du player
            Coordinate coordinate = player.getCoordinate();

            //recupere la tile des coordinates du player
        Tile tile = gameMap.getTileForCoordinates(coordinate);

            //si la tile c'est un bush -> remettre les anciennes coordinates
        if (tile instanceof BushTile) {
            player.setCoordinate(backupCoordinate);
        }
            //si la tile c'est un trou -> tu perds

        if (tile instanceof HoleTile) {
           System.out.println("LOOSER !!");
           System.exit(0);
        }


            gameMap.display();
        }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
