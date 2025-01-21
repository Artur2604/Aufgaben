package com.btcag.bootcamp.woche1;

import java.util.Scanner;

public class primzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie hier eine Primzahl ein:");
        int zahl = scanner.nextInt();

        while (zahl <= 1) {
            System.out.println("Die Eingabe muss eine Zahl sein die größer als 1 ist. Bitte erneut eingeben:");
            zahl = scanner.nextInt();

        }

        

    }
}
