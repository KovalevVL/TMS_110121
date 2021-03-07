package com.tms.human;

import com.tms.human.jacket.IJacket;
import com.tms.human.pants.IPants;
import com.tms.human.shoes.IShoes;

public class Man implements IJacket, IPants, IShoes {
    public String name;
    public String jacket;
    public String pants;
    public String shoes;

    Man(String name, String jacket, String pants, String shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public void PutMan() {
        putJacket();
        putPants();
        putShoes();
    }

    public void TakeOffMan() {
        takeOffJacket();
        takeOffPants();
        takeOffShoes();
    }

    @Override
    public void putJacket() {
        System.out.println(name + " надел на себя " + jacket);
    }

    @Override
    public void takeOffJacket() {
        System.out.println(name + " снял с себя " + jacket);
    }

    @Override
    public void putPants() {
        System.out.println(name + " надел на себя " + pants);
    }

    @Override
    public void takeOffPants() {
        System.out.println(name + " снял с себя " + pants);
    }

    @Override
    public void putShoes() {
        System.out.println(name + " надел на себя " + shoes);
    }

    @Override
    public void takeOffShoes() {
        System.out.println(name + " снял с себя " + shoes);
    }
}
