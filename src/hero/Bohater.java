package hero;

import places.Miejsce;
import weapon.Bron;

/**
 * Created by Daria on 2017-07-08.
 */
public abstract class Bohater {

    private String imie;
    private int poziom;
    private Bron bron;

    public Bohater(String imie, int poziom, Bron bron) {
        this.imie = imie;
        this.poziom = poziom;
        this.bron = bron;
    }

    public String getImie() {
        return imie;
    }

    public int getPoziom() {
        return poziom;
    }

    public void setPoziom(int poziom) {
        this.poziom = poziom;
    }

    public Bron getBron() {
        return bron;
    }

    public abstract void podroz(Miejsce miejsce);
}
