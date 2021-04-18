package com.tms;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Удалить неудолетворительные оценки из списка.

import java.util.ArrayList;

public class ArrayListStudentRatings {
    public static void main(String[] args) {
        ArrayList<Integer> studentRating = new ArrayList<Integer>();
        studentRating.add(2);
        studentRating.add(10);
        studentRating.add(3);
        studentRating.add(7);
        studentRating.add(1);
        studentRating.add(5);
        studentRating.add(9);
        studentRating.add(4);
        System.out.println("Оценки учеников в массиве " + studentRating);
        for (int i = 0; i < studentRating.size(); i++) {
            if (studentRating.get(i) < 5) {
                studentRating.remove(i);
            }
        }
        System.out.println("Положительные оценки учеников " + studentRating);
    }
}
