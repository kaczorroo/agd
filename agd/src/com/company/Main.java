package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * pyramy jak kwota i ile rat
         * nastepnie okreslam jesli 6-12 to 2,5% itp
         * obliczam podaje wynik
         */
        System.out.println("Start programu");
        System.out.println("Podaj cene produktu.");

        Scanner cenawpisz = new Scanner(System.in);
        int cena = cenawpisz.nextInt();

        System.out.println("Podaj ilość rat.");

//        Scanner ilerat = new Scanner(System.in);
        int rata = cenawpisz.nextInt();
        cenawpisz.close();

        double wynik1 = cena*2.5/rata;
        double wynik11 = cena*2.5;
        double wynik2 = cena*5/rata;
        double wynik21 = cena*5;
        double wynik3 = cena*10/rata;
        double wynik31 = cena*10;

        if(6 >= rata && rata <= 12){
            System.out.println("Twoja rata wyniesie " + wynik1 + " zł");
            System.out.println("Przy " + rata + " ratach kwota całkowita wyniesie " + wynik11 + " zł");
        }
        else if(13 >= rata &&rata<=24){
            System.out.println("Twoja rata wyniesie " + wynik2 + " zł");
            System.out.println("Przy " + rata + " ratach kwota całkowita wyniesie " + wynik21 + " zł");
        }
        else if(25 >= rata &&rata<=48){
            System.out.println("Twoja rata wyniesie " + wynik3 + " zł");
            System.out.println("Przy " + rata + " ratach kwota całkowita wyniesie " + wynik31 + " zł");
        }
        else System.out.println("Nie dotyczy");
    }
}
