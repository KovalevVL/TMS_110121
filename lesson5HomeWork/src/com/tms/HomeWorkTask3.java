package com.tms;

//Вычислить:1+2+4+8+......+256
public class HomeWorkTask3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 256; a *= 2) {
            sum += a;
        }
        System.out.println("Сумма чисел равно = " + sum);
    }
}