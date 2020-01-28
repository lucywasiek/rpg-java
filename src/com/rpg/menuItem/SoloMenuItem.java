package com.rpg.menuItem;

public class SoloMenuItem implements MenuItem {

    @Override
    public String getLabel() {

        return "SOLO";
    }

    @Override
    public void select() {
        System.out.println("SoloMenuItem: select");
    }
}
