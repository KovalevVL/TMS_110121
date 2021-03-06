package com.tms.Transport;

//В легковой траспорт добовляем: тип кузова, количество пассажиров.
public class PassengerTransport extends TransportLand {
    String type = "Universal";
    int numberPassengers = 5;

    @Override
    public double getEnergy() {
        return 150;
    }

    @Override
    public int getMaxSpeed() {
        return 160;
    }

    @Override
    public double getWeight() {
        return 12000;
    }

    @Override
    public String getBrand() {
        return "Audi";
    }

    @Override
    public int energyCalcul() {
        return (int) (getEnergy() / 0.74);
    }

    @Override
    public int getNumberWheels() {
        return 4;
    }

    @Override
    public double getFuelFlow() {
        return 8;
    }

    //Метод определения всей пройденной дистанции
    public void fullDist(double time) {
        double distans = ((double) getMaxSpeed() * time);
        System.out.println("За время " + time + " часов. Автомобиль марки " + getBrand() + " с максимальной скоростью " + getMaxSpeed());
    }

    //Метод определения затраченного топлива , с учетом пройденного расстояния
    public void fuelSum(double distans) {
        double sumFuel = (distans / 100) * getFuelFlow();
        System.out.println("Потратив при этом " + sumFuel + "  литров топлива");
    }

    public void passengersTr() {
        System.out.println("Легковой наземный транспорт мощностью " + getEnergy() + " л.с. или " + energyCalcul() + " киловват. Максимальной скоростью " + getMaxSpeed() + " км/ч . Общей массой " + getWeight() + " кг. Брендом " + getBrand());
    }
}
