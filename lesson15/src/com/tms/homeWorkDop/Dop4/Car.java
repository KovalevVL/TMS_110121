package com.tms.homeWorkDop.Dop4;

//Сеарилизовать объект Автомобиль( марка, скорость, цена).
//После сериализации произвести обратный процесс.

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString (){
        return "Brand: " + brand + " . Speed: " + speed + " . Price: " + price;
    }


}

