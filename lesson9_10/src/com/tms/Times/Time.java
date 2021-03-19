package com.tms.Times;


//Создать класс и объекты описывающие промежуток времени.Сам промежуток времени в классе должен задаваться тремя свойсвами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов ( метод должен работать аналогичено compareTo в строках ).
//Создать два конструктора : получающий общее количество секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных.
public class Time {
    public int sumSec;
    public int sec;
    public int min;

    Time(int s, int m, int h) {                                                                                    //Количество часов, минут и секунд в указанном числе
        sumSec = s + m * 60 + h * 3600;
        sec = sumSec % 60;
        m = (sumSec - s) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println("Количество часов, минут и секунд в указанном числе = " + h + " , " + min + " и " + sec);
        System.out.println();
    }

    public int secundSum() {                                                         //Метод получение общего количества секунд
        return sumSec;
    }

    public void compareTime(Time ravenstva) {                                        //Метод сравнения двух объектов
        if (sumSec == ravenstva.sumSec) {
            System.out.println("Интервалы времени равны");
        } else {
            System.out.println("Интервалы времени не равны");
        }
    }

    public void printTime() {                                                         //Вывод данных
        System.out.println(" Общее количество секунд " + secundSum());

    }

}
