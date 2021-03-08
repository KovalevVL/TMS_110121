package com.tms.kosmos.cosmodrom;

import com.tms.kosmos.start.IStart;

public class Cosmodrome {

    public void startShattle(IStart shattle) {
        if (shattle.checkingSystem()) {
            System.out.println("Предстартовая проверка прошла удачно");
            shattle.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println("Обратный отсчет " + i);
            }
            shattle.start();
        }
    }
}
