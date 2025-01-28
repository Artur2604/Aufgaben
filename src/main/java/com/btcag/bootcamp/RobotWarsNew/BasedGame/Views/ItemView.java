package com.btcag.bootcamp.RobotWarsNew.BasedGame.Views;

import com.btcag.bootcamp.RobotWarsNew.BasedGame.Models.Items;

public class ItemView {
    public  static void effectView(Items item){
        System.out.println("Sie haben ein Item eingesammelt. Der Effekt: "+item.effectName()+ " "+item.getValue());
    }
}
