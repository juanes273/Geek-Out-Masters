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

    /**
     * Make the respective changes depending on the chosen die
     */
    public void cambios() {
        if (enUso[0] == 1) {

            //Se relanza el dado al que le aplicaremos el meeple
            Random aleatorio = new Random();
            enUso[1] = aleatorio.nextInt(6) + 1;

            //Se pone en la zona de utilizados el dado que recien usamos en este caso el meeple
            for (int i = 0; i < 10; i++) {
                if (utilizados[i] == 0) {
                    utilizados[i] = enUso[0];
                    break;
                }
            }

            //En el espacio del meeple se deja vacio
            activos[enUso[2] - 1] = 80 + enUso[2];
            //Ponemos de nuevo el dado al que se aplicó el meeple en el mismo lugar pero esta vez el dado cambió
            activos[enUso[3] - 1] = enUso[1];

        } else if (enUso[0] == 3) {


            if(inactivos[0]!=0 || inactivos[1]!=0 || inactivos[2]!=0 || inactivos[3]!=0 || inactivos[4]!=0 || inactivos[5]!=0) {

                //En la posicion que estaba el dado usado se pone un nuevo dado random
                Random aleatorio = new Random();
                activos[enUso[2] - 1] = aleatorio.nextInt(6) + 1;

                // se elimina un dado de la zona de inactivos
                for (int i = 0; i < 6; i++) {
                    if (inactivos[i] != 0) {
                        inactivos[i] = 0;
                        break;
                    }
                }
            }

            for (int i = 0; i < 10; i++) {
                if (utilizados[i] == 0) {
                    utilizados[i] = enUso[0];
                    break;
                }
            }


        } else if (enUso[0] == 4) {
            //pone el dado usado en la zona de utilizados
            for (int i = 0; i < 10; i++) {
                if (utilizados[i] == 0) {
                    utilizados[i] = enUso[0];
                    break;
                }
            }
            //pone el dado que se destruyó en la zona de dados inactivos
            for (int i = 0; i < 10; i++) {
                if (inactivos[i] == 0) {
                    inactivos[i] = enUso[1];
                    break;
                }
            }
            //pone el lugar del dado usado en 0
            activos[enUso[2] - 1] = 80 + enUso[2];
            //pone el lugar del dado destruido en 0
            activos[enUso[3] - 1] = 80 + enUso[3];

        } else if (enUso[0] == 5) {

            //pone el dado usado en la zona de utilizados
            for (int i = 0; i < 10; i++) {
                if (utilizados[i] == 0) {
                    utilizados[i] = enUso[0];
                    break;
                }
            }

            //dependiendo de el dado se pone su opuesto
            if (enUso[1] == 1) {
                enUso[1] = 4;
            } else if (enUso[1] == 2) {
                enUso[1] = 5;
            } else if (enUso[1] == 3) {
                enUso[1] = 6;
            } else if (enUso[1] == 4) {
                enUso[1] = 1;
            } else if (enUso[1] == 5) {
                enUso[1] = 2;
            } else if (enUso[1] == 6) {
                enUso[1] = 3;
            }

            //Se devuelve el dado cambiado a la posicion donde estaba y se elimina el superheroe usado
            activos[enUso[3] - 1] = enUso[1];
            activos[enUso[2] - 1] = 80 + enUso[2];
        }
    }
}