package com.btcag.bootcamp.woche2;

import java.util.Scanner;

public class viergewinnt {
    public static void main(String[] args) {

        String spieler1;
        Scanner scanner = new Scanner(System.in);
        do {


            System.out.println("Spieler 1, gib deinen Namen ein! (Mindestens 3 Zeichen und maximal 15 Zeichen)");

            spieler1 = scanner.nextLine();
        }
        while (spieler1.length() < 3 || spieler1.length() > 15);


        System.out.println("Dein Name lautet: " + spieler1);

        String spieler2;

        do {


            System.out.println("Spieler 2, gib deinen Namen ein! (Mindestens 3 Zeichen und maximal 15 Zeichen)");

            spieler2 = scanner.nextLine();
        }
        while (spieler2.length() < 3 || spieler2.length() > 15);


        System.out.println("Dein Name lautet: " + spieler2);



        int x = 6;
        int y = 7;
        String [][] spielfeld = new String [x][y];

        for (int i = 0; i < x; i++)  {
            for (int j = 0; j < y; j++){
                spielfeld[i][j] = "[ ]";
            }
        }
        for (int i = 0; i < x; i++ ) {
            for (int j = 0; j < y; j++){
                System.out.print(spielfeld[i][j]);
            }
            System.out.println();
        }

    }



}
