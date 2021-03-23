package com.tms.human;

import com.tms.human.jacket.Jacket;
import com.tms.human.pants.Pants;
import com.tms.human.shoes.Shoes;


public class Man implements Does {
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Man(Jacket jacket, Pants pants, Shoes shoes) {
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Man() {
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket() {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants() {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes() {
        this.shoes = shoes;
    }

    @Override
    public String name(String name) {
        return null;
    }

    @Override
    public void dressUp() {
        jacket.putJacket();
        pants.putPants();
        shoes.putShoes();
    }

    @Override
    public void takeOff() {
        jacket.takeOffJacket();
        pants.takeOffPants();
        shoes.takeOffShoes();
    }
}



