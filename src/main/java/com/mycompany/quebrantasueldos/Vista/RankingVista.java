package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;

import java.awt.*;

public class RankingVista extends JFrame {
    private InfoRanking infoRanking;

    public RankingVista() {
        super("Ranking");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());

        // Info Ranking
        infoRanking = new InfoRanking();
        this.add(infoRanking, BorderLayout.CENTER);
        this.setVisible(false);
    }

    public class TituloRanking extends JPanel {
        public TituloRanking() {
            this.setBackground(new Color(179, 203, 172, 0));
            this.setPreferredSize(new Dimension(1000, 100));
            this.setLayout(new GridBagLayout());

            JLabel titulo = new JLabel("RANKING");
            titulo.setFont(new Font("Impact", Font.PLAIN, 50));
            titulo.setForeground(new Color(249, 237, 163));
            JLabel tituloCopia = new JLabel("RANKING");
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

    public class InfoRanking extends JPanel {
        public InfoRanking() {
            this.add(new TituloRanking());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image img = new ImageIcon("assets/PantallaRanking.jpg").getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public void abrirVentana() {
        this.setVisible(true);
    }

    public void cerrarVentana() {
        this.dispose();
    }

}