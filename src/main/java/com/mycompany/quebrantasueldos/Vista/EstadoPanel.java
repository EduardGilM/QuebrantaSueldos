/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class EstadoPanel extends JPanel{
    private JCheckBox check;
    private JLabel etiqueta, et_saldo, et_puntos;
    private JTextField saldo,puntos;
    private JButton saldo_boton;
    
    public EstadoPanel(){
    
    this.setBorder(new CompoundBorder(new EmptyBorder(0,10,5,5),new LineBorder(Color.GRAY, 1) ));
    
    
    //Variables
    check = new JCheckBox();
    etiqueta = new JLabel("Asistente");
    
    et_saldo = new JLabel("Saldo: ");
    saldo = new JTextField();
    saldo.setPreferredSize(new Dimension(200, 30));
    saldo_boton = new JButton("Ingresar"); // AñDIR un listener a este boton.
    
    et_puntos = new JLabel("Puntos: ");
    puntos = new JTextField();
    puntos.setPreferredSize(new Dimension(200, 30));
    puntos.setEditable(false);
    
    
    this.add(check);
    this.add(etiqueta);
    
    this.add(Box.createHorizontalStrut(50));
    
    this.add(et_saldo);
    this.add(saldo);
    this.add(saldo_boton);
    
    this.add(Box.createHorizontalStrut(50));
    
    this.add(et_puntos);
    this.add(puntos);
    }

}
