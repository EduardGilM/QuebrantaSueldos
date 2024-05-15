package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;
import javax.swing.border.LineBorder;

import com.mycompany.quebrantasueldos.Modelo.QuebrantaSueldosModelo;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class RankingVista extends JFrame {
    private InfoRanking infoRanking;
    private QuebrantaSueldosModelo modelo;
    private TragaPerrasMenuBar menu;
    private JButton reply;

    public RankingVista(QuebrantaSueldosModelo model) {
        super("Ranking");
        this.modelo = model;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.menu = new TragaPerrasMenuBar();
        this.setJMenuBar(menu);

        // Info Ranking
        infoRanking = new InfoRanking(this.modelo);
        this.add(infoRanking, BorderLayout.CENTER);
        this.setVisible(false);

        reply = new JButton("Volver a jugar");
        reply.setBackground(new Color(200, 177, 128));
        reply.setForeground(Color.WHITE);
        reply.setBorder(new LineBorder(Color.BLACK, 3));
        reply.setFont(new Font("Arial", Font.BOLD, 24));
        this.add(reply, BorderLayout.SOUTH);
    }

    public void setActionListener(ActionListener actionListener) {
        menu.setActionListener(actionListener);
        reply.addActionListener(actionListener);
    }

    public void setRanking() {
        this.infoRanking.setRanking();
    }
    
    public void clearRanking() {
        this.infoRanking.clearRanking();
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

        private QuebrantaSueldosModelo model;
        public InfoRanking(QuebrantaSueldosModelo model) {
            this.model = model;
            this.add(new TituloRanking());
        }

        public void setRanking() {
            Map<String, Integer> ranking = this.model.getRanking();
            
            List<Map.Entry<String, Integer>> sortedRanking = ranking.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toList());

            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedRanking) {
                if (count >= 10) {
                    break;
                }
                String key = entry.getKey();
                Integer value = entry.getValue();
                JLabel label = new JLabel(key + ": " + value);
                label.setFont(new Font("Impact", Font.PLAIN, 30));
                label.setForeground(new Color(249, 237, 163));
                this.add(label);
                this.add(Box.createVerticalStrut(10));
                count++;
            }
        }

        public void clearRanking() {
            this.removeAll();
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