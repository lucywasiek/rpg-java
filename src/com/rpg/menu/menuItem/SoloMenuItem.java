package com.rpg.menu.menuItem;

import com.rpg.map.GameMap;

public class SoloMenuItem implements MenuItem {

    @Override
    public String getLabel() {

        return "SOLO";
    }

    @Override
    public void select() {
        GameMap game = new GameMap();
        game.display();
    }
}
