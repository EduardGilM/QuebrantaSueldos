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
    private int nrand1, nrand2, nrand3;
    private int saldo;
    private int puntuacion;
    
    public QuebrantaSueldosModelo() {
        
        puntuacion = 0;
        saldo = 0;
        nrand1 = (int) (Math.random() * 5);//0-4
        nrand2 = (int) (Math.random() * 5);
        nrand3 = (int) (Math.random() * 5);

        try {
            imagen1 = ImageIO.read(new File(nombres[nrand1]));
            imagen2 = ImageIO.read(new File(nombres[nrand2]));
            imagen3 = ImageIO.read(new File(nombres[nrand3]));
            
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

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }   

    //Cambiar individualmente las imagenes y los numeros
    public void Tirada1(){
        nrand1 = (int) (Math.random() * 5);
        try {
            imagen1 = ImageIO.read(new File(nombres[nrand1]));
        }
        catch (IOException e) {
            System.out.println("Problemas leyendo la imagen .");
            System.out.println("Motivo: " + e.getLocalizedMessage());
        }
    }
    public void Tirada2(){
        nrand2 = (int) (Math.random() * 5);
        try {
            imagen2 = ImageIO.read(new File(nombres[nrand2]));
        }
        catch (IOException e) {
            System.out.println("Problemas leyendo la imagen .");
            System.out.println("Motivo: " + e.getLocalizedMessage());
        }
    }
    public void Tirada3(){
        nrand3 = (int) (Math.random() * 5);
        try {
            imagen3 = ImageIO.read(new File(nombres[nrand3]));
        }
        catch (IOException e) {
            System.out.println("Problemas leyendo la imagen .");
            System.out.println("Motivo: " + e.getLocalizedMessage());
        }
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    //Comprobar el premio
    public void Premio(){
        if(nrand1 == nrand2 && nrand1 == nrand3 && nrand1 == 3){ //Imagen 4 posicio 3 en el array, reservada para la moneda
            saldo += 50;
            puntuacion += 3;
        }
        else if (nrand1 == nrand2 && nrand1 == nrand3 && nrand1 == 4){ //Imagen 5 posicio 4 en el array, reservada para la campana
            saldo *=10;
            puntuacion += 5;
        }else if(nrand1 == nrand2 && nrand1 == nrand3){ //Tres iguales
            saldo += 5;
            puntuacion += 1;
        }else
            saldo -= 1;
    }




}
