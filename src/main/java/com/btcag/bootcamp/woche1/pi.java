package com.btcag.bootcamp.woche1;

import java.util.Scanner;

public class pi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib hier eine Anzahl ein:");
        int anzahl = scanner.nextInt();

        double pi = 0.0;
        int i =0;

        while (i < anzahl) {
            double bruch = 1.0 / (2 * i + 1);

            pi += (i % 2 * 2 - 1) * bruch;

            i++;
        }
        pi *=4;

        System.out.println("Die angenährt Zahl Pi nach " + anzahl + " ist: " +pi);
    }
}
