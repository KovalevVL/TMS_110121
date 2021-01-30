package com.tms;

//*Найдите сумму первых n целых чисел, которые делятся на 3

public class Task12BegginerChapter {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
                System.out.println(i);
            }
            if (count == 3) {
                break;
            }
        }
        System.out.println("Сумма первых чисел = " + sum);

    }
}
