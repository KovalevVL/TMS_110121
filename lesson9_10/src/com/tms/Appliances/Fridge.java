package com.tms.Appliances;

public class Fridge extends Appliances {
    public String name;
    public String color;
    public int price;
    public static int voltage;

    Fridge(String madeIn,String name, String color, int price, int voltage) {
        super(madeIn);
        this.name=name;
        this.color=color;
        this.price=price;
        this.voltage=voltage;
    }
    @Override
    public void Turn220(){
        if (voltage <= 220) {
            System.out.println("Техника включена в сеть 220 Вт");
        } else {
            System.out.println("Перенапряжение");
        }
    }
}

