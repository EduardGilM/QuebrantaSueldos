package com.mycompany.quebrantasueldos.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;

public class ImagenPanel extends JPanel{
    BufferedImage imagen;
    QuebrantaSueldosModelo model;
    int nimg;
    JCheckBox check;

    public ImagenPanel(QuebrantaSueldosModelo modelo, int img){

        this.model = modelo;
        this.setBorder(new CompoundBorder( new EmptyBorder(100,5,180,5),new LineBorder(Color.BLACK, 3) ));
        this.nimg = img;
        this.setBackground(new Color(0, 0, 0, 150));
        check = new JCheckBox();
        this.add(check);
    }

    public boolean getCheck(){
        return check.isSelected();
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        BufferedImage imagen = model.getImagen(nimg);
        
        if(imagen != null) {
        g.drawImage(imagen,5, 150, 310, 300,this); //Ajustar a las imagenes
        }
    }

    public void RepintarPanel(){
        this.repaint();
    }

}
