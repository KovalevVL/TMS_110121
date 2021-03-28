package com.tms.homeWorkDop.Dop4;

import java.io.*;

public class RunCar {
    public static void main (String [] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\VL_it\\TMS_110121\\lesson15\\src\\com\\tms\\homeWorkDop\\Dop4\\car.txt"));
        Car car = new Car("VAZ",140,20);
        objectOutputStream.writeObject(car);
        objectOutputStream.close();
        ObjectInputStream carNew = new ObjectInputStream(new FileInputStream("D:\\VL_it\\TMS_110121\\lesson15\\src\\com\\tms\\homeWorkDop\\Dop4\\car.txt"));
        Car car1 = (Car) carNew.readObject();
        System.out.println("Бренд автомобиля " + car1.getBrand());
        System.out.println("Максимальня скорость автомобиля " + car1.getSpeed());
        System.out.println("Цена автомобиля " + car1.getPrice());
    }
}
