package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIGridBagLayout extends JFrame {
    public static final String MENSAJE_INICIO = "Bienvenido a Geek out Master"
            + "El juego consiste en que tienes que tienes que conseguir la cantidad mayor de 42  en cada ronda para intentar superar los 30  puntos.\n"
            + "El boton lanzar lanza los dados en la zona de activos."
            + "\n El boton reiniciar reinicia el juego"
            + "\n El boton actuar funciona luego de seleccionar un dado(en caso de que este tenga efecto solo) o dos dados(en caso de que el dado necesite otro para actuar)."
            + "\n El boton finalizar ronda termina la ronda, termina el turno el caso de que no queden mas movimientos posibles en la zona de activos. "
            + "\n Para poder accionar el boton lanzar "
            + "\npero ahora ganarás si sacas de nuevo el valor del Punto"
            + "\nsin que previamente hayas sacado 7";

    private Header headerProject;
    private JLabel dado1,dado2,dado3,dado4,dado5,dado6,dado7,dado8,dado9,dado10,dado11,dado12,dado13,dado14,dado15,dado16,dado17,dado18,dado19,dado20,dado21,dado22,dado23,dado24,lPuntaje;
    private JButton actuar,lanzar, ayuda, salir, finalizarRonda, boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,borrar,reiniciar;
    private JPanel panelDados, inactivos,activos,utilizados,puntaje;
    private ImageIcon imagenDado1,imagenDado2,imagenDado3,imagenDado4,imagenDado5,imagenDado6,imagenDado7,imagenDado8,imagenDado9,imagenDado10,imagenDado11,
    imagenDado12,imagenDado13,imagenDado14,imagenDado15,imagenDado16,imagenDado17,imagenDado18,imagenDado19,imagenDado20,imagenDado21,imagenDado22,imagenDado23,imagenDado24,imagenPuntaje;
    private JTextArea mensajeSalida, resultadosDados, ronda;
    private Escucha escucha;
    private ModelGame modelGame;

    public GUIGridBagLayout(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Geek out masters");
        this.setUndecorated(true);
        this.setBackground(new Color(255, 255,255,255));
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initGUI() {
        //Set up JFrame Container's Layout
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        //Create Listener Object or Control Object
        escucha = new Escucha();
        modelGame = new ModelGame();
        //Set up JComponents
        headerProject = new Header("Geek Out Masters", Color.BLACK);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(headerProject,constraints);

        ayuda = new JButton(" ? ");
        ayuda.addActionListener(escucha);
        constraints.gridx=0;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.LINE_START;
        this.add(ayuda,constraints);

        boton6 = new JButton("Dado 6");
        boton7 = new JButton("Dado 7");
        boton8 = new JButton("Dado 8");
        boton9 = new JButton("Dado 9");
        boton10 = new JButton("Dado 10");

        imagenDado1 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado1 = new JLabel(imagenDado1);
        imagenDado2 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado2 = new JLabel(imagenDado2);
        imagenDado3 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado3 = new JLabel(imagenDado3);
        imagenDado4 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado4 = new JLabel(imagenDado4);
        imagenDado5 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado5 = new JLabel(imagenDado5);
        imagenDado6 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado6 = new JLabel(imagenDado6);
        imagenDado7 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado7 = new JLabel(imagenDado7);
        imagenDado8 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado8 = new JLabel(imagenDado8);
        imagenDado9 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado9 = new JLabel(imagenDado9);
        imagenDado10 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado10 = new JLabel(imagenDado10);
        imagenDado11 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado11 = new JLabel(imagenDado11);
        imagenDado12 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado12 = new JLabel(imagenDado12);
        imagenDado13 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado13 = new JLabel(imagenDado13);
        imagenDado14 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado14 = new JLabel(imagenDado14);
        imagenDado15 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado15 = new JLabel(imagenDado15);
        imagenDado16 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado16 = new JLabel(imagenDado16);
        imagenDado17 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado17 = new JLabel(imagenDado17);
        imagenDado18 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado18 = new JLabel(imagenDado18);
        imagenDado19 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado19 = new JLabel(imagenDado19);
        imagenDado20 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado20 = new JLabel(imagenDado20);
        imagenDado21 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado21 = new JLabel(imagenDado21);
        imagenDado22 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado22 = new JLabel(imagenDado22);
        imagenDado23 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado23 = new JLabel(imagenDado23);
        imagenDado24 = new ImageIcon(getClass().getResource("/recursos/0.png"));
        dado24 = new JLabel(imagenDado24);
        imagenPuntaje = new ImageIcon(getClass().getResource("/recursos/p0.png"));
        lPuntaje = new JLabel(imagenPuntaje);

        salir = new JButton("Salir");
        salir.addActionListener(escucha);
        constraints.gridx=2;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.LINE_END;
        this.add(salir,constraints);

        inactivos = new JPanel();
        inactivos.setPreferredSize(new Dimension(400, 400));
        inactivos.setBorder(BorderFactory.createTitledBorder("inactivos"));
        //panelDados.add(lanzar);
        constraints.gridx=2;
        constraints.gridy=3;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        inactivos.add(dado8);
        inactivos.add(dado9);
        inactivos.add(dado10);
        inactivos.add(dado21);
        inactivos.add(dado22);
        inactivos.add(dado23);

        add(inactivos,constraints);

        activos = new JPanel();
        activos.setPreferredSize(new Dimension(400, 400));
        activos.setBorder(BorderFactory.createTitledBorder("activos"));
        //panelDados.add(lanzar);
        activos.add(dado1);
        activos.add(dado2);
        activos.add(dado3);
        activos.add(dado4);
        activos.add(dado5);
        activos.add(dado6);
        activos.add(dado7);
        activos.add(dado24);

        constraints.gridx=0;
        constraints.gridy=4;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;

        add(activos,constraints);

        utilizados = new JPanel();
        utilizados.setPreferredSize(new Dimension(400, 400));
        utilizados.setBorder(BorderFactory.createTitledBorder("Utilizados"));
        //panelDados.add(lanzar);
        constraints.gridx=0;
        constraints.gridy=3;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        utilizados.add(dado11);
        utilizados.add(dado12);
        utilizados.add(dado13);
        utilizados.add(dado14);
        utilizados.add(dado15);
        utilizados.add(dado16);
        utilizados.add(dado17);
        utilizados.add(dado18);
        utilizados.add(dado19);
        utilizados.add(dado20);

        add(utilizados,constraints);

        puntaje = new JPanel();
        puntaje.setPreferredSize(new Dimension(400, 400));
        puntaje.setBorder(BorderFactory.createTitledBorder("Puntaje"));
        constraints.gridx=2;
        constraints.gridy=4;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        puntaje.add(lPuntaje);

        add(puntaje,constraints);

        actuar = new JButton("Actuar");
        actuar.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=4;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.NORTH;
        this.add(actuar,constraints);

        lanzar = new JButton("Lanzar");
        lanzar.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=3;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        this.add(lanzar,constraints);

        finalizarRonda = new JButton("Finalizar ronda");
        finalizarRonda.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=4;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        this.add(finalizarRonda,constraints);


        ronda = new JTextArea(1, 1);
        ronda.setText("0");
        ronda.setBorder(BorderFactory.createTitledBorder("Rondas jugadas"));
        ronda.setLineWrap(true);
        constraints.gridx=1;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        add(ronda,constraints);


        boton1 = new JButton("Dado 1");
        boton1.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=1;
        constraints.gridwidth=5;
        constraints.fill=GridBagConstraints.LINE_START;
        constraints.anchor=GridBagConstraints.WEST;
        activos.add(boton1,constraints);

        boton2 = new JButton("Dado 2");
        boton2.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=5;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        activos.add(boton2,constraints);

        boton3 = new JButton("Dado 3");
        boton3.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=5;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        activos.add(boton3,constraints);

        boton4 = new JButton("Dado 4");
        boton4.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=5;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        activos.add(boton4,constraints);

        boton5 = new JButton("Dado 5");
        boton5.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=5;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        activos.add(boton5,constraints);

        boton6 = new JButton("Dado 6");
        boton6.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=5;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        activos.add(boton6,constraints);

        boton7 = new JButton("Dado 7");
        boton7.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=5;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.LINE_START;
        activos.add(boton7,constraints);

        borrar = new JButton("Borrar");
        borrar.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=5;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.LINE_START;
        activos.add(borrar,constraints);

        reiniciar = new JButton("Reiniciar");
        reiniciar.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=3;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.NORTH;
        this.add(reiniciar,constraints);

    }

    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUIGridBagLayout miProjectGUI = new GUIGridBagLayout();
        });
    }

    private class Escucha{

    }
}