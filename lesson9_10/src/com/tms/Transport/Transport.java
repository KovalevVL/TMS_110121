package com.tms.Transport;

//Разрабоать иерархию классво транспорта.
//В класс траспорта добавить поля: мощность, максимальная скорость, масса, марка.
abstract class Transport  implements IEnergyCacul{
    private double energy;
    private int maxSpeed;
    private double weight;
    private String brand;

    Transport(double energy, int maxSpeed, double weight, String brand) {
        this.energy = energy;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    // метод описания который будет возвращать составленную строку

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return (int) weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    }

