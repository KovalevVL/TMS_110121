package com.tms;

//Даны три целых числа.
//Найти количество положительных и отрицательных чисел в исходном наборе.

public class HomeWorkTask5 {
    public static void main (String [] args){
        int a = 233;
        int b = -22;
        int c = 33;
        if ( a > 0 & b > 0 & c > 0){
            System.out.println("Исходный набор содержит три положительных числа");
        }else if ( a < 0 & b < 0 & c < 0 ) {
            System.out.println("Исходный набор содержит три отрицательных числа");
        }else if ( a< 0 & b < 0 & c >0 | a < 0 & b > 0 & c < 0 | a >0 & b < 0 & c < 0){
            System.out.println("Исходный код сожержит одно положительное число и два отрицательных числа");
        }else if ( a > 0 & b > 0 & c < 0 | a > 0 & b < 0 & c > 0 | a < 0 & b > 0 & c > 0 ){
            System.out.println("Исходный код содержит два положительных числа и одно отрицательное число");
        }
    }
}
