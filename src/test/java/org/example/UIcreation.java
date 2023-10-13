package org.example;
import java.awt.*;

import javax.swing.*;




    public class UIcreation {

    public static void main(String args[]){
     JFrame frame = new JFrame("JFrame Example");

        JPanel panel = new JPanel(); panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFrame By Example" );
        JButton button = new JButton();

        panel.add(label);

        panel.add(button);
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setDefau1tC10seOperation(JFrame.EXIT ON CLOSE);
        frame.setVisible(true);

    }
    }