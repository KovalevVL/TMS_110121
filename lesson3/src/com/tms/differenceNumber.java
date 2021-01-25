package com.tms;


// дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?


public class differenceNumber {
    public static void main(String[] args ){
    int num=2195;
    int num1=num/1000;
    int num2=(num/100)%10;
    int num3=(num/10)%10;
    int num4=num%10;

    if(num1!=num2 & num1!=num3 & num1!=num4 & num2!=num3 & num2!=num4 & num3!=num4){
        System.out.println("numbers are different");
    }else{
        System.out.println("numbers are not different");
        }
}
}