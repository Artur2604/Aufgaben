package com.btcag.bootcamp.woche1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zahl;
        System.out.println("Bitte gib einen Satz ein:");
        zahl = scanner.nextLine();

        System.out.println("Deine Zahl war:" + zahl );

    }
}
