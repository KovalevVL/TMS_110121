package com.tms;

//Написать класс, который умеет хранить в себе массив любых типов данных (int,long ect.). Реализовать метод get(int index), который возвращает любой элемент массива по индексу.
public class Myclass<M> {
    private M[] array;

    public M[] getArray() {
        return array;
    }

    public void setArray(M[] array) {
        this.array = array;
    }

    public M get(int number) {
        System.out.println(number);
        return array[number];
    }
}
