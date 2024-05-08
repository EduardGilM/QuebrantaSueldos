package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;
import java.awt.*;

public class AyudaVista extends JFrame {

    private InfoAyuda infoAyuda;

    public AyudaVista() {
        super("Ayuda");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());

        // Info Ayuda
        infoAyuda = new InfoAyuda();
        this.add(infoAyuda, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public class TituloAyuda extends JPanel {
        public TituloAyuda() {
            this.setBackground(new Color(179, 203, 172, 0));
            this.setPreferredSize(new Dimension(1000, 100));
            this.setLayout(new GridBagLayout());

            JLabel titulo = new JLabel("AYUDA");
            titulo.setFont(new Font("Impact", Font.PLAIN, 50));
            titulo.setForeground(new Color(82, 113, 159));
            JLabel tituloCopia = new JLabel("AYUDA");
            tituloCopia.setFont(new Font("Impact", Font.PLAIN, 51));
            tituloCopia.setForeground(new Color(0, 0, 0));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weighty = 1;
            gbc.insets = new Insets(0, 0, 0, 0);
            this.add(titulo, gbc);
            this.add(tituloCopia, gbc);
        }
    }

    public class InfoAyuda extends JPanel {
        public InfoAyuda() {
            this.add(new TituloAyuda());

            JLabel texto = new JLabel("Hola somos el grupo de Jose Carlos Weingartner y Eduard Gil y hoy vamos a ayudaros a jugar a");
            texto.setFont(new Font("Arial", Font.PLAIN, 20));
            texto.setForeground(Color.WHITE);
            this.add(texto);

            JPanel empty = new JPanel();
            empty.setPreferredSize(new Dimension(1000, 100));
            empty.setBackground(new Color(255, 255, 255, 0));

            JLabel texto2 = new JLabel("QUEBRANTASUELDOS");
            texto2.setFont(new Font("IMPACT", Font.BOLD, 40));
            texto2.setForeground(Color.WHITE);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weighty = 1;
            gbc.insets = new Insets(0, 0, 0, 0);
            this.add(texto2, gbc);

            this.add(empty);

            JLabel texto3 = new JLabel("Es tan simple como tirar de la palanca y esperar a que los símbolos coincidan.");
            texto3.setFont(new Font("Arial", Font.PLAIN, 20));
            texto3.setForeground(Color.WHITE);
            this.add(texto3);

            JLabel texto4 = new JLabel(" Si coinciden, ganas. Si no, pierdes.");
            texto4.setFont(new Font("Arial", Font.PLAIN, 20));
            texto4.setForeground(Color.WHITE);
            this.add(texto4);

            JPanel empty2 = new JPanel();
            empty2.setPreferredSize(new Dimension(1000, 100));
            empty2.setBackground(new Color(255, 255, 255, 0));
            this.add(empty2);

            JLabel texto5 = new JLabel("¡Suerte!");
            texto5.setFont(new Font("IMPACT", Font.PLAIN, 40));
            texto5.setForeground(Color.WHITE);
            GridBagConstraints gbc2 = new GridBagConstraints();
            gbc2.gridx = 0;
            gbc2.gridy = 0;
            gbc2.weighty = 1;
            gbc2.insets = new Insets(0, 0, 0, 0);
            this.add(texto5, gbc2);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image img = new ImageIcon("assets/PantallaAyuda.jpeg").getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
