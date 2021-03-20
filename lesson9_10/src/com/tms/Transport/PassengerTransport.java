package com.tms.Transport;

//В легковой траспорт добовляем: тип кузова, количество пассажиров.
public class PassengerTransport extends TransportLand  implements IEnergyCacul{
    String type = "Universal";
    int numberPassengers = 5;

    PassengerTransport(double energy, int maxSpeed, double weight, String brand, int numberWheels, double fuelFlow, String type, int numberPassengers) {
        super(energy, maxSpeed, weight, brand, numberWheels, fuelFlow);
        this.type = type;
        this.numberPassengers = numberPassengers;
    }


    //Метод определения всей пройденной дистанции
    public void fullDist(double time) {
        double distans = ((double) getMaxSpeed() * time);
        System.out.println("За время " + time + " часов. Автомобиль марки " + getBrand() + " с максимальной скоростью " + getMaxSpeed() + "пройдет дистанцию " + distans);
    }

    //Метод определения затраченного топлива , с учетом пройденного расстояния
    public void fuelSum(double distans) {
        double sumFuel;
        sumFuel = distans / getFuelFlow();
        System.out.println("Потратив при этом " + sumFuel + "  литров топлива");
    }

}
