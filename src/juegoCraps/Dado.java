package juegoCraps;

import java.util.Random;

/**
 * Class Dado generate a Rando value between 1 and 6
 * @author Sebastian Salas
 * @version v.1.0.0 date 6/12/2021
 */
public class Dado {
    private int cara;

    /**
     * Method that generate an random value to cara
     * @return number between (1,6)
     */
    public int getCara() {
        Random aleatorio = new Random();
        //nextInt genera aleatorio comprendido entre 0 y 5
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}
