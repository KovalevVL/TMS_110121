package com.tms.kosmos;

import com.tms.kosmos.cosmodrom.Cosmodrome;
import com.tms.kosmos.shattle.Shattle;


public class Runner {
    public static void main(String[] args) {
        Shattle shattle = new Shattle();
        Cosmodrome.startShattle(shattle);


    }
}
