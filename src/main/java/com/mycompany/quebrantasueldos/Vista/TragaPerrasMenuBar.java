/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quebrantasueldos.Vista;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TragaPerrasMenuBar extends JMenuBar{
    
    private JMenu ventanas, ayuda;
    private JMenuItem configuracion, juego, ranking ,salir, acercaDe;
    
    public TragaPerrasMenuBar()
    {
        ventanas = new JMenu("Ventanas");
        ayuda = new JMenu("Ayuda");
        
        configuracion = new JMenuItem("Configuracion");
        juego = new JMenuItem("Juego");
        ranking = new JMenuItem("Ranking");
        salir = new JMenuItem("Salir");
        acercaDe = new JMenuItem("AcercaDe");
        
        
        ventanas.add(configuracion);
        ventanas.add(juego);
        ventanas.add(ranking);
        ventanas.add(salir);
        ayuda.add(acercaDe);
        
        this.add(ventanas);
        this.add(ayuda);
    }
    
    public void setActionListener(ActionListener a){
        configuracion.addActionListener(a);
        juego.addActionListener(a);
        ranking.addActionListener(a);
        salir.addActionListener(a);
        acercaDe.addActionListener(a);
    }
}
