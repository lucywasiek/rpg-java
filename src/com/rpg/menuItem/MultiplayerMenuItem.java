package com.rpg.menuItem;

public class MultiplayerMenuItem implements MenuItem {

    @Override
    public String getLabel() {

        return "MULTIPLAYER";
    }

    @Override
    public void select() {
        System.out.print("MultiplayerMenuItem: select");
    }
}
