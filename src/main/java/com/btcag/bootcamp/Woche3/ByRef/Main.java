package com.btcag.bootcamp.Woche3.ByRef;

import java.util.Scanner;

public class Main extends Rechnen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welche Gesamtzahl soll benutzt werden? ");
        WertObjekte zahl = new WertObjekte(sc.nextLong());

        System.out.println();

        System.out.println("Wie oft soll der Wert verdoppelt werden? ");
        int counter = sc.nextInt();
        System.out.println();

        while (counter > 0) {
            doubleLongValue(zahl);
            System.out.println(zahl.value);
            System.out.println();
            counter--;
        }
    }
}
