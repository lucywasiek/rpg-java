package com.rpg;

import java.awt.*;

public class Window extends Frame {


        Window(){

            Button b=new Button("click me");
            b.setBounds(30,100,80,30);// setting button position

            add(b);//adding button into frame
            setSize(300,300);//frame size 300 width and 300 height
            setLayout(null);//no layout now bydefault BorderLayout
            setVisible(true);//now frame willbe visible, bydefault not visible
            addKeyListener(new KeyControl());

            // Je demande à ce que ce soit ma fenetre qui intercepte les touches du clavier
            requestFocusInWindow();
        }
    }

