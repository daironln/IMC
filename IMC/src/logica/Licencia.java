package logica;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollPane1;
    private JTextArea textarea1;
    private String name;

    public Licencia() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso.");
        setIconImage(new
        ImageIcon(getClass().getResource("../imagenes/logo_Peque.jpg")).getImage());

        name = Aplicacion.getNam();

        label1 = new JLabel("TERMINOS Y CONDICIONES.");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", 0, 9));
        textarea1.setText("\n\n    Terminos y condiciones: \n\n" +
                "   Al acceder y utilizar esta aplicación de control de aumento de peso e índice de masa corporal de embarazadas, aceptas los siguientes \n" +
                "términos y condiciones:\n\n" +
                "1. Uso Responsable: Esta aplicación está destinada a ser utilizada como una herramienta complementaria para ayudar a las embarazadas\n" +
                " a monitorear su aumento de peso e índice de masa corporal durante el embarazo. No sustituye el consejo médico profesional.\n" +
                "   \n" +
                "2. Información Personal: Al utilizar la aplicación, comprendes y aceptas que parte de la información ingresada, como datos biométricos\n" +
                " y de salud, puede ser almacenada de forma segura para su análisis y seguimiento personal.\n" +
                "   \n" +
                "3. Confidencialidad: Garantizamos la confidencialidad de tus datos y nos comprometemos a proteger tu privacidad. No compartiremos tu \n" +
                "información personal con terceros sin tu consentimiento.\n" +
                "   \n" +
                "4. Exactitud de la Información: La precisión de los datos ingresados en la aplicación es responsabilidad del usuario. Recomendamos \n" +
                "verificar la información ingresada y consultar con un profesional de la salud para interpretar los resultados.\n" +
                "   \n" +
                "5. Responsabilidad: La aplicación y sus desarrolladores no se hacen responsables por el uso inadecuado de la información proporcionada\n" +
                " por la herramienta. Cualquier decisión basada en los resultados de la aplicación es responsabilidad exclusiva del usuario.\n" +
                "   \n" +
                "6. Actualizaciones: Nos reservamos el derecho de realizar actualizaciones periódicas en la aplicación para mejorar su funcionamiento\n" +
                " y la experiencia del usuario. Se recomienda utilizar la versión más actualizada de la aplicación.\n" +
                "   \n" +
                "7. Derechos de Propiedad: Todos los derechos de propiedad intelectual sobre la aplicación, incluidos textos, imágenes, logotipos y\n" +
                " diseños, son propiedad de los desarrolladores. Toda reproducción o distribución sin autorización está prohibida.\n" +
                "   \n" +
                "8. Aceptación de Términos: Al utilizar esta aplicación, aceptas todos los términos y condiciones establecidos en este documento.\n\n");

        scrollPane1 = new JScrollPane(textarea1);
        scrollPane1.setBounds(10, 40, 575, 200);
        add(scrollPane1);

        check1 = new JCheckBox("Yo " + name + " Acepto.");
        check1.setBounds(10, 250, 300, 30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 290, 100, 30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120, 290, 100, 30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        /*ImageIcon logo2 = new ImageIcon("../imagenes/elle.jpg");
        label2 = new JLabel(logo2);
        label2.setBounds(315, 135, 300, 300);
        add(label2);*/
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {

            Principal principal = new Principal();
            principal.setBounds(0, 0, 640, 535);
            principal.setVisible(true);
            principal.setResizable(false);
            principal.setLocationRelativeTo(null);
            this.setVisible(false);

        } else if (e.getSource() == boton2) {

            Aplicacion aplicacion = new Aplicacion();
            aplicacion.setBounds(0, 0, 350, 450);
            aplicacion.setVisible(true);
            aplicacion.setResizable(false);
            aplicacion.setLocationRelativeTo(null);
            this.setVisible(false);

        }
    }

    public void stateChanged(ChangeEvent e) {

        if (check1.isSelected()) {
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        Licencia licencia = new Licencia();
        licencia.setBounds(0, 0, 600, 360);
        licencia.setVisible(true);
        licencia.setResizable(false);
        licencia.setLocationRelativeTo(null);
    }
}
