package com.tms.Appliances;

public class Fridge extends Appliances {
    public String name;
    public String color;
    public int price;

    Fridge(String name, String color, int price,String madeIn) {
        super(madeIn);
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public void TurnOn() {
    }
}

