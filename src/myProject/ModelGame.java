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

    /**
     * Put the default values to each string,array and others
     */
    public void lanzarDados() {
        activos[0] = dado1.getCara();
        activos[1] = dado2.getCara();
        activos[2] = dado3.getCara();
        activos[3] = dado4.getCara();
        activos[4] = dado5.getCara();
        activos[5] = dado6.getCara();
        activos[6] = dado7.getCara();
        activosContados[0] = 0;
        activosContados[1] = 0;
        activosContados[2] = 0;
        activosContados[3] = 0;
        activosContados[4] = 0;
        activosContados[5] = 0;
        inactivos[0] = dado8.getCara();
        inactivos[1] = dado9.getCara();
        inactivos[2] = dado10.getCara();
        inactivos[3] = 0;
        inactivos[4] = 0;
        inactivos[5] = 0;
        enUso[0] = 0;
        enUso[1] = 0;
        enUso[2] = 0;
        enUso[3] = 0;
        estadoRonda = false;

        for (int i = 0; i < 10; i++) {
            utilizados[i] = 0;
        }
    }
}