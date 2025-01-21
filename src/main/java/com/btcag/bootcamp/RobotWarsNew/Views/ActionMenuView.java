package com.btcag.bootcamp.RobotWarsNew.Views;

import java.util.Scanner;

public class ActionMenuView {
    public static int action() {
        Scanner readIn = new Scanner(System.in);
        System.out.println( " Welche Aktion wollen Sie durchführen ? \n" +
                "[1] Bewegen \n" +
                "[2] Angreifen \n" +
                "[3] Abbrechen \n");
        return readIn.nextInt();
    }
}
