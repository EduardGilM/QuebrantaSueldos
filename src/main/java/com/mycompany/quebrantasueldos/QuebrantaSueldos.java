/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quebrantasueldos;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;
import com.mycompany.quebrantasueldos.Vista.QuebrantaSueldosVista;

/**
 *
 * @author eduar
 */
public class QuebrantaSueldos {

    public static void main(String[] args) {

        QuebrantaSueldosModelo modelo = new QuebrantaSueldosModelo();
        
        QuebrantaSueldosVista view = new QuebrantaSueldosVista(modelo);
        
    }
}
