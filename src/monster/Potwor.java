package monster;

/**
 * Created by Daria on 2017-07-08.
 */
public abstract class Potwor {

    String nazwa;
    int zycie;
    TypPotwora typPotwora;

    public Potwor(String nazwa, int zycie, TypPotwora typPotwora) {
        this.nazwa = nazwa;
        this.zycie = zycie;
        this.typPotwora = typPotwora;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getZycie() {
        return zycie;
    }

    public TypPotwora getTypPotwora() {
        return typPotwora;
    }
}
