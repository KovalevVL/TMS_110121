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
    public double energyCalcul() {
        return getEnergy() / 0.74;
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
    private void fullDist(double time) {
        double distans = ((double) getMaxSpeed() * time);
        System.out.println("За время " + time + " часов. Автомобиль марки " + getBrand() + " с максимальной скоростью " + getMaxSpeed());
    }

    //Метод определения затраченного топлива , с учетом пройденного расстояния
    private void FuelSum(double distans) {
        double sumFuel = (distans / 100) * getFuelFlow();
        System.out.println("Потратив при этом " + sumFuel + " топлива");
    }
}
