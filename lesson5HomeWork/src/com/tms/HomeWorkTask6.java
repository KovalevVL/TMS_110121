package com.tms;

//Напишите программу вывода всех четных чисел от 2 до 100 включительно.
public class HomeWorkTask6 {
    public static void main(String[] args) {
        int i = 2;
        for (i = 2; i <= 100; i += 2) {
            System.out.println("Четные числа ряда " + i);
        }
    }
}