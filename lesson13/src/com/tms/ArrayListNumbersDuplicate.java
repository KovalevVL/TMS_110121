package com.tms;

//Создать коллекцию и наполнить ее случайными числами. Удалить повторяющиеся числа.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListNumbersDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(4);
        number.add(3);
        number.add(6);
        number.add(3);
        System.out.println("Цифры в представленном массиве " + number);
        Set set = new HashSet();
        set.addAll(number);
        System.out.println("Массив без повторябщихся цифр " + set);
    }
}
