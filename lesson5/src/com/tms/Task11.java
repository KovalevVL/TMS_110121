package com.tms;

//*Имеется целое число, определить является ли это число простым, т.е делиться без остатка только на 1 и себя.

public class Task11 {
    public static void main(String[] args) {
        int n = 17;
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Число " + n + " - является составным");
            } else {
                System.out.println("Число " + n + " - является простым");
            }
            return;
        }
    }
}