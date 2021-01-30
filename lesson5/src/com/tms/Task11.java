package com.tms;

//*Имеется целое число, определить является ли это число простым, т.е делиться без остатка только на 1 и себя.

public class Task11 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 4);
        if (x % x == 0 & x % 1 == 0) {
            System.out.println(x + " число является простым");
        } else {
            System.out.println(x + " число является составным");
        }
    }
}