package com.tms;

//Составить программу, вычисляющую А*В, не пользуясь операцией умножения.
public class HomeWorkTask4 {
    public static void main(String[] args) {
        int a = 6;
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += a;
        }
        System.out.println(sum);
    }
}
