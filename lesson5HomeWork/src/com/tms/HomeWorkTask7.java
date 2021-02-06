package com.tms;

//Напишите программу, определяющую сумму всех нечетных чисел.
public class HomeWorkTask7 {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма нечетных числер равна " + sum);
    }
}
