package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;

import java.awt.*;
import java.awt.event.ActionListener;

public class QuebrantaSueldosVista extends JFrame {

    private ConfiguracionVista configuracion;
    private JuegoVista juegoVista;
    private RankingVista ranking;
    private AyudaVista ayuda;

    private QuebrantaSueldosModelo model;
    
    public QuebrantaSueldosVista(QuebrantaSueldosModelo modelo) {
        
        this.setLayout(new BorderLayout());
        this.model = modelo;
        
        configuracion = new ConfiguracionVista();
        configuracion.abrirVentana();
        juegoVista = new JuegoVista(model);
        
        //Ranking
        ranking = new RankingVista(this.model);

        //Ayuda
        ayuda = new AyudaVista();
    }  
    
    //Funcionces de Ventana de Juego
    public void abrirVentanaJuego(){
        juegoVista.abrirVentana();
    }
    
    public void cerrarVentanaJuego(){
        if(juegoVista!=null)
        juegoVista.cerrarVentana();
    }

    public void abrirVentanaRanking(){
        ranking.abrirVentana();
    }

    public void cerrarVentanaRanking(){
        ranking.cerrarVentana();
    }
    
    public void setActionListener(ActionListener actionListener){
        juegoVista.setActionListener(actionListener);
        configuracion.setActionListener(actionListener);
        ranking.setActionListener(actionListener);
    }

    public void RepintarPanel1() {
        juegoVista.RepintarPanel1();
    }

    public void RepintarPanel2() {
        juegoVista.RepintarPanel2();
    }

    public void RepintarPanel3() {
        juegoVista.RepintarPanel3();
    }

    public void deshabilitarChecks() {
        juegoVista.deshabilitarChecks();
    }

    public void habilitarChecks() {
        juegoVista.habilitarChecks();
    }

    public void setPuntos(int puntos) {
        juegoVista.setPuntos(puntos);
    }

    public void setSaldo(int saldo) {
        juegoVista.setSaldo(saldo);
    }

    public int getSaldoJuego() {
        return juegoVista.getSaldo();
    }

    public int getPuntos() {
        return juegoVista.getPuntos();
    }

    public void repintarJuego() {
        juegoVista.repaint();
    }

    public void finPartida() {
        JOptionPane.showMessageDialog(this, "Te has quedado sin saldo. Fin de la partida", "Fin Partida", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Funciones de Configuración


    public void abrirVentanaConfiguracion(){
        configuracion.abrirVentana();
    }

    public void cerrarVentanaConfiguracion(){
        configuracion.cerrarVentana();
    }

    public boolean datosConfiguracion(){
        return configuracion.datosConfiguracion();
    }

    public void datosFaltantes(){
        configuracion.datosFaltantes();
    }

    public String getNombre(){
        return configuracion.getNombre();
    }

    public String getTematica(){
        return configuracion.getTematica();
    }

    public int getSaldo(){
        return configuracion.getSaldo();
    }

    public boolean getCheck() {
        return this.juegoVista.getCheck();
    }
    
    public boolean getCheck1() {
        return this.juegoVista.getCheck1();
    }
    public boolean getCheck2() {
        return this.juegoVista.getCheck2();
    }

    public boolean getCheck3() {
        return this.juegoVista.getCheck3();
    }
    
    //Vetana Ranking

    public void setRanking() {
        ranking.setRanking();
    }

    public void clearRanking() {
        ranking.clearRanking();
    }
    
    
    //Ayuda
    public void abrirVentanaAyuda(){
        ayuda.abrirVentana();
    }

    public void cerrarVentanaAyuda(){
        ayuda.cerrarVentana();
    }
}
