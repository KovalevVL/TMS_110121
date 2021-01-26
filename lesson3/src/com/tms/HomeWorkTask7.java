package com.tms;

//В переменную записываем количество программистов.
//В зависимости от количества программистов необходимо вывестиправильное окончание.


public class HomeWorkTask7 {
    public static void main(String[] args){
        int a = 8;
        if (a > 0 & a <2 ){
            System.out.println( a+ " программист");
        } else if ( a > 1 & a < 5){
            System.out.println( a+  "программиста");
        }else if ( a > 5 ){
            System.out.println( a+ "программистов");
        }
    }
}
