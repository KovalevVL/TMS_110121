package com.tms.Transport;

//В  гражданский траспорт добовляем: количество пассажиров, наличие бизнесс-класса
public class CivilTransport extends AirTransport {
    int numberPassengers = 30;
    boolean businessClass;

    @Override
    public double getEnergy() {
        return 2000;
    }

    @Override
    public int getMaxSpeed() {
        return 1000;
    }

    @Override
    public double getWeight() {
        return 120000;
    }

    @Override
    public String getBrand() {
        return "Boeing";
    }

    @Override
    public int getWingspan() {
        return 33;
    }

    @Override
    public int getLaneLength() {
        return 2000;
    }

    //метод проверяемости количества пассажиров в самолете

    public void maxPassengeres(int maxPassengeres) {
        if (maxPassengeres <= numberPassengers) {
            System.out.println("Количество пассажаров соответсвует количеству посадочных мест");
        } else {
            System.out.println("Количество пассажиров больше количества посадочных мест");
        }
    }

    public void civilTr() {
        System.out.println("Гражданский воздушный траспорт мощностью " + getEnergy() + " л.с. или " + energyCalcul() + " киловват. Максимальной скоростью " + getMaxSpeed() + " км/ч . Общей массой " + getWeight() + " кг. Брендом " + getBrand());
    }
}
