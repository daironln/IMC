package logica;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Principal extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRosado, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelPesoActual, labelPesoAnterior,
            labelGanancia, labelIMC, labelSemanas,
            labelResultado,
            labelFooter;
    private JTextField txfNombre, txfPesoActual, txfPesoAnterior, txfGanancia, txfIMC;
    private JComboBox<String> comboSemanas;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private String name;
    private DecimalFormat df = new DecimalFormat("#.##");

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Principal.");
        getContentPane().setBackground(new Color(255, 192, 203));
        setIconImage(new
        ImageIcon(getClass().getResource("../imagenes/logo_Peque.jpg")).getImage());

        name = Aplicacion.getNam();

        mb = new JMenuBar();
        mb.setBackground(new Color(255, 192, 203));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255, 192, 203));
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255, 192, 203));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255, 192, 203));
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(0, 0, 0));
        menuOpciones.add(menuColorFondo);

        miCalculo = new JMenuItem("Aumento");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(new Color(0, 0, 0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRosado = new JMenuItem("Rosado");
        miRosado.setFont(new Font("Andale Mono", 1, 14));
        miRosado.setForeground(new Color(0, 0, 0));
        menuColorFondo.add(miRosado);
        miRosado.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));
        miNegro.setForeground(new Color(0, 0, 0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));
        miMorado.setForeground(new Color(0, 0, 0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(0, 0, 0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setForeground(new Color(0, 0, 0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(0, 0, 0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        ImageIcon logo = new ImageIcon("../imagenes/elle.jpg");
        labelLogo = new JLabel(logo);
        labelLogo.setBounds(70, 5, 250, 100);
        add(labelLogo);

        labelBienvenido = new JLabel("Bienvenido " + name);
        labelBienvenido.setBounds(200, 30, 300, 50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new Color(255, 255, 255));
        add(labelBienvenido);

        labelTitle = new JLabel("Datos de la paciente para los calculos.");
        labelTitle.setBounds(45, 140, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre completo: ");
        labelNombre.setBounds(25, 188, 180, 25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255, 255, 255));
        add(labelNombre);

        txfNombre = new JTextField();
        txfNombre.setBounds(25, 213, 150, 25);
        txfNombre.setBackground(new Color(224, 224, 224));
        txfNombre.setFont(new Font("Andale Mono", 1, 14));
        txfNombre.setForeground(new Color(0, 0, 0));
        add(txfNombre);

        labelPesoActual = new JLabel("Peso actual: ");
        labelPesoActual.setBounds(25, 248, 180, 25);
        labelPesoActual.setFont(new Font("Andale Mono", 1, 12));
        labelPesoActual.setForeground(new Color(255, 255, 255));
        add(labelPesoActual);

        txfPesoActual = new JTextField();
        txfPesoActual.setBounds(25, 273, 150, 25);
        txfPesoActual.setBackground(new Color(224, 224, 224));
        txfPesoActual.setFont(new Font("Andale Mono", 1, 14));
        txfPesoActual.setForeground(new Color(0, 0, 0));
        add(txfPesoActual);

        txfPesoActual.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)
                        || c == KeyEvent.VK_DECIMAL || c == KeyEvent.VK_PERIOD)) {
                    e.consume();
                }

                if (!txfPesoActual.getText().isEmpty()) {
                    txfGanancia.setEnabled(false);
                } else {
                    txfGanancia.setEnabled(true);
                }
            }
        });

        labelPesoAnterior = new JLabel("Peso anterior: ");
        labelPesoAnterior.setBounds(25, 308, 180, 25);
        labelPesoAnterior.setFont(new Font("Andale Mono", 1, 12));
        labelPesoAnterior.setForeground(new Color(255, 255, 255));
        add(labelPesoAnterior);

        txfPesoAnterior = new JTextField();
        txfPesoAnterior.setBounds(25, 333, 150, 25);
        txfPesoAnterior.setBackground(new Color(224, 224, 224));
        txfPesoAnterior.setFont(new Font("Andale Mono", 1, 14));
        txfPesoAnterior.setForeground(new Color(0, 0, 0));
        add(txfPesoAnterior);

        txfPesoAnterior.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)
                        || c == KeyEvent.VK_DECIMAL || c == KeyEvent.VK_PERIOD)) {
                    e.consume();
                }

                if (!txfPesoAnterior.getText().isEmpty()) {
                    txfGanancia.setEnabled(false);
                } else {
                    txfGanancia.setEnabled(true);
                }
            }
        });

        labelGanancia = new JLabel("Ganancia: ");
        labelGanancia.setBounds(25, 368, 180, 25);
        labelGanancia.setFont(new Font("Andale Mono", 1, 12));
        labelGanancia.setForeground(new Color(255, 255, 255));
        add(labelGanancia);

        txfGanancia = new JTextField();
        txfGanancia.setBounds(25, 393, 150, 25);
        txfGanancia.setBackground(new Color(224, 224, 224));
        txfGanancia.setFont(new Font("Andale Mono", 1, 14));
        txfGanancia.setForeground(new Color(0, 0, 0));
        add(txfGanancia);

        txfGanancia.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)
                        || c == KeyEvent.VK_DECIMAL || c == KeyEvent.VK_PERIOD)) {
                    e.consume();
                }

                if (!txfGanancia.getText().isEmpty()) {
                    txfPesoActual.setEnabled(false);
                    txfPesoAnterior.setEnabled(false);
                } else {
                    txfPesoActual.setEnabled(true);
                    txfPesoAnterior.setEnabled(true);
                }
            }
        });

        labelSemanas = new JLabel("Selecciona una semana: ");
        labelSemanas.setBounds(220, 188, 180, 25);
        labelSemanas.setFont(new Font("Andale Mono", 1, 12));
        labelSemanas.setForeground(new Color(255, 255, 255));
        add(labelSemanas);

        comboSemanas = new JComboBox<String>();
        comboSemanas.setBounds(220, 213, 220, 25);
        comboSemanas.setBackground(new Color(224, 224, 224));
        comboSemanas.setFont(new Font("Andale Mono", 1, 14));
        comboSemanas.setForeground(new Color(0, 0, 0));
        add(comboSemanas);

        comboSemanas.addItem("");

        for (int i = 12; i <= 40; i++) {
            comboSemanas.addItem("Semana " + String.valueOf(i));
        }

        labelIMC = new JLabel("Ingrese IMC: ");
        labelIMC.setBounds(220, 248, 180, 25);
        labelIMC.setFont(new Font("Andale Mono", 1, 12));
        labelIMC.setForeground(new Color(255, 255, 255));
        add(labelIMC);

        txfIMC = new JTextField();
        txfIMC.setBounds(220, 273, 220, 25);
        txfIMC.setBackground(new Color(224, 224, 224));
        txfIMC.setFont(new Font("Andale Mono", 1, 14));
        txfIMC.setForeground(new Color(0, 0, 0));
        add(txfIMC);

        txfIMC.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)
                        || c == KeyEvent.VK_DECIMAL || c == KeyEvent.VK_PERIOD)) {
                    e.consume();
                }
            }
        });

        labelResultado = new JLabel("Resultado del calculo: ");
        labelResultado.setBounds(220, 307, 180, 25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new Color(255, 255, 255));
        add(labelResultado);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setBackground(new Color(224, 224, 224));
        textArea1.setFont(new Font("Andale Mono", 1, 11));
        textArea1.setForeground(new Color(0, 0, 0));
        textArea1.setText(" Aqui aparece el resultado del calculo. ");

        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(220, 333, 385, 90);
        add(scrollPane1);

        labelFooter = new JLabel("C 2023 Proyecto consulta | Todos los derechos reservados.");
        labelFooter.setBounds(135, 445, 500, 30);
        labelFooter.setFont(new Font("Andale Mono", 1, 12));
        labelFooter.setForeground(new Color(255, 255, 255));
        add(labelFooter);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == miCalculo) {

            String nombre = txfNombre.getText();
            String semana = comboSemanas.getSelectedItem().toString();
            String imc = txfIMC.getText();
            String pesoactual = txfPesoActual.getText();
            String pesoanterior = txfPesoAnterior.getText();
            float imcnum;
            float pesoactualnum;
            float pesoanteriornum;
            float ganancia;
            int semindex = comboSemanas.getSelectedIndex() + 11;

            if (nombre.isEmpty() || semana.isEmpty() || imc.isEmpty()
                    || ((pesoactual.isEmpty() || pesoanterior.isEmpty()) && txfGanancia.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos.");
            } else {

                try {
                    imcnum = Float.parseFloat(imc);

                    if (!txfGanancia.isEnabled()) {
                        pesoactualnum = Float.parseFloat(pesoactual);
                        pesoanteriornum = Float.parseFloat(pesoanterior);
                        ganancia = pesoactualnum - pesoanteriornum;

                    } else
                        ganancia = Float.parseFloat(txfGanancia.getText());

                    Op op = new Op(imcnum, semindex, ganancia);

                    textArea1.setText(
                            "La paciente " + nombre + " con un IMC de " + imcnum + "Kg/m^2 y " + semindex +
                                    " semanas,\n se encuentra con " + op.getRango() + " y deberia de ganar de "
                                    + df.format(op.getAumento()[0]) + " a " +
                                    df.format(op.getAumento()[1])
                                    + " \n Kg aproximadamente. Por lo que presenta una ganancia \n" + op.getGanancia()
                                    + ".");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Por favor revise los campos IMC, Peso actual, Peso anterior y ganancia. ");
                }
            }
        }
        if (e.getSource() == miRosado) {

            getContentPane().setBackground(new Color(255, 192, 203));
        }
        if (e.getSource() == miNegro) {

            getContentPane().setBackground(new Color(0, 0, 0));
        }
        if (e.getSource() == miMorado) {

            getContentPane().setBackground(new Color(51, 0, 51));
        }
        if (e.getSource() == miNuevo) {

            txfIMC.setText("");
            txfNombre.setText("");
            comboSemanas.setSelectedIndex(0);
            textArea1.setText(" Aqui aparece el resultado del calculo. ");
        }
        if (e.getSource() == miSalir) {

            Aplicacion aplicacion = new Aplicacion();
            aplicacion.setBounds(0, 0, 350, 450);
            aplicacion.setVisible(true);
            aplicacion.setResizable(false);
            aplicacion.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == miElCreador) {

            JOptionPane.showMessageDialog(null,
                    "Desarrollado por: \n -Programador y Analista: Dairon Luis Naranjo Almanza. \n -Programador: Jorge Aldana Noriega. \n -Consultor Medico: Dr. Yunier Hernadez Almanza.");
        }
    }

    public static void main(String[] args) {

        Principal principal = new Principal();
        principal.setBounds(0, 0, 640, 535);
        principal.setVisible(true);
        principal.setResizable(false);
        principal.setLocationRelativeTo(null);

    }

}
