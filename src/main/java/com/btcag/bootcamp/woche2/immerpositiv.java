package com.btcag.bootcamp.woche2;

import java.util.Scanner;

public class immerpositiv {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();

        int positivezahl;
        if (zahl < 0) {
            positivezahl = -zahl;
        } else {
            positivezahl = zahl;
        }

        System.out.println("Die positive Zahl ist:" + positivezahl);
    }
}
