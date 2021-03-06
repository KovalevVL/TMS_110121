package com.tms.Transport;

public class RunTransport {
    public static void main(String[] args) {
        PassengerTransport passenger = new PassengerTransport();
        MilitaryTransport military = new MilitaryTransport();
        CivilTransport civil = new CivilTransport();
        CargoTransport cargo = new CargoTransport();

        passenger.passengersTr();
        System.out.println();

        passenger.fullDist(3);
        System.out.println();

        passenger.fuelSum(200);
        System.out.println();

        cargo.cargoTr();
        System.out.println();

        cargo.quantityCargo(20);
        System.out.println();

        military.militaryTr();
        System.out.println();

        military.systemEjection(true);
        System.out.println();

        military.availabilityMissiles(22);
        System.out.println();

        civil.civilTr();
        System.out.println();

        civil.maxPassengeres(25);
        System.out.println();
    }
}
