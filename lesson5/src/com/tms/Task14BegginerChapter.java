package com.tms;

//Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, ее номера.

public class Task14BegginerChapter {
    public static void main(String args[]) {
        int array[] = new int[15];
        int max = 0;
        int min = 0;
        int imin = 0;
        int imax = 0;
        for ( int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
            System.out.println("Оценка " + array[i]);
            if (min == 0) min = array[i];
            if (array[i] < min) {
                min = array[i];
                imin = i;
            } else if (array[i] > max) {
                max = array[i];
                imax = i;
            }
        }
        System.out.println("Максимальная оценка " + max + "с индексом" + imax);
        System.out.println("Минимальная оценка " + min + "с индексом" + imin);
    }
}

