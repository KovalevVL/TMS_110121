package com.tms;

// В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно
//или отрицательное.


public class HomeWorkTask1 {
    public static void main(String[] args) {
        int x = 33;
        if (x < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
        if (x > 0 & x < 9) {
            System.out.println("Число однозначное");
        } else {
            System.out.println("Число двухзначное");

        }
    }
}