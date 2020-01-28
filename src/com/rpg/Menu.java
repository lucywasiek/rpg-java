package com.rpg;

import com.rpg.menuItem.ExitMenuItem;
import com.rpg.menuItem.MenuItem;
import com.rpg.menuItem.MultiplayerMenuItem;
import com.rpg.menuItem.SoloMenuItem;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        // create an array of item and list them
        menuItems.add(new SoloMenuItem());
        menuItems.add(new MultiplayerMenuItem());
        menuItems.add(new ExitMenuItem());
    }


    void display() {
        // loop every element of my array of items
        int index = 1;
        for (MenuItem menuItem : menuItems) {
            System.out.println(index + " - " + menuItem.getLabel());
            index++;
        }

    }

    void selectMenuItem() {
        System.out.println("Choose an option");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= menuItems.size() && number > 0) {
            MenuItem menuItem = menuItems.get(number - 1);
            menuItem.select();
        }
        else {
            System.out.println("This option doesn't exist");
        }

     //   if (number == 1) {
       //     BufferedReader reader = new BufferedReader( new FileInputStream("map.txt"));
         //   String Line = reader.readLine();
       // }

    }
}
