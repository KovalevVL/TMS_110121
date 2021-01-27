package com.tms;


//Изменить пример с суммой чисел таким образом, что бы рассчиталась не сумма , а произведение, т.е. факториал числа.

public class Task9 {
    public static void main(String[] args) {
        double averagePro = 0;
        double pro = 1;
        int n = 0;
        int y = 3;
        int x = (int)(Math.random()*y);
        while (x != 0) {
            System.out.println(x);
            pro *= x;
            n++;
            x =  (int)(Math.random()*y);
        }
        if ( n != 0 ){
            averagePro = pro/n;
        }else{
            averagePro = 0;
        }
        System.out.println("Произведение" + pro);
        System.out.println(("Среднее" + averagePro));
    }
}