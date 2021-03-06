package com.tms.Transport;

//В военный траспорт добовляется: наличие системы катапультирования, количество ракет на борту.
public class MilitaryTransport extends AirTransport {
    boolean ejection = true;
    int numberMissiles;

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

    @Override
    public double getEnergy() {
        return 2300;
    }

    @Override
    public int getMaxSpeed() {
        return 1800;
    }

    @Override
    public double getWeight() {
        return 140000;
    }

    @Override
    public String getBrand() {
        return "Stels";
    }

    @Override
    public int getWingspan() {
        return 39;
    }

    @Override
    public int getLaneLength() {
        return 1800;
    }

    public void militaryTr() {
        System.out.println("Военный воздушный траспорт мощностью " + getEnergy() + " л.с. или " + energyCalcul() + " киловват. Максимальной скоростью " + getMaxSpeed() + " км/ч . Общей массой " + getWeight() + " кг. Брендом " + getBrand());
    }
}
