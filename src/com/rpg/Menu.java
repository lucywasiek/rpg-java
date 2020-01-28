package com.rpg;

import com.rpg.menuItem.ExitMenuItem;
import com.rpg.menuItem.MenuItem;
import com.rpg.menuItem.MultiplayerMenuItem;
import com.rpg.menuItem.SoloMenuItem;

import java.util.ArrayList;

public class Menu {

    void display() {

        // create an array of item and list them
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add( new SoloMenuItem());
        menuItems.add(new MultiplayerMenuItem());
        menuItems.add(new ExitMenuItem());

        // loop every element of my array of items
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getLabel());
        }

    }


}
