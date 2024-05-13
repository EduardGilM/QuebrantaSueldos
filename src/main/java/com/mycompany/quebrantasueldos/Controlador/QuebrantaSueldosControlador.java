package com.mycompany.quebrantasueldos.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;
import com.mycompany.quebrantasueldos.Vista.QuebrantaSueldosVista;

public class QuebrantaSueldosControlador {

    private QuebrantaSueldosModelo modelo;
    private QuebrantaSueldosVista view;

    public QuebrantaSueldosControlador(QuebrantaSueldosModelo modelo, QuebrantaSueldosVista view) {
        this.modelo = modelo;
        this.view = view;
        view.setActionListener(new QuebrantaSueldosControladorActionListener(modelo, view));
    }
}

class QuebrantaSueldosControladorActionListener implements ActionListener {
    private QuebrantaSueldosModelo model;
    private QuebrantaSueldosVista view;

    public QuebrantaSueldosControladorActionListener(QuebrantaSueldosModelo model, QuebrantaSueldosVista view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Jugar":

                if (!this.view.getCheck()) {
                    this.model.Tirada1();
                    this.model.Tirada2();
                    this.model.Tirada3();

                    this.view.RepintarPanel1();
                    this.view.RepintarPanel2();
                    this.view.RepintarPanel3();
                } else {
                    if (this.view.getCheck1()) {
                        this.model.Tirada1();
                        this.view.RepintarPanel1();
                    }
                    if (this.view.getCheck2()) {
                        this.model.Tirada2();
                        this.view.RepintarPanel2();
                    }
                    if (this.view.getCheck3()) {
                        this.model.Tirada3();
                        this.view.RepintarPanel3();
                    }
                }
                this.view.repintarJuego();
                this.model.Premio();
                this.view.setSaldo(this.model.getSaldo());
                this.view.setPuntos(this.model.getPuntuacion());
                if (!this.model.comprobarSaldo()) {
                    this.view.finPartida();
                    this.model.finPartida();
                    this.view.setRanking();
                    this.view.cerrarVentanaJuego();
                    this.view.abrirVentanaRanking();
                }
                break;
            case "Comenzar":
                if (this.view.datosConfiguracion()) {
                    this.model.setTematica(this.view.getTematica());
                    this.model.setJugador(this.view.getNombre());
                    this.model.setSaldo(this.view.getSaldo());
                    this.view.setSaldo(this.model.getSaldo());
                    this.view.cerrarVentanaConfiguracion();
                    this.view.abrirVentanaJuego();
                } else {
                    this.view.datosFaltantes();
                }
                break;
            case "Asistente": 
                if (this.view.getCheck()) {
                    this.view.habilitarChecks();
                } else {
                    this.view.deshabilitarChecks();
                }
                break;
            case "Configuracion":
                this.view.abrirVentanaConfiguracion();
                break;
            case "Juego":
                this.view.abrirVentanaJuego();
                break;
            case "Ranking":
                this.view.clearRanking();
                this.view.abrirVentanaRanking();
                break;
            case "AcercaDe":
                this.view.abrirVentanaAyuda();
                break;
            case "Salir":
                System.exit(0);
                break;
            case "Ingresar":
                this.model.setSaldo(this.view.getSaldoJuego());
                break;
            case "Retirar":
                this.model.finPartida();
                this.view.clearRanking();
                this.view.setRanking();
                this.view.setSaldo(0);
                this.view.setPuntos(0);
                this.view.cerrarVentanaJuego();
                this.view.abrirVentanaRanking();
                break;
            case "Volver a jugar": 
                this.view.cerrarVentanaRanking();
                this.view.abrirVentanaConfiguracion();
            default:
                break;
        }
    }
}