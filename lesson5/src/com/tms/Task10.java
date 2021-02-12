package com.tms;

//*Посчитать факториал числа в границах от 10 до 15 ( не используя рекурсию)


public class Task10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 1;
        int i = 1;
        for (i = 1; a <= b; a++) {
            c *= a;
            System.out.println(c);
        }
    }
}
