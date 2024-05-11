/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quebrantasueldos;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;
import com.mycompany.quebrantasueldos.Vista.QuebrantaSueldosVista;
import com.mycompany.quebrantasueldos.Controlador.QuebrantaSueldosControlador;

/**
 *
 * @author eduar
 */
public class QuebrantaSueldos {

    public static void main(String[] args) {

        QuebrantaSueldosModelo modelo = new QuebrantaSueldosModelo();
        
        QuebrantaSueldosVista view = new QuebrantaSueldosVista(modelo);

        QuebrantaSueldosControlador controller = new QuebrantaSueldosControlador(modelo, view);
        
    }
}
