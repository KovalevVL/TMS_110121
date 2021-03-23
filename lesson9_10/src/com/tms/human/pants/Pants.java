package com.tms.human.pants;

public class Pants implements IPants {
    @Override
    public void putPants() {
        System.out.println("Я надел штаны");
    }

    @Override
    public void takeOffPants() {
        System.out.println("Я снял штаны");
    }
}
