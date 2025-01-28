package com.btcag.bootcamp.RobotWarsNew.BasedGame.Views;

import com.btcag.bootcamp.RobotWarsNew.BasedGame.Models.Robot;

public class WinnerView {
    public static void display(Robot winner) {
        System.out.print("                                   .''.       \n" +
                "       .''.      .        *''*    :_\\/_:     . \n" +
                "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                "  .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\n" +
                " :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\n" +
                " : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\n" +
                "  '..'  ':::'     * /\\ *     .'/.\\'.   '\n" +
                "      *            *..*         :\n" +
                "     *\n" +
                "        *");
        System.out.println();
        System.out.println(winner.getName() + " hat den Kampf gewonnen!");
    }

}
