package com.tbe.demoswing;

import com.tbe.demoswing.windows.CalculatriceFenetre;

import javax.swing.*;

public class Calculatrice {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                CalculatriceFenetre fenetre = new CalculatriceFenetre();
                fenetre.setVisible(true);
            }
        });
    }
}
