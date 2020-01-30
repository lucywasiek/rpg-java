package com.rpg;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent key) {

            int codeDeLaTouche = key.getKeyCode();

            switch (codeDeLaTouche) // Les valeurs sont contenue dans KeyEvent. Elles commencent par VK_ et finissent par le nom de la touche
            {
                case KeyEvent.VK_UP: // si la touche enfoncée est celle du haut
                    System.out.println("going up");
                    break;
                case KeyEvent.VK_LEFT: // si la touche enfoncée est celle de gauche
                    System.out.println("going left");
                    break;
                case KeyEvent.VK_RIGHT: // si la touche enfoncée est celle de droite
                    System.out.println("going right");
                    break;
                case KeyEvent.VK_DOWN: // si la touche enfoncée est celle du bas
                    System.out.println("going down");
                    break;
            }
        }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
