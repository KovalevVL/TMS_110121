package com.tms;

//Создайте число.
// Определите, является ли оно трехзначным.
// Определите, является ли его последняя цифра семеркойю
// Определите, является ли число четным.

public class NumberTask6 {
    public static void main(String[] args) {
        int x = 397;
        if (99 < x & x <= 999) {
            System.out.println("x - трехзначное число");
        }
        if ( x % 10 == 7){
            System.out.println("Последняя цифра 7");
        }
        if (x % 2 == 0){
            System.out.println("число х - четное");
        }else{
            System.out.println("число х - нечетное");
        }
    }
}