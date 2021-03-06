package com.tms.Transport;

//Разрабоать иерархию классво транспорта.
//В класс траспорта добавить поля: мощность, максимальная скорость, масса, марка.


public class Transport {
    private double energy;
    private int maxSpeed;
    private double weight;
    private String brand;

    // метод описания который будет возвращать составленную строку

    public double getEnergy() {
        return energy;
    }

    public void setEnergy() {
        this.energy = energy;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed() {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //Вывод  на экран
    public void print() {
        System.out.println(getEnergy() + getMaxSpeed() + getWeight() + getBrand());
    }

    //расчет мощности в киловватах
    public double energyCalcul() {
        double kilowwat = getEnergy() / 0.74;
        System.out.println("Всего киловват " + kilowwat);
        return kilowwat;
    }
}
