package com.mycompany.quebrantasueldos.Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;

public class ImagenPanel extends JPanel{
    BufferedImage imagen;
    QuebrantaSueldosModelo model;
    int nimg;

    public ImagenPanel(QuebrantaSueldosModelo modelo, int img){
        this.model = modelo;
        this.setBorder(new CompoundBorder( new EmptyBorder(50,5,50,5),new LineBorder(Color.BLACK, 3) ));
        this.nimg = img;
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        BufferedImage imagen = model.getImagen(nimg);
        
        if(imagen != null)
        g.drawImage(imagen, imagen.getWidth(), imagen.getHeight(), imagen.getWidth(),imagen.getHeight(),this); //Ajustar a las imagenes
        
    }

    public void RepintarPanel(){
        this.repaint();
    }

}
