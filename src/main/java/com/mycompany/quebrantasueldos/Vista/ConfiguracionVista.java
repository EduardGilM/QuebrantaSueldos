package com.mycompany.quebrantasueldos.Vista;

import javax.swing.*;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionListener;

public class ConfiguracionVista extends JFrame {
    private InfoPanel infoPanel;
    private JButton comenzar;
    private Integer fontSize = 14;

    public ConfiguracionVista() {
        super("Configuración");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Info Panel
        infoPanel = new InfoPanel();
        this.add(infoPanel, BorderLayout.CENTER);

        // Boton jugar
        comenzar = new JButton("Comenzar");
        comenzar.setPreferredSize(new Dimension(100, 50));
        comenzar.setBackground(Color.BLACK);
        comenzar.setForeground(Color.WHITE);
        comenzar.setFont(new Font("Arial", Font.BOLD, fontSize));

        this.add(comenzar, BorderLayout.SOUTH);

        this.setVisible(false);
    }

    public void abrirVentana() {
        this.setVisible(true);
    }

    public void setFontSize(int size) {
        fontSize = size;
        infoPanel.setFontSize(size);
        comenzar.setFont(new Font("Arial", Font.BOLD, size));
    }

    public Integer getFontSize() {
        return infoPanel.getFontSize();
    }

    public void cerrarVentana() {
        this.dispose();
    }

    public void datosFaltantes() {
        JOptionPane.showMessageDialog(this, "Faltan datos por rellenar o tienes saldo invalido", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void setActionListener(ActionListener a) {
        comenzar.addActionListener(a);
    }

    public boolean datosConfiguracion() {
        if (infoPanel.getNombre().equals("") || infoPanel.getSaldo() <= 0) {
            return false;
        }
        return true;
    }

    public String getNombre() {
        return infoPanel.getNombre();
    }

    public String getTematica() {
        return infoPanel.getTematica();
    }

    public int getSaldo() {
        return infoPanel.getSaldo();
    }

    public class TituloPanel extends JPanel {
        public TituloPanel() {
            this.setBackground(new Color(179, 203, 172, 0));
            this.setPreferredSize(new Dimension(1000, 100));
            this.setLayout(new GridBagLayout());

            JLabel titulo = new JLabel("QUEBRANTASUELDOS");
            titulo.setFont(new Font("Impact", Font.PLAIN, 50));
            titulo.setForeground(new Color(250, 249, 218));
            JLabel tituloCopia = new JLabel("QUEBRANTASUELDOS");
            tituloCopia.setFont(new Font("Impact", Font.PLAIN, 51));
            tituloCopia.setForeground(new Color(0, 0, 0));

            JLabel titulo2 = new JLabel("2000");
            titulo2.setFont(new Font("Impact", Font.PLAIN, 50));
            titulo2.setForeground(new Color(250, 249, 218));
            JLabel titulo2Copia = new JLabel("2000");
            titulo2Copia.setFont(new Font("Impact", Font.PLAIN, 51));
            titulo2Copia.setForeground(new Color(0, 0, 0));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weighty = 1;
            gbc.anchor = GridBagConstraints.CENTER;
            this.add(titulo, gbc);
            this.add(tituloCopia, gbc);

            gbc.gridy = 1;
            this.add(titulo2, gbc);
            this.add(titulo2Copia, gbc);
        }
    }

    public class InfoPanel extends JPanel {

        private JTextField nombreText;
        private JComboBox<String> menuDesplegable;
        private JTextField saldoText;
        private JTextField size; 
        private int fontSize = 14;

        private JLabel nombre;
        private JLabel tematica;
        private JLabel saldo;
        private JLabel fuente;

        public InfoPanel() {
            this.setBackground(new Color(255, 255, 255, 0));

            this.add(new TituloPanel());
            JPanel empty = new JPanel();
            empty.setPreferredSize(new Dimension(1000, 100));
            empty.setBackground(new Color(255, 255, 255, 0));
            this.add(empty);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(7, 2));
            panel.setBackground(new Color(0, 0, 0, 0));

            nombre = new JLabel("Nombre:");
            nombre.setFont(new Font("Arial", Font.BOLD, fontSize));
            nombre.setForeground(Color.BLACK);

            nombreText = new JTextField();
            nombreText.setPreferredSize(new Dimension(200, 30));

            tematica = new JLabel("Tematica:");
            tematica.setFont(new Font("Arial", Font.BOLD, fontSize));
            tematica.setForeground(Color.BLACK);

            menuDesplegable = new JComboBox<>();
            menuDesplegable.addItem("Frutas");
            menuDesplegable.addItem("Horoscopo");
            menuDesplegable.addItem("Dioses");

            saldo = new JLabel("Saldo:");
            saldo.setFont(new Font("Arial", Font.BOLD, fontSize));
            saldo.setForeground(Color.BLACK);

            saldoText = new JTextField("0");
            saldoText.setPreferredSize(new Dimension(200, 30));

            fuente = new JLabel("Tamaño de la fuente:");
            fuente.setFont(new Font("Arial", Font.BOLD, fontSize));
            fuente.setForeground(Color.BLACK);
            size = new JTextField("14");
            size.setPreferredSize(new Dimension(200, 30));

            panel.add(nombre);
            panel.add(nombreText);
            panel.add(new JLabel(""));
            panel.add(new JLabel(""));
            panel.add(tematica);
            panel.add(menuDesplegable);
            panel.add(new JLabel(""));
            panel.add(new JLabel(""));
            panel.add(saldo);
            panel.add(saldoText);
            panel.add(new JLabel(""));
            panel.add(new JLabel(""));
            panel.add(fuente);
            panel.add(size);

            this.add(panel);
        }

        public String getNombre() {
            return nombreText.getText();
        }

        public void setFontSize(int size) {
            fontSize = size;
            nombre.setFont(new Font("Arial", Font.BOLD, size));
            tematica.setFont(new Font("Arial", Font.BOLD, size));
            saldo.setFont(new Font("Arial", Font.BOLD, size));
            fuente.setFont(new Font("Arial", Font.BOLD, size));
        }

        public Integer getFontSize() {
            return Integer.parseInt(size.getText());
        }

        public String getTematica() {
            return (String) menuDesplegable.getSelectedItem();
        }

        public int getSaldo() {
            return Integer.parseInt(saldoText.getText());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image img = new ImageIcon("assets/PantallaConfiguracion.jpg").getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
