/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quebrantasueldos.Vista;


import javax.swing.*;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;

import java.awt.*;
public class JuegoVista extends JFrame{
    private EstadoPanel estadoPanel;
    private TragaPerrasMenuBar menu;
    private TirarPanel tirarPanel;
    
    public JuegoVista(QuebrantaSueldosModelo modelo){
        super("Ventanta de Juego");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        
        //Paneles
        estadoPanel = new EstadoPanel();
        menu = new TragaPerrasMenuBar();
        tirarPanel = new TirarPanel(modelo);
        
        this.setJMenuBar(menu);
        add(tirarPanel,BorderLayout.CENTER);
        add(estadoPanel,BorderLayout.SOUTH);
        
        
        
        this.setVisible(true);
    }
    
    public void abrirVentana(){
        this.setVisible(true);
    }
    
    public void cerrarVentana(){
        this.dispose();
    }
}
