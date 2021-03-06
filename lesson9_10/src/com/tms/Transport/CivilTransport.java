package com.tms.Transport;

//В  гражданский траспорт добовляем: количество пассажиров, наличие бизнесс-класса
public class CivilTransport extends AirTransport {
    int numberPassengers;
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

    public void MaxPassengeres(int maxPassengeres) {
        if (maxPassengeres <= numberPassengers) {
            System.out.println("Количество пассажаров соответсвует количеству посадочных мест");
        } else {
            System.out.println("Количество пассажиров больше количества посадочных мест");
        }
    }

    @Override
    public void print() {
        System.out.println("Гражданский транспорт мощностью " + getEnergy() + "максимальной скоростью " + getMaxSpeed() + " общей массой " + getWeight() + " и брендом " + getBrand());
    }
}
