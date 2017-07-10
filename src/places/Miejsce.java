package places;

import monster.Jin;
import monster.Potwor;
import monster.Smok;
import monster.Wampir;

import static monster.TypPotwora.FIZYCZNY;
import static monster.TypPotwora.LATAJACY;
import static monster.TypPotwora.MAGICZNY;

/**
 * Created by Daria on 2017-07-08.
 */
public enum Miejsce {

    WAWOZ,
    LOCH,
    PIWNICA;

    private final Potwor potwor;

    Miejsce() {
        Potwor[] potwory = new Potwor[3];
        potwory[0] = new Smok("Bazyli", 200, LATAJACY);
        potwory[1] = new Wampir("Dracula", 150, FIZYCZNY);
        potwory[2] = new Jin("Seagrams", 300, MAGICZNY);
        this.potwor = potwory[(int) (Math.random() * 3)];
    }

    public Potwor getPotwor() {
        return potwor;
    }
}


    /*WAWOZ(new Smok("Bazyli",200, LATAJACY)),
    LOCH(new Wampir("Dracula", 150, FIZYCZNY)),
    PIWNICA(new Jin("Seagrams", 300, MAGICZNY));

    private final Potwor potwor;

    Miejsce(Potwor potwor) {

        this.potwor = potwor;
    }

    public Potwor getPotwor() {
        return potwor;
    }*/

