package com.btcag.bootcamp.woche1;

import java.util.Scanner;

public class rueckwertausgeben2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Geben Sie hier eine Zahl ein:");
        String auslesen = scanner.nextLine();
        String rueckwertauslesen = new StringBuilder(auslesen).reverse().toString();
        System.out.println("Ihre Zahl lautet Rueckwerts:" +rueckwertauslesen);



    }
}



