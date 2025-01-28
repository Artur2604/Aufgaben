package com.btcag.bootcamp.RobotWarsNew.BasedGame.Views;

import com.btcag.bootcamp.RobotWarsNew.BasedGame.Models.Robot;

public class RobotView {
    public static void display(Robot robot) {
        System.out.println("Dein Roboter heisst: " + robot.getName());
        System.out.println("Der Roboter befindet sich auf Position x:" + robot.getX() + " y:" + robot.getY());
    }
}
