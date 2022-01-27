package myProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ModelGame {
    private Dados dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private int[] activos, inactivos, utilizados, enUso,activosContados;
    private int puntajeRonda, ronda, puntajeTotal,dragones, cuarentaidos, inactivosFinal;
    private String mensaje;
    private boolean estadoRonda,estadoLanzar,estadoSuma;

    /**
     * Class constructor
     */
    public ModelGame() {

        dado1 = new Dados();
        dado2 = new Dados();
        dado3 = new Dados();
        dado4 = new Dados();
        dado5 = new Dados();
        dado6 = new Dados();
        dado7 = new Dados();
        dado8 = new Dados();
        dado9 = new Dados();
        dado10 = new Dados();
        activos = new int[7];
        inactivos = new int[6];
        utilizados = new int[10];
        enUso = new int[4];
        puntajeRonda = 0;
        ronda = 0;
        estadoRonda = false;
        puntajeTotal = 0;
        activosContados = new int[6];
        inactivosFinal = 0;
        estadoLanzar = false;
        estadoSuma = true;
        cuarentaidos = 0;
        dragones = 0;
}
}