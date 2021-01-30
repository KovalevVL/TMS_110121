package com.tms;

// Создать последовательность случайных чисел, найти и вывести наибольшее из них.

public class Task13BegginerChapter {
    public static void main(String args[]) {
        int array[] = new int[10];
        int max = 0;
        int i = 0;
        for (i = 1; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
            System.out.println(array[i]);
            if (array[i] > max)   max = array[i];
        }
        System.out.println("Максимальное число " + max);
    }
}