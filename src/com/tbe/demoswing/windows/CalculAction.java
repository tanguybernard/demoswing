package com.tbe.demoswing.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalculAction extends AbstractAction {
    private CalculatriceFenetre fenetre;

    public CalculAction(CalculatriceFenetre fenetre, String texte){
        super(texte);

        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {

        try {
            Integer nb1  = Integer.parseInt(this.fenetre.getField1().getText());
            Integer nb2  = Integer.parseInt(this.fenetre.getField2().getText());
            this.fenetre.getLabel().setText("Resultat: "+(nb1+nb2));
        } catch (final NumberFormatException exception) {
            this.fenetre.getLabel().setText("Un probleme est survenu");
        }





    }
}