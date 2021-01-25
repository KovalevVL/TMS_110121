package com.tms;

//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть
// круглой картонкой радиусом r

public class RadiusTask7 {
    public static void main(String[] args){
        int a=10;
        int b=10;
        int r=22;
        if ( r * r >= ( a * a + b * b ) / 4){
            System.out.println("Круглая картонка закроет прямоугольное отверстие");
        }else{
            System.out.println("Круглая картонка не закроет прямоугольное отверстие");
        }

    }
        }
