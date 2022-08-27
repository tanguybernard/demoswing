package com.tbe.demoswing.windows;

import javax.swing.*;
import java.awt.*;

public class FenetreSaisie extends JFrame {
    private JTextField textField;
    private JLabel label;

    private JPanel buildContentPane(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        textField = new JTextField();

        panel.add(textField);

        label = new JLabel("Rien pour le moment");

        panel.add(label);

        return panel;
    }

    public JTextField getTextField(){
        return textField;
    }

    public JLabel getLabel(){
        return label;
    }
}