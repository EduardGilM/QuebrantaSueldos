package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;
import java.awt.*;

public class QuebrantaSueldosVista extends JFrame {

    private ConfiguracionVista configuracion;
    private RankingVista ranking;
    private AyudaVista ayuda;
    
    public QuebrantaSueldosVista() {
        //configuracion = new ConfiguracionVista();

        this.setLayout(new BorderLayout());
        //this.add(configuracion, BorderLayout.CENTER);

        ranking = new RankingVista();
        //this.add(ranking, BorderLayout.CENTER);

        ayuda = new AyudaVista();
        this.add(ayuda, BorderLayout.CENTER);

    }  

}
