package com.tbe.demoswing.windows;

import javax.swing.*;

public class Window2 extends JFrame {
    public Window2(){
        setTitle("Ma Premiere Fenetre Swing");
        setSize(400,300);
        setResizable(false);
        //click cross close window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //center the widow relative to computer screen
        setLocationRelativeTo(null);
    }

}
