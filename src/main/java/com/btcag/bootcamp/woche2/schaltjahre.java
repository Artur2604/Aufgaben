package com.btcag.bootcamp.woche2;

import java.util.Scanner;

public class schaltjahre {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        while (1 == 1) {
            System.out.println("Bitte geben Sie eine Jahreszahl ein:");
            int schaltjahr = scanner.nextInt();

            if (schaltjahr % 400 == 0) {
                System.out.println("Das ist ein Schlatjahr");
            } else if (schaltjahr % 100 == 0) {
                System.out.println("Das ist kein Schaltjahr");
            } else if (schaltjahr % 4 == 0) {
                System.out.println("Das ist ein Schaltjahr");
            } else {
                System.out.println("Das ist kein Schaltjahr");
            }


        }
    }
}
