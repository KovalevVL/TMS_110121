package com.tms;

// Создать список оценок с помощью ArrayList, заполнить случайными оценками.Найти самую высокую с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListScoreHigh {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(5);
        number.add(2);
        number.add(6);
        number.add(3);
        number.add(9);
        Iterator<Integer> iterator = number.iterator();
        Integer max = 0;
        int i = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (number.get(i) > max) {

                max = number.get(i);
            }
            i++;
        }

        System.out.println("максимальная оценка " + max);
    }
}
