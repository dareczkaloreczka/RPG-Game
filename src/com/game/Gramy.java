package com.game;

import hero.Bohater;
import hero.Czarodziejka;
import places.Miejsce;
import weapon.MagicznyKij;

import java.util.Scanner;

import static places.Miejsce.LOCH;

/**
 * Created by Daria on 2017-07-08.
 */
public class Gramy {

    public static void main(String[] args) {

        GameControl gra = new GameControl();
        gra.uruchomGre();


       /* Bohater czarodziejka = new Czarodziejka("Hermiona", 2, new MagicznyKij());

        czarodziejka.podroz(LOCH);*/
    }

}
