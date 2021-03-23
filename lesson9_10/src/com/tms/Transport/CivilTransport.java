package com.tms.Transport;

//В  гражданский траспорт добовляем: количество пассажиров, наличие бизнесс-класса
public class CivilTransport extends AirTransport {
    int numberPassengers = 30;
    boolean businessClass;

    CivilTransport(double energy, int maxSpeed, double weight, String brand, int wingspan, int laneLength, int numberPassengers, boolean businessClass) {
        super(energy, maxSpeed, weight, brand, wingspan, laneLength);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    //метод проверяемости количества пассажиров в самолете

    public void maxPassengeres(int maxPassengeres) {
        if (maxPassengeres <= numberPassengers) {
            System.out.println("Количество пассажаров соответсвует количеству посадочных мест");
        } else {
            System.out.println("Количество пассажиров больше количества посадочных мест");
        }
    }
}
