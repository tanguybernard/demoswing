package com.tbe.demoswing.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatriceFenetre extends JFrame implements ActionListener {

    private JButton bouton;

    private JButton bouton2;

    private JTextField field1;
    private JTextField field2;
    private JLabel label;


    public CalculatriceFenetre(){
        super();

        build();//On initialise notre fenêtre
    }

    private void build(){
        setTitle("Calculatrice"); //On donne un titre à l'application
        setSize(400,200); //On donne une taille à notre fenêtre
        setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
        setResizable(false); //On interdit la redimensionnement de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix

        setContentPane(buildContentPane());
    }


    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(255, 173, 173));

        /*
        JButton bouton = new JButton("Cliquez ici !");
        bouton.addActionListener(this);
        panel.add(bouton);
        */


        field1 = new JTextField();
        field1.setColumns(10);

        panel.add(field1);

        field2 = new JTextField();
        field2.setColumns(10);

        panel.add(field2);

        JButton bouton = new JButton(new CalculAction(this, "Calculer"));

        panel.add(bouton);

        label = new JLabel("Résultat : Pas encore calculé");

        panel.add(label);

        return panel;
    }


    public void actionPerformed(ActionEvent event){
        Object source = event.getSource();

        if(source == bouton){
            System.out.println("Vous avez cliqué ici.");
        } else if(source == bouton2){
            System.out.println("Vous avez cliqué là.");
        }
    }

    public JTextField getField1(){
        return field1;
    }

    public JTextField getField2(){
        return field2;
    }

    public JLabel getLabel(){
        return label;
    }

}
