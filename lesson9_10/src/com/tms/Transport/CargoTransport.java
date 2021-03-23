package com.tms.Transport;

//В грузовой транспорт добовляем: грузоподъемность
public class CargoTransport extends TransportLand {
    double loadCapacityTransport;

    CargoTransport(double energy, int maxSpeed, double weight, String brand, int numberWheels, double fuelFlow, double loadCapacityTransport) {
        super(energy, maxSpeed, weight, brand, numberWheels, fuelFlow);
        this.loadCapacityTransport = loadCapacityTransport;
    }

    // проверки вместимости груза
    public void quantityCargo(double loadCapacityTransport2) {
        if (loadCapacityTransport2 <= loadCapacityTransport) {
            System.out.println("Грузовик загружен. ");
        } else {
            System.out.println("Вам нужен грузовук побольше");
        }
    }
}
