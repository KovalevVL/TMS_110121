package com.tms;

//Одноклеточная амеба каждые три часа делиться на две клетки.
//Определить сколько амеб будет через 3,6,9,12,......24часа.
public class HomeWorkTask2 {
    public static void main(String[] args) {
        int ameba = 1;
        int time = 0;
        int rezAmeba;
        for (time = 0; time < 24; time += 3) {
            ameba *= 2;
        }
        System.out.println("через " + time + " будет " + ameba);
    }
}
