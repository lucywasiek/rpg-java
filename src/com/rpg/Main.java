package com.rpg;

import com.rpg.map.GameMap;
import com.rpg.menu.Menu;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.display();
        menu.selectMenuItem();

//        SoloMenuItem soloMenuItem = new SoloMenuItem();
//        soloMenuItem.select();


        GameMap gameMap = new GameMap();




    }
}
