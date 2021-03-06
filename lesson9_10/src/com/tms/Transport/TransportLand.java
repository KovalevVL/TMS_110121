package com.tms.Transport;

//В наземный траспорт добовляется: количество колес, расход топлива.
public class TransportLand extends Transport {
    private int numberWheels;
    private double fuelFlow;


    // метод описания который будет возвращать составленную строку

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public double getFuelFlow() {
        return fuelFlow;
    }

    public void setFuelFlow(double fuelFlow) {
        this.fuelFlow = fuelFlow;
    }
}

