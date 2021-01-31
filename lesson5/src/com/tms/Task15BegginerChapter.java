package com.tms;

//Создать массив, заполните его случайными элементами, распечатать, перевернуть, и снова распечатать.

public class Task15BegginerChapter {
    public static void main(String args[]) {
        int array[] = new int[6];
        int i;
        int z;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 12);
            System.out.println(array[i]);
        }
        for (i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        for (i = 0; i < array.length; i++) ;
        System.out.println(array[i]);
    }
}
