package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;

import java.awt.*;

public class QuebrantaSueldosVista extends JFrame {

    private ConfiguracionVista configuracion;
    private JuegoVista juegoVista;


    private QuebrantaSueldosModelo model;
    
    public QuebrantaSueldosVista(QuebrantaSueldosModelo modelo) {
        
        this.setLayout(new BorderLayout());
        this.model = modelo;
        
        configuracion = new ConfiguracionVista();
        juegoVista = new JuegoVista(model);
        

        
        
        //Ranking
        //Ayuda
    }  
    
    //Funcionces de Ventana de Juego
    public void abrirVentanaJuego(){
        juegoVista.abrirVentana();
    }
    
    public void cerrarVentanaJuego(){
        if(juegoVista!=null)
        juegoVista.cerrarVentana();
    }
    
    
    //Funcioens de Configuración
    
    
    //Vetana Ranking
    
    
    //Ayuda
}
