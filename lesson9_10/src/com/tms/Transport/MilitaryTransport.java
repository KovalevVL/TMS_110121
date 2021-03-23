package com.tms.Transport;

//В военный траспорт добовляется: наличие системы катапультирования, количество ракет на борту.
public class MilitaryTransport extends AirTransport {
    boolean ejection = true;
    int numberMissiles;

    MilitaryTransport(double energy, int maxSpeed, double weight, String brand, int wingspan, int laneLength, boolean ejection, int numberMissiles) {
        super(energy, maxSpeed, weight, brand, wingspan, laneLength);
        this.ejection=ejection;
        this.numberMissiles=numberMissiles;
    }

    //метод, проверки количество ракет

    public void availabilityMissiles(int missiles) {
        if (missiles != 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутсвуют");
        }
    }

    //метод катапультирования, проверяет наличие системы катапультирования true - успешно
    public void systemEjection(boolean systemEjectionYes) {
        if (systemEjectionYes = true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такое системы");
        }
    }
}
