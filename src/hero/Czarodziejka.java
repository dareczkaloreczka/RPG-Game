package hero;

import places.Miejsce;
import weapon.Bron;

/**
 * Created by Daria on 2017-07-08.
 */
public class Czarodziejka extends Bohater {

    public Czarodziejka(String imie, int poziom, Bron bron) {
        super(imie, poziom, bron);
    }

    @Override
    public void podroz(Miejsce miejsce) {
        System.out.println("Ide do miejsca: " + miejsce + "...");
        System.out.println("Spotykam potwora: "+ miejsce.getPotwor().getNazwa()+ "...");
        boolean czyWygralam = getBron().atakuj(miejsce.getPotwor());
        if (czyWygralam){
            setPoziom(getPoziom() + 1);
            System.out.println("Hura! Pokonałam potwora " + miejsce.getPotwor().getNazwa()
                                + " przechodze na poziom " + getPoziom() + "!!!");
        } else {
            System.out.println("oooh nieee! Dzwoncie po karetke!");
        }

    }
}
