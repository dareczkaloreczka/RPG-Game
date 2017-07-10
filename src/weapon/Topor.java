package weapon;

import monster.Potwor;
import monster.TypPotwora;

/**
 * Created by Daria on 2017-07-08.
 */
public class Topor implements Bron {

    public static int FIZCZNY_OBRAZENIA = 100;
    public static int LATAJACY_OBRAZENIA = 80;
    public static int MAGICZNY_OBRAZENIA = 30;
    boolean czyPrzezyl;

    @Override
    public boolean atakuj(Potwor potwor) {

        int zyciePotwora = potwor.getZycie();
        TypPotwora typPotwora = potwor.getTypPotwora();

        switch (typPotwora) {
            case FIZYCZNY:
                czyPrzezyl = (zyciePotwora - FIZCZNY_OBRAZENIA) >= 0;
                break;
            case LATAJACY:
                czyPrzezyl = (zyciePotwora - LATAJACY_OBRAZENIA) >= 0;
                break;
            case MAGICZNY:
                czyPrzezyl = (zyciePotwora - MAGICZNY_OBRAZENIA) >= 0;
                break;
        }
        return czyPrzezyl;


    }
}
