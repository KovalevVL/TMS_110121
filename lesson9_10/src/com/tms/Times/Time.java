package com.tms.Times;


//Создать класс и объекты описывающие промежуток времени.Сам промежуток времени в классе должен задаваться тремя свойсвами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов ( метод должен работать аналогичено compareTo в строках ).
//Создать два конструктора : получающий общее количество секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных.
public class Time {
    int s, m, h, sumSec;
    int sec, min, hour;

    Time(int sec, int min, int hour) {                    //Общее количество секунд в обьекте
        s = sec;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        sumSec = hour * 3600 + min * 60 + sec;

        this.h = hour;
        this.m = min;
        this.s = sec;
    }

    Time(int sumSec) {                                      //Часы, минуты, секунды по отдельности
        this.sumSec = sumSec;
        sec = sumSec % 60;
        m = (sumSec - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 60;
    }

    public int secundSum() {                                 //Метод получение общего количества секунд
        return sumSec;
    }
    public void compareTime(Time ravenstva){
        if (sumSec== ravenstva.sumSec){
            System.out.println("Интервалы времени равны");
        }else{
            System.out.println("Интервалы времени не равны");
        }
    }

    public void  printTime() {                                 //Вывод данных
        System.out.println(" Общее количество секунд " + secundSum());

    }

}
