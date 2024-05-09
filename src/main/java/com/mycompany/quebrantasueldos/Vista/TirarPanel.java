/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;

import java.awt.*;


public class TirarPanel extends JPanel{
    JButton jugar;
    ImagenPanel imagen1, imagen2, imagen3;
    JPanel pan, pan2, pan3;
    
    QuebrantaSueldosModelo model;

    public TirarPanel(QuebrantaSueldosModelo modelo)
    {   
        this.setLayout(new BorderLayout());
        this.model = modelo;

        imagen1 = new ImagenPanel(model,0);
        imagen2 = new ImagenPanel(modelo,1);
        imagen3 = new ImagenPanel(modelo,2);

        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(2,3));
        pan.add(imagen1);
        pan.add(imagen2);
        pan.add(imagen3);
        pan.add(new JLabel(""));
        pan.add(new JLabel(""));
        pan.add(new JLabel(""));
        this.add(pan, BorderLayout.CENTER);

        jugar = new JButton("Jugar");
        jugar.setBackground(Color.RED);
        jugar.setForeground(Color.WHITE);
        jugar.setFont(new Font("Arial", Font.BOLD, 24));
        this.add(jugar, BorderLayout.SOUTH);

    }
}
