package com.tms;

//Начав тренировки, спортсмен в первый день пробежал 10 км.
//Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
//Какой сумарный путь пробежит спортсмен за 7 дней.
public class HomeWorkTask1 {
    public static void main(String[] args) {
        int day = 10;
        int sum = 0;
        double nDay;
        for (int i = 1; i <= 7; i++) {
            nDay = day * 0.1;
            day = (int) (day + nDay);
            sum+=day;
        }
        System.out.println(sum);
    }
}
