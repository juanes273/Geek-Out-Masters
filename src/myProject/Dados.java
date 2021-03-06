package myProject;

import java.util.Random;

/**
 * Class Dado generate a random value between 1 and 6
 * @author Juan Esteban Brand Tovar--Jose Miguel Becerra Casierra
 * @version 1.0.0 date 27/01/2022
 */
public class Dados {
    private int cara;

    /**
     * Method that generate an random value to "cara"
     * @return number between (1,6)
     */
    public int getCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}