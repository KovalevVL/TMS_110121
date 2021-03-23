package com.tms.human.shoes;

public class Shoes implements IShoes {
    @Override
    public void putShoes() {
        System.out.println("Я надел обувь");
    }

    @Override
    public void takeOffShoes() {
        System.out.println("Я снял обувь");
    }
}
