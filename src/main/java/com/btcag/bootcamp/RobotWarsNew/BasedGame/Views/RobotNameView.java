package com.btcag.bootcamp.RobotWarsNew.BasedGame.Views;

import java.util.Scanner;

public class RobotNameView {
    public static String display() {
        Scanner readIn = new Scanner(System.in);
        String username = readIn.nextLine();

        while (username.length() < 3 || username.length() > 15) {
            System.out.println("Bitte geben Sie einen Namen für ihren Roboter ein: ");

            username = readIn.nextLine();

        }
        return username;
    }
}
