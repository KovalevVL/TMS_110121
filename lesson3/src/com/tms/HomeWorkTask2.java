package com.tms;
//**Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
//Определить существует ли такой треуголник. Дано:a,b,c-стороны предполагаемого треуголника.
//Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
//Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.**


public class HomeWorkTask2 {
    public static void main(String [] args){
        int a = 2;
        int b = 4;
        int c = 7;
        if ( a + b > c | a + c > b | b + c > a){
            System.out.println("Треугольник существует");
        }else{
            System.out.println("Треугольника не существует");
        }
    }

}