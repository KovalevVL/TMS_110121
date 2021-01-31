package com.tms;

//Определить сумму элементов одномерного массива, расположенногомежду минимальным и максимальным значением.

public class Task16BegginerChapter {
    public static void main(String args[]) {
        int array[] = new int[20];
        int max = 0;
        int indexMax = 0;
        int min = 0;
        int indexMin = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
            if (min == 0) min = array[i];
            if (max <= array[i]) {
                max = array[i];
                indexMax = i;
            }
            if (min >= array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println("Максимальный элемент массива" + max + "Индекс максимального элемента массива" + indexMax);
        System.out.println("Минимальный элемент массива " + min + " Индекс минимального элемента массива" + indexMin);
        if (indexMax > indexMin) {
            for (int i = indexMin; i <= indexMax; i++) {
                sum += array[i];
            }
        } else {
            for (int i = indexMax; i <= indexMin; i++) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов между минимальным и максимальным =" + sum);
    }
}

