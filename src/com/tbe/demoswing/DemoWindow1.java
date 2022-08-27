package com.tbe.demoswing;

import javax.swing.*;

public class DemoWindow1 {

    public static void main(String[] args) {
        JFrame myWindow = new JFrame();

        myWindow.setSize(400,300);
        myWindow.setResizable(false);
        //click cross close window
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //center the widow relative to computer screen
        myWindow.setLocationRelativeTo(null);
        //display JFrame
        myWindow.setVisible(true);

    }


}
