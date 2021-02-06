package com.tms;

//Напишите программу печати таблицы перевода расстояний из люймов в сантиметры для значений длины от 1 до 20 дюймов.
//1 дюйм = 2.54см
public class HomeWorkTask5 {
    public static void main(String[] args) {
        double sm = 2.54;
        int inches = 1;
        for (inches = 1; inches <= 20; inches++) {
            sm = inches * 2.54;
            System.out.println("Перевод из дюймов " + inches + "  в сантиметры " + sm);
        }
    }
}
