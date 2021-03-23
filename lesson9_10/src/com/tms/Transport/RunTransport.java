package com.tms.Transport;

public class RunTransport {
    public static void main(String[] args) {
        PassengerTransport passenger = new PassengerTransport(150,160,1200,"Audi",4,8,"Universal",5);
        MilitaryTransport military = new MilitaryTransport(2300,1800,14000,"Stels",39,1800,true,20);
        CivilTransport civil = new CivilTransport(2000,1000,12000,"Boeing",33,2000,33,true);
        CargoTransport cargo = new CargoTransport(100,120,16000,"MAN", 8,20,15);


        passenger.fullDist(3);
        System.out.println();

        passenger.fuelSum(200);
        System.out.println();

        cargo.quantityCargo(20);
        System.out.println();

        military.systemEjection(true);
        System.out.println();

        military.availabilityMissiles(22);
        System.out.println();

        civil.maxPassengeres(25);
        System.out.println();
    }
}
