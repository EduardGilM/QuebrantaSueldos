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
    private InfoJuego infoJuego;
    
    public JuegoVista(QuebrantaSueldosModelo modelo){
        super("Ventanta de Juego");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        
        //Paneles
        estadoPanel = new EstadoPanel();
        menu = new TragaPerrasMenuBar();
        
        this.setJMenuBar(menu);
        add(estadoPanel,BorderLayout.SOUTH);

        infoJuego = new InfoJuego(modelo);
        this.add(infoJuego, BorderLayout.CENTER);
        
        
        
        this.setVisible(true);
    }
    
    public void abrirVentana(){
        this.setVisible(true);
    }
    
    public void cerrarVentana(){
        this.dispose();
    }

    public class InfoJuego extends JPanel {
        public InfoJuego(QuebrantaSueldosModelo modelo) {
            tirarPanel = new TirarPanel(modelo);
        
        add(tirarPanel,BorderLayout.CENTER);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image img = new ImageIcon("assets/PantallaJuego.png").getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
