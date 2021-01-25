package com.tms;
// Имеется целое число (задать с помощью Random rand = new Random();int x = rand.nextint() ).
//Это число - количество денег в рублях. Вывести это число, добавив к нему слово "рублей" в правильном падеже.

import java.util.Random;

public class CashTask8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        if (x == 1) {
            System.out.println(x + "рубль");
        } else if (2 <= x & x <= 4) {
            System.out.println(x + "рублей");
        } else if (x > 0) {
            System.out.println(x + "рублей");
        }

    }
}