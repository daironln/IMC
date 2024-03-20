package logica;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Aplicacion extends JFrame implements ActionListener {

    private JTextField textField1;
    private JLabel label1, label2, label3, label4;
    private JButton boton1;
    private static String name = "";
    // private static Op op;

    public Aplicacion() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bienvenido.");
        getContentPane().setBackground(new Color(255, 192, 203));
        setIconImage(new
         ImageIcon(getClass().getResource("../imagenes/logo_Peque.jpg")).getImage());

        ImageIcon logo = new ImageIcon("../imagenes/ell.jpg");
        label1 = new JLabel(logo);
        label1.setBounds(25, 15, 300, 150);
        add(label1);

        label2 = new JLabel("Proyecto consulta.");
        label2.setBounds(35, 135, 300, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Ingrese su nombre por favor.");
        label3.setBounds(45, 212, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 12));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("C 2023 Proyecto Consulta.");
        label4.setBounds(85, 375, 300, 30);
        label4.setFont(new Font("Andale Mono", 1, 12));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        textField1 = new JTextField();
        textField1.setBounds(45, 240, 255, 25);
        textField1.setBackground(new Color(255, 255, 255));
        textField1.setFont(new Font("Andale Mono", 1, 14));
        textField1.setForeground(new Color(0, 0, 0));
        textField1.addKeyListener(new KeyListener() {
                                      @Override
                                      public void keyTyped(KeyEvent e) {
                                      }

                                      @Override
                                      public void keyReleased(KeyEvent e) {

                                      }

                                      @Override
                                      public void keyPressed(KeyEvent e) {
                                          if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                              System.out.println("¡La tecla Enter ha sido presionada! Realizando una acción...");
                                              name = textField1.getText().trim();

                                              if (name.isEmpty()) {
                                                  JOptionPane.showMessageDialog(null, "Ingrese su nombre.");
                                              } else {
                                                  Licencia licencia = new Licencia();
                                                  licencia.setBounds(0, 0, 600, 360);
                                                  licencia.setVisible(true);
                                                  licencia.setResizable(false);
                                                  licencia.setLocationRelativeTo(null);
                                                  Deactivate();
                                              }
                                          }
                                      }
                                  });


        add(textField1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(125, 280, 100, 30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setForeground(new Color(0, 0, 0));
        boton1.setFont(new Font("Andale Mono", 1, 14));
        boton1.addActionListener(this);
        add(boton1);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {
            name = textField1.getText().trim();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese su nombre.");
            } else {
                Licencia licencia = new Licencia();
                licencia.setBounds(0, 0, 600, 360);
                licencia.setVisible(true);
                licencia.setResizable(false);
                licencia.setLocationRelativeTo(null);
                Deactivate();
            }
        }
    }
    private void Deactivate(){
        this.setVisible(false);
    }

    public static void main(String[] args) {
        Aplicacion aplicacion = new Aplicacion();
        aplicacion.setBounds(0, 0, 350, 450);
        aplicacion.setVisible(true);
        aplicacion.setResizable(false);
        aplicacion.setLocationRelativeTo(null);
    }

    public static String getNam() {
        return name;
    }
}
