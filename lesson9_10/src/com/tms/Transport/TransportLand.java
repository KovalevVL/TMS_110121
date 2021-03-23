package com.tms.Transport;

//В наземный траспорт добовляется: количество колес, расход топлива.
public class TransportLand extends Transport {
    private int numberWheels;
    private double fuelFlow;

    TransportLand(double energy, int maxSpeed, double weight, String brand,int numberWheels,double fuelFlow) {
        super(energy, maxSpeed, weight, brand);
        this.numberWheels=numberWheels;
        this.fuelFlow=fuelFlow;
    }


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

