package com.btcag.bootcamp.woche1;

import java.util.Scanner;

public class quersumme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie hier eine Zahl ein:");
        long auslesen = scanner.nextLong();
        long quersumme = 0;
        while (auslesen !=0) {
            quersumme += auslesen % 10;
            auslesen /= 10;
        }
        System.out.println("Die Quersumme ist: "+ quersumme);


    }
}
