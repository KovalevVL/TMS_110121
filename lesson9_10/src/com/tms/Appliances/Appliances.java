package com.tms.Appliances;

//Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня
public class Appliances {
    private boolean on = true;
    public String madeIn;

    Appliances(String madeIn) {
        this.madeIn=madeIn;
    }

    public void TurnOn() {
        if (on) {
            System.out.println("Бытовая техника подключена в розетку");
        } else {
            System.out.println("Бытовая техника не подключена в розетку");
        }
    }
}