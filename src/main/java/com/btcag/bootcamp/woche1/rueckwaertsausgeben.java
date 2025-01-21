package com.btcag.bootcamp.woche1;

import java.util.Scanner;

public class rueckwaertsausgeben {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Geben Sie hier eine Zahl ein:");
        long auslesen = scanner.nextLong();
        String auslesen2 = Long.toString (auslesen);
        String rueckwaerts =new StringBuilder (auslesen2). reverse(). toString();
        System.out.println("Die Zahl lautet rückwärts:" + rueckwaerts);


    }
}
