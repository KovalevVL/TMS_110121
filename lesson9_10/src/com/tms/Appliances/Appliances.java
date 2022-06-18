package com.tms.Appliances;

//Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня
abstract class Appliances {
    public String madeIn;
    public static boolean turn = true;

    Appliances(String madeIn) {
        this.madeIn = madeIn;
    }

    public void Turn220() {
        if (turn) {
            System.out.println("Включено");
        } else {
            System.out.println("Выключено");
        }
    }


}