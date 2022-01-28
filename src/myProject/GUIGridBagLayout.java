package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIGridBagLayout extends JFrame {
    public static final String MENSAJE_INICIO = " Bienvenido a Geek out Master"
            + "\n El juego consiste en que tienes que tienes que conseguir la cantidad mayor de 42  en cada ronda para intentar superar los 30  puntos.\n"
            + " El boton lanzar lanza los dados en la zona de activos."
            + "\n El boton reiniciar reinicia el juego"
            + "\n El boton actuar funciona luego de seleccionar un dado(en caso de que este tenga efecto solo) o dos dados(en caso de que el dado necesite otro para actuar)."
            + "\n El boton finalizar ronda termina la ronda, termina el turno el caso de que no queden mas movimientos posibles en la zona de activos. "
            + "\n Para poder accionar el boton lanzar debes haber presionado el boton  'Finalizar ronda', de lo contrario no funcionará"
            + "\n Las acciones de las caras del dado son:"
            + "\n -Meeple: permite al jugador poder volver a lanzar uno de los dados activos."
            + "\n -Cohete: permite al jugador eliminar un dado pasándolo al área de dados inactivos. "
            + "\n -Superhéroe: permie al jugador dar vuelta (mostrar la cara opuesta) de un dado de la zona de dados activos. Un Superhéroe no puede voltearse a sí mismo."
            + "\n -Corazón: permite al jugador tomar un dado de la zona de dados inactivos y lanzarlo en la zona de dados activos."
            + " Si es el último de los dados activos, hace que el jugador pierda todos los puntos que lleve hasta el momento."
            + "\n -42: Si el último o últimos dados activos tiene esta cara visible, se suman dichos puntos en el tablero de puntaje, acorde con las reglas indicadas, generando el puntaje de la ronda."
            + "\n En caso de que no se llegue a los 30 puntos en 5 ronda,  perderas automaticamente.";

    private Header headerProject;
    private JLabel dado1,dado2,dado3,dado4,dado5,dado6,dado7,dado8,dado9,dado10,dado11,dado12,dado13,dado14,dado15,dado16,dado17,dado18,dado19,dado20,dado21,dado22,dado23,dado24,lPuntaje;
    private JButton actuar,lanzar, ayuda, salir, finalizarRonda, boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,borrar,reiniciar;
    private JPanel inactivos,activos,utilizados,puntaje;
    private ImageIcon imagenDado1,imagenDado2,imagenDado3,imagenDado4,imagenDado5,imagenDado6,imagenDado7,imagenDado8,imagenDado9,imagenDado10,imagenDado11,
    imagenDado12,imagenDado13,imagenDado14,imagenDado15,imagenDado16,imagenDado17,imagenDado18,imagenDado19,imagenDado20,imagenDado21,imagenDado22,imagenDado23,imagenDado24,imagenPuntaje;
    private JTextArea  ronda;
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
        ronda.setEditable(false);
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

    private class Escucha implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==lanzar) {
                modelGame.borrarDragones();
                int activos[] = modelGame.getActivos();
                boolean estado = modelGame.getEstado();
                int rondaValor = modelGame.getRonda();
                boolean estadoLanzar = modelGame.getEstadoLanzarCambio();
                if(estado == false && rondaValor<5 && estadoLanzar==false) {
                    modelGame.estadoSumaCambioTrue();
                    modelGame.estadoLanzarCambioTrue();
                    modelGame.lanzarDados();
                    modelGame.cambiarEstadoTrue();
                    int inactivos[] = modelGame.getInactivos();
                    int utilizados[] = modelGame.getUtilizados();
                    int enUso[] = modelGame.getEnUso();
                    imagenDado1 = new ImageIcon(getClass().getResource("/recursos/" + activos[0] + ".png"));
                    dado1.setIcon(imagenDado1);
                    imagenDado2 = new ImageIcon(getClass().getResource("/recursos/" + activos[1] + ".png"));
                    dado2.setIcon(imagenDado2);
                    imagenDado3 = new ImageIcon(getClass().getResource("/recursos/" + activos[2] + ".png"));
                    dado3.setIcon(imagenDado3);
                    imagenDado4 = new ImageIcon(getClass().getResource("/recursos/" + activos[3] + ".png"));
                    dado4.setIcon(imagenDado4);
                    imagenDado5 = new ImageIcon(getClass().getResource("/recursos/" + activos[4] + ".png"));
                    dado5.setIcon(imagenDado5);
                    imagenDado6 = new ImageIcon(getClass().getResource("/recursos/" + activos[5] + ".png"));
                    dado6.setIcon(imagenDado6);
                    imagenDado7 = new ImageIcon(getClass().getResource("/recursos/" + activos[6] + ".png"));
                    dado7.setIcon(imagenDado7);
                    imagenDado8 = new ImageIcon(getClass().getResource("/recursos/" + inactivos[0] + ".png"));
                    dado8.setIcon(imagenDado8);
                    imagenDado9 = new ImageIcon(getClass().getResource("/recursos/" + inactivos[1] + ".png"));
                    dado9.setIcon(imagenDado9);
                    imagenDado10 = new ImageIcon(getClass().getResource("/recursos/" + inactivos[2] + ".png"));
                    dado10.setIcon(imagenDado10);
                    imagenDado11 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[0] + ".png"));
                    dado11.setIcon(imagenDado11);
                    imagenDado12 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[1] + ".png"));
                    dado12.setIcon(imagenDado12);
                    imagenDado13 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[2] + ".png"));
                    dado13.setIcon(imagenDado13);
                    imagenDado14 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[3] + ".png"));
                    dado14.setIcon(imagenDado14);
                    imagenDado15 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[4] + ".png"));
                    dado15.setIcon(imagenDado15);
                    imagenDado16 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[5] + ".png"));
                    dado16.setIcon(imagenDado16);
                    imagenDado17 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[6] + ".png"));
                    dado17.setIcon(imagenDado17);
                    imagenDado18 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[7] + ".png"));
                    dado18.setIcon(imagenDado18);
                    imagenDado19 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[8] + ".png"));
                    dado19.setIcon(imagenDado19);
                    imagenDado20 = new ImageIcon(getClass().getResource("/recursos/" + utilizados[9] + ".png"));
                    dado20.setIcon(imagenDado20);
                    imagenDado21 = new ImageIcon(getClass().getResource("/recursos/" + inactivos[3] + ".png"));
                    dado21.setIcon(imagenDado21);
                    imagenDado22 = new ImageIcon(getClass().getResource("/recursos/" + inactivos[4] + ".png"));
                    dado22.setIcon(imagenDado22);
                    imagenDado23 = new ImageIcon(getClass().getResource("/recursos/" + inactivos[5] + ".png"));
                    dado23.setIcon(imagenDado23);

                }else if (rondaValor==5){
                    ronda.setText("" + rondaValor);
                    JOptionPane.showMessageDialog(null, "Se acabaron las rondas");
                }else{
                    JOptionPane.showMessageDialog(null, "Debes finalizar esta ronda primero");
                    modelGame.cambiarEstadoTrue();
                }
            }else if(e.getSource()==salir){
                System.exit(0);
            }else if(e.getSource()==boton1) {
                int activos[] = modelGame.getActivos();
                int inactivos[] = modelGame.getInactivos();
                int utilizados[] = modelGame.getUtilizados();
                int enUso[] = modelGame.getEnUso();
                if ((enUso[0]==activos[0] && enUso[2]==1) || (enUso[1]==activos[0] && enUso[3]==1) ) {
                    JOptionPane.showMessageDialog(null, "No puedes seleccionar dos veces el mismo dado");
                }else{
                    if (activos[0] != 0) {
                        modelGame.meterenuso1();
                    } else {
                        JOptionPane.showMessageDialog(null, "Este espacio está vacio");
                    }
                }
            }else if(e.getSource()==boton2) {
                int activos[] = modelGame.getActivos();
                int inactivos[] = modelGame.getInactivos();
                int utilizados[] = modelGame.getUtilizados();
                int enUso[] = modelGame.getEnUso();
                if ((enUso[0]==activos[1] && enUso[2]==2) || (enUso[1]==activos[1] && enUso[3]==2) ) {
                    JOptionPane.showMessageDialog(null, "No puedes seleccionar dos veces el mismo dado");
                }else{
                    if (activos[1] != 0) {
                        modelGame.meterenuso2();
                    } else {
                        JOptionPane.showMessageDialog(null, "Este espacio está vacio");
                    }
                }
            }else if(e.getSource()==boton3) {
                int activos[] = modelGame.getActivos();
                int inactivos[] = modelGame.getInactivos();
                int utilizados[] = modelGame.getUtilizados();
                int enUso[] = modelGame.getEnUso();
                if ((enUso[0]==activos[2] && enUso[2]==3) || (enUso[1]==activos[2] && enUso[3]==3) ) {
                    JOptionPane.showMessageDialog(null, "No puedes seleccionar dos veces el mismo dado");
                }else{
                    if (activos[2] != 0) {
                        modelGame.meterenuso3();
                    } else {
                        JOptionPane.showMessageDialog(null, "Este espacio está vacio");
                    }
                }
            }else if(e.getSource()==boton4) {
                int activos[] = modelGame.getActivos();
                int inactivos[] = modelGame.getInactivos();
                int utilizados[] = modelGame.getUtilizados();
                int enUso[] = modelGame.getEnUso();
                if ((enUso[0]==activos[3] && enUso[2]==4) || (enUso[1]==activos[3] && enUso[3]==4) ) {
                    JOptionPane.showMessageDialog(null, "No puedes seleccionar dos veces el mismo dado");
                }else{
                    if (activos[3] != 0) {
                        modelGame.meterenuso4();
                    } else {
                        JOptionPane.showMessageDialog(null, "Este espacio está vacio");
                    }
                }
            }else if(e.getSource()==boton5) {
                int activos[] = modelGame.getActivos();
                int inactivos[] = modelGame.getInactivos();
                int utilizados[] = modelGame.getUtilizados();
                int enUso[] = modelGame.getEnUso();
                if ((enUso[0]==activos[4] && enUso[2]==5) || (enUso[1]==activos[4] && enUso[3]==5) ) {
                    JOptionPane.showMessageDialog(null, "No puedes seleccionar dos veces el mismo dado");
                }else{
                    if (activos[4] != 0) {
                        modelGame.meterenuso5();
                    } else {
                        JOptionPane.showMessageDialog(null, "Este espacio está vacio");
                    }
                }
            }else if(e.getSource()==boton6) {
                int activos[] = modelGame.getActivos();
                int inactivos[] = modelGame.getInactivos();
                int utilizados[] = modelGame.getUtilizados();
                int enUso[] = modelGame.getEnUso();
                if ((enUso[0]==activos[5] && enUso[2]==6) || (enUso[1]==activos[5] && enUso[3]==6) ) {
                    JOptionPane.showMessageDialog(null, "No puedes seleccionar dos veces el mismo dado");
                }else{
                    if (activos[5] != 0) {
                        modelGame.meterenuso6();
                    } else {
                        JOptionPane.showMessageDialog(null, "Este espacio está vacio");
                    }
                }
            }else if(e.getSource()==boton7) {
                int activos[] = modelGame.getActivos();
                int inactivos[] = modelGame.getInactivos();
                int utilizados[] = modelGame.getUtilizados();
                int enUso[] = modelGame.getEnUso();
                if ((enUso[0]==activos[6] && enUso[2]==7) || (enUso[1]==activos[6] && enUso[3]==7) ) {
                    JOptionPane.showMessageDialog(null, "No puedes seleccionar dos veces el mismo dado");
                }else{
                    if (activos[6] != 0) {
                        modelGame.meterenuso7();
                    } else {
                        JOptionPane.showMessageDialog(null, "Este espacio está vacio");
                    }
                }
            }else if(e.getSource()==actuar){
                int enUso[] = modelGame.getEnUso();
                int activos[] = modelGame.getActivos();
                int inactivos[] = modelGame.getInactivos();
                int utilizados[] = modelGame.getUtilizados();
                boolean estadou = modelGame.getEstado();
                modelGame.conteo();
                modelGame.determinarEstado();
                modelGame.borrarConteo();
                if(((enUso[0]==3 || enUso[0]==2 || enUso[0]==6) && enUso[1]==0) || ((enUso[0]==1 || enUso[0]==4 || enUso[0]==5) && enUso[1]!=0)){
                    if(enUso[0] == 0 && enUso[2]==0){
                        JOptionPane.showMessageDialog(null, "Este espacio está vacio");
                    }else{
                        modelGame.cambios();
                        enUso[0] = 0;
                        enUso[1] = 0;
                        enUso[2] = 0;
                        enUso[3] = 0;
                        imagenDado1 = new ImageIcon(getClass().getResource("/recursos/"+activos[0]+".png"));
                        dado1.setIcon(imagenDado1);
                        imagenDado2 = new ImageIcon(getClass().getResource("/recursos/"+activos[1]+".png"));
                        dado2.setIcon(imagenDado2);
                        imagenDado3 = new ImageIcon(getClass().getResource("/recursos/"+activos[2]+".png"));
                        dado3.setIcon(imagenDado3);
                        imagenDado4 = new ImageIcon(getClass().getResource("/recursos/"+activos[3]+".png"));
                        dado4.setIcon(imagenDado4);
                        imagenDado5 = new ImageIcon(getClass().getResource("/recursos/"+activos[4]+".png"));
                        dado5.setIcon(imagenDado5);
                        imagenDado6 = new ImageIcon(getClass().getResource("/recursos/"+activos[5]+".png"));
                        dado6.setIcon(imagenDado6);
                        imagenDado7 = new ImageIcon(getClass().getResource("/recursos/"+activos[6]+".png"));
                        dado7.setIcon(imagenDado7);
                        imagenDado8 = new ImageIcon(getClass().getResource("/recursos/"+inactivos[0]+".png"));
                        dado8.setIcon(imagenDado8);
                        imagenDado9 = new ImageIcon(getClass().getResource("/recursos/"+inactivos[1]+".png"));
                        dado9.setIcon(imagenDado9);
                        imagenDado10 = new ImageIcon(getClass().getResource("/recursos/"+inactivos[2]+".png"));
                        dado10.setIcon(imagenDado10);
                        imagenDado11 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[0]+".png"));
                        dado11.setIcon(imagenDado11);
                        imagenDado12 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[1]+".png"));
                        dado12.setIcon(imagenDado12);
                        imagenDado13 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[2]+".png"));
                        dado13.setIcon(imagenDado13);
                        imagenDado14 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[3]+".png"));
                        dado14.setIcon(imagenDado14);
                        imagenDado15 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[4]+".png"));
                        dado15.setIcon(imagenDado15);
                        imagenDado16 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[5]+".png"));
                        dado16.setIcon(imagenDado16);
                        imagenDado17 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[6]+".png"));
                        dado17.setIcon(imagenDado17);
                        imagenDado18 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[7]+".png"));
                        dado18.setIcon(imagenDado18);
                        imagenDado19 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[8]+".png"));
                        dado19.setIcon(imagenDado19);
                        imagenDado20 = new ImageIcon(getClass().getResource("/recursos/"+utilizados[9]+".png"));
                        dado20.setIcon(imagenDado20);
                        imagenDado21 = new ImageIcon(getClass().getResource("/recursos/"+inactivos[3]+".png"));
                        dado21.setIcon(imagenDado21);
                        imagenDado22 = new ImageIcon(getClass().getResource("/recursos/"+inactivos[4]+".png"));
                        dado22.setIcon(imagenDado22);
                        imagenDado23 = new ImageIcon(getClass().getResource("/recursos/"+inactivos[5]+".png"));
                        dado23.setIcon(imagenDado23);
                        modelGame.borrarConteo();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No puedes usar este dado solo");
                }
            }else if(e.getSource()==finalizarRonda){
                boolean estadoSuma = modelGame.getEstadoSuma();
                int activos[] = modelGame.getActivos();
                modelGame.conteo();
                modelGame.determinarEstado();
                modelGame.comprobarDragones();
                if(estadoSuma==true){modelGame.guardarCuarentaidos(); modelGame.guardarDragones();}
                int cuarentaidos = modelGame.getCuarentaidos();
                int activosContados[] = modelGame.getActivosContados();
                boolean estado = modelGame.getEstado();
                modelGame.determinarEstado();
                int rondax = modelGame.getRonda();
                if(estado == false && rondax<5 && estadoSuma==true){
                    modelGame.comprobarDragones();
                    int cuarentaidox = modelGame.getCuarentaidos();
                    modelGame.aumentoRonda();
                    int rondat = modelGame.getRonda();
                    modelGame.estadoLanzarCambioFalse();
                    ronda.setText(""+rondat);
                    modelGame.estadoSumaCambioFalse();
                    imagenPuntaje = new ImageIcon(getClass().getResource("/recursos/p"+cuarentaidox+".png"));
                    lPuntaje.setIcon(imagenPuntaje);
                    if(cuarentaidos<8 && rondax==4){
                        JOptionPane.showMessageDialog(null, "Perdiste, presiona reiniciar para jugar de nuevo");
                    }else if(cuarentaidos>=8){
                        JOptionPane.showMessageDialog(null, "Ganaste, presiona reiniciar para jugar de nuevo");
                    }else{
                        JOptionPane.showMessageDialog(null, "Acabaste la ronda " + rondat);
                    }
                }else if(estado == false && rondax<5){
                    JOptionPane.showMessageDialog(null, "Por favor, relanza los dados para continuar");
                    modelGame.borrarConteo();
                }else{
                    JOptionPane.showMessageDialog(null, "Aun te quedan movimientos, no puedes terminar la ronda");
                    modelGame.borrarConteo();
                }
            }else if(e.getSource()==borrar){
                modelGame.deseleccionar();
            }else if(e.getSource()==reiniciar){
                modelGame.estadoLanzarCambioFalse();
                modelGame.reinciarRonda();
                boolean estado = modelGame.getEstado();
                int rondaValor = modelGame.getRonda();
                int activos[] = modelGame.getActivos();
                int inactivos[] = modelGame.getInactivos();
                int utilizados[] = modelGame.getUtilizados();
                int enUso[] = modelGame.getEnUso();
                imagenDado1 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado1.setIcon(imagenDado1);
                imagenDado2 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado2.setIcon(imagenDado2);
                imagenDado3 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado3.setIcon(imagenDado3);
                imagenDado4 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado4.setIcon(imagenDado4);
                imagenDado5 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado5.setIcon(imagenDado5);
                imagenDado6 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado6.setIcon(imagenDado6);
                imagenDado7 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado7.setIcon(imagenDado7);
                imagenDado8 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado8.setIcon(imagenDado8);
                imagenDado9 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado9.setIcon(imagenDado9);
                imagenDado10 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado10.setIcon(imagenDado10);
                imagenDado11 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado11.setIcon(imagenDado11);
                imagenDado12 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado12.setIcon(imagenDado12);
                imagenDado13 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado13.setIcon(imagenDado13);
                imagenDado14 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado14.setIcon(imagenDado14);
                imagenDado15 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado15.setIcon(imagenDado15);
                imagenDado16 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado16.setIcon(imagenDado16);
                imagenDado17 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado17.setIcon(imagenDado17);
                imagenDado18 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado18.setIcon(imagenDado18);
                imagenDado19 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado19.setIcon(imagenDado19);
                imagenDado20 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado20.setIcon(imagenDado20);
                imagenDado21 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado21.setIcon(imagenDado21);
                imagenDado22 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado22.setIcon(imagenDado22);
                imagenDado23 = new ImageIcon(getClass().getResource("/recursos/0.png"));
                dado23.setIcon(imagenDado23);
                modelGame.borrarConteo();
                ronda.setText("" + rondaValor);
                modelGame.determinarEstado();
                modelGame.borrarCuarentaidos();
                int cuarentaidos = modelGame.getCuarentaidos();
                imagenPuntaje = new ImageIcon(getClass().getResource("/recursos/p"+cuarentaidos+".png"));
                lPuntaje.setIcon(imagenPuntaje);
            }else if(e.getSource()==ayuda) {
                JOptionPane.showMessageDialog(null, MENSAJE_INICIO);
            }
        }
    }
}