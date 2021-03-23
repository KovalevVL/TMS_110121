package com.tms.human.jacket;

public class Jacket implements IJacket {
    public Jacket() {
    }

    @Override
    public void putJacket() {
        System.out.println("Я надел куртку");
    }

    @Override
    public void takeOffJacket() {
        System.out.println("Я снял куртку");
    }
}
