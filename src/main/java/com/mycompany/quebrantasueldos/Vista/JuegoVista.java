/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quebrantasueldos.Vista;


import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;

import java.awt.*;
import java.awt.event.ActionListener;
public class JuegoVista extends JFrame{
    private EstadoPanel estadoPanel;
    private TragaPerrasMenuBar menu;
    private TirarPanel tirarPanel;
    private InfoJuego infoJuego;


    QuebrantaSueldosModelo model;
    
    public JuegoVista(QuebrantaSueldosModelo modelo){
        super("Ventanta de Juego");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        this.model = modelo;
        
        //Paneles
        estadoPanel = new EstadoPanel();
        menu = new TragaPerrasMenuBar();
        
        this.setJMenuBar(menu);
        add(estadoPanel,BorderLayout.SOUTH);

        infoJuego = new InfoJuego(model);
        this.add(infoJuego, BorderLayout.CENTER);
        
        
        
        this.setVisible(false);
    }
    //Juego
    public void abrirVentana(){
        this.setVisible(true);
    }
    
    public void cerrarVentana(){
        this.dispose();
    }
    //Info Juego
    public void RepintarPanel1(){
        infoJuego.RepintarPanel1();
    }
    public void RepintarPanel2(){
        infoJuego.RepintarPanel2();
    }
    public void RepintarPanel3(){
        infoJuego.RepintarPanel3();
    }
    public void setActionListener(ActionListener a){
        infoJuego.setActionListener(a);
    }

    public boolean getCheck1(){
        return infoJuego.getCheck1();
    }
    public boolean getCheck2(){
        return infoJuego.getCheck2();
    }
    public boolean getCheck3(){
        return infoJuego.getCheck3();
    }

    public void deshabilitarChecks() {
        infoJuego.deshabilitarChecks();
    }
    public void habilitarChecks() {
        infoJuego.habilitarChecks();
    }

    //Estado Panel

    public boolean getCheck() {
        return estadoPanel.getCheck();
    }

    public void setSaldo(int saldo){
        estadoPanel.setSaldo(saldo);
    }

    public int getSaldo(){
        return estadoPanel.getSaldo();
    }

    public void setPuntos(int puntos){
        estadoPanel.setPuntos(puntos);
    }

    public int getPuntos(){
        return estadoPanel.getPuntos();
    }
    

    
    public class InfoJuego extends JPanel {
        QuebrantaSueldosModelo model;
        public InfoJuego(QuebrantaSueldosModelo modelo) {
            this.setLayout(new GridLayout(1,1));
            this.setBorder(new EmptyBorder(10, 10, 10, 10));
            this.model = modelo;

            tirarPanel = new TirarPanel(model);
            
            this.add(tirarPanel);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image img = new ImageIcon("assets/PantallaJuego.png").getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }

        public void RepintarPanel1(){
            tirarPanel.RepintarPanel1();
        }
        public void RepintarPanel2(){
            tirarPanel.RepintarPanel2();
        }
        public void RepintarPanel3(){
            tirarPanel.RepintarPanel3();
        }
        public void setActionListener(ActionListener a){
            tirarPanel.SetActionListener(a);
        }   
        public boolean getCheck1(){
            return tirarPanel.getCheck1();
        }
        public boolean getCheck2(){
            return tirarPanel.getCheck2();
        }
        public boolean getCheck3(){
            return tirarPanel.getCheck3();
        }
        public void deshabilitarChecks() {
            tirarPanel.deshabilitarChecks();
        }
        public void habilitarChecks() {
            tirarPanel.habilitarChecks();
        }
    }
    
}
