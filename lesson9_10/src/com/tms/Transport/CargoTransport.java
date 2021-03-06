package com.tms.Transport;

//В грузовой транспорт добовляем: грузоподъемность
public class CargoTransport extends TransportLand {
    double loadCapacityTransport = 15;

    //метод проверки вместимости груза
    public void quantityCargo(double loadCapacityTransport2) {
        if (loadCapacityTransport2 <= loadCapacityTransport) {
            System.out.println("Грузим - " + loadCapacityTransport2 + " Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовук побольше");
        }
    }

    @Override
    public double getEnergy() {
        return 100;
    }

    @Override
    public int getMaxSpeed() {
        return 120;
    }

    @Override
    public double getWeight() {
        return 16000;
    }

    @Override
    public String getBrand() {
        return "MAN";
    }

    @Override
    public int getNumberWheels() {
        return 8;
    }

    @Override
    public double getFuelFlow() {
        return 20;
    }

    @Override
    public double energyCalcul() {
        return getEnergy() / 0.74;
    }

    @Override
    public void print() {
        System.out.println("Грузовой траспорт марки " + getBrand() + "мощностью " + getEnergy() + " с максимальной скоростью " + getMaxSpeed() + "");
    }
}
