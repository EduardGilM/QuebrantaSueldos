/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quebrantasueldos.Modelo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

import javax.imageio.ImageIO;

public class QuebrantaSueldosModelo {
    
    private BufferedImage imagen1, imagen2, imagen3;
    private String[] nombres = {"assets/imagen_00.jpg", "assets/imagen_01.jpg", "assets/imagen_02.jpg", "assets/imagen_03.jpg","assets/imagen_04.jpg"}; 
    
    
    public QuebrantaSueldosModelo() {
        
        System.out.println("Modelo creado");

        try {
            imagen1 = ImageIO.read(new File("assets/imagen_00.jpg"));
            imagen2 = ImageIO.read(new File("assets/imagen_00.jpg"));
            imagen3 = ImageIO.read(new File("assets/imagen_00.jpg"));
            
        }
        catch (IOException e) {
            System.out.println("Problemas leyendo la imagen .");
            System.out.println("Motivo: " + e.getLocalizedMessage());
        }
    
    }
    
    public BufferedImage getImagen(int i) {
        switch(i) {
            case 0:
                return imagen1;
            case 1:
                return imagen2;
            case 2:
                return imagen3;
            default:
                return null;
        }
    }

    public void setImagen1(BufferedImage imagen1) {
        this.imagen1 = imagen1;
    }

    public void setImagen2(BufferedImage imagen2) {
        this.imagen2 = imagen2;
    }

    public void setImagen3(BufferedImage imagen3) {
        this.imagen3 = imagen3;
    }




}
