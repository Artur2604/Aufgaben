package com.btcag.bootcamp.RobotWarsNew.Views;

import com.btcag.bootcamp.RobotWarsNew.Models.Items;
import com.btcag.bootcamp.RobotWarsNew.Models.Robot;

public class ItemView {
    public  static void effectView(Items item){
        System.out.println("Sie haben ein Item eingesammelt. Der Effekt: "+item.effectName()+ " "+item.getValue());
    }

}
