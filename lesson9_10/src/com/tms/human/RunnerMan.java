package com.tms.human;

import com.tms.human.jacket.Jacket;
import com.tms.human.pants.Pants;
import com.tms.human.shoes.Shoes;

public class RunnerMan {
    public static void main (String [] args){
        Man man = new Man(new Jacket(),new Pants(),new Shoes());
        man.dressUp();
        man.takeOff();
    }

}



