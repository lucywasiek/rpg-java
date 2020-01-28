package com.rpg.menuItem;

public class ExitMenuItem implements MenuItem {

    @Override
    public String getLabel() {

        return "EXIT";
    }

    @Override
    public void select() {
        System.exit(0);
    }
}
