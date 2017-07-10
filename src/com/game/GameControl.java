package com.game;

import hero.Bohater;
import hero.Wojownik;
import places.Miejsce;
import weapon.*;

import java.util.Scanner;

import static places.Miejsce.LOCH;
import static places.Miejsce.PIWNICA;
import static places.Miejsce.WAWOZ;

/**
 * Created by Daria on 2017-07-08.
 */
public class GameControl {

    Bron wybranaBron;
    Bohater wybranyBohater;
    Miejsce wybraneMiejsce;

    public void setWybranaBron(Bron wybranaBron) {
        this.wybranaBron = wybranaBron;
    }

    public void setWybranyBohater(Bohater wybranyBohater) {
        this.wybranyBohater = wybranyBohater;
    }

    public void setWybraneMiejsce(Miejsce wybraneMiejsce) {
        this.wybraneMiejsce = wybraneMiejsce;
    }

    public void uruchomGre(){
        Scanner gamePad = new Scanner(System.in);
        System.out.println("Wybierz poziom gry od 0 do 10: ");
        int poziom = gamePad.nextInt();
        gamePad.nextLine();
        System.out.println("Wybierz swoją postać: (Wojownik/Czarodziejka/Zlodziej)");
        String postac = gamePad.nextLine();
        System.out.println("Podaj imie swojej postaci: ");
        String imie = gamePad.nextLine();
        System.out.println("Wybierz swoja bron: (Luk/Magiczny Kij/Miecz/Sztylet/Topor)");
        String bron = gamePad.nextLine();
        switch (bron){
            case "Luk":
                setWybranaBron(new Luk());
                break;
            case "Miagiczny Kij":
                setWybranaBron(new MagicznyKij());
                break;
            case "Miecz":
                setWybranaBron(new Miecz());
                break;
            case "Sztylet":
                setWybranaBron(new Sztylet());
                break;
            case "Topor":
                setWybranaBron(new Topor());
                break;
        }
        switch (postac){
            case "Wojownik":
                setWybranyBohater(new Wojownik(imie, poziom, wybranaBron));
                break;
            case "Czaodziejka":
                setWybranyBohater(new Wojownik(imie, poziom, wybranaBron));
                break;
            case "Zlodziej":
                setWybranyBohater(new Wojownik(imie, poziom, wybranaBron));
                break;
        }
        System.out.println("Dokad sie wybieramy? (Wawoz/Loch/Piwnica");
        String miejsce = gamePad.nextLine();
        switch (miejsce){
            case "Wawoz":
                setWybraneMiejsce(WAWOZ);
                break;
            case "Loch":
                setWybraneMiejsce(LOCH);
                break;
            case "Piwnica":
                setWybraneMiejsce(PIWNICA);
                break;

        }
        System.out.println("Super! Zaczynajmy gre!");

        wybranyBohater.podroz(wybraneMiejsce);


    }


        }



