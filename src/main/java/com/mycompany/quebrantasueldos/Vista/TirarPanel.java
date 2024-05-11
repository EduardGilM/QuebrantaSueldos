/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;

import java.awt.*;
import java.awt.event.ActionListener;


public class TirarPanel extends JPanel{
    JButton jugar;
    ImagenPanel imagen1, imagen2, imagen3;
    JPanel pan, pan2, pan3;

    QuebrantaSueldosModelo model;

    public TirarPanel(QuebrantaSueldosModelo modelo)
    {   
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0, 0, 0, 0));
        
        this.model = modelo;

        imagen1 = new ImagenPanel(model,0);
        imagen2 = new ImagenPanel(modelo,1);
        imagen3 = new ImagenPanel(modelo,2);

        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(1,3));
        pan.setBackground(new Color(0, 0, 0, 0));
        pan.add(imagen1);
        pan.add(imagen2);
        pan.add(imagen3);

        this.add(pan, BorderLayout.CENTER);

        jugar = new JButton("Jugar");
        jugar.setBackground(new Color(200, 177, 128));
        jugar.setForeground(Color.WHITE);
        jugar.setBorder(new LineBorder(Color.BLACK, 3));
        jugar.setFont(new Font("Arial", Font.BOLD, 24));
        this.add(jugar, BorderLayout.SOUTH);

    }

    public void RepintarPanel1(){
        imagen1.RepintarPanel();
    }
    public void RepintarPanel2(){
        imagen2.RepintarPanel();
    }
    public void RepintarPanel3(){
        imagen3.RepintarPanel();
    }

    public boolean getCheck1(){
        return imagen1.getCheck();
    }

    public boolean getCheck2(){
        return imagen2.getCheck();
    }

    public boolean getCheck3(){
        return imagen3.getCheck();
    }

    public void deshabilitarChecks() {
        imagen1.check.setEnabled(false);
        imagen2.check.setEnabled(false);
        imagen3.check.setEnabled(false);
    }

    public void habilitarChecks() {
        imagen1.check.setEnabled(true);
        imagen2.check.setEnabled(true);
        imagen3.check.setEnabled(true);
    }

    public void SetActionListener(ActionListener listen){
        jugar.addActionListener(listen);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(966, super.getPreferredSize().height);
    }
    
    @Override
    public void doLayout() {
        super.doLayout();
        int width = getWidth() / 3;
        imagen1.setPreferredSize(new Dimension(width, imagen1.getPreferredSize().height));
        imagen2.setPreferredSize(new Dimension(width, imagen2.getPreferredSize().height));
        imagen3.setPreferredSize(new Dimension(width, imagen3.getPreferredSize().height));
    }
}
