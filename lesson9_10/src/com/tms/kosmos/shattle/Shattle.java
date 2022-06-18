package com.tms.kosmos.shattle;

import com.tms.kosmos.start.IStart;

public class Shattle implements IStart {

    @Override
    public boolean checkingSystem() {
        int a = (int) (Math.random() * 11);
        if (a > 3) {
            System.out.println("Проверка прошла успешо");
            return true;
        } else {
            System.out.println("Проверка не прошла");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}



