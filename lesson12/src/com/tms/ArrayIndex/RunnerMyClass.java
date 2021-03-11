package com.tms;

public class RunnerMyClass extends Myclass{
    public static void main (String [] args){
        Myclass<Number>arr=new Myclass<>();
        arr.setArray(new Number[6]);
        arr.getArray()[0]=22;
        arr.getArray()[1]=44;
        arr.getArray()[2]=11.22;
        arr.getArray()[3]=44.22;
        arr.getArray()[4]=22.111;
        arr.getArray()[5]=99;
        System.out.println(arr.get(5));
    }
}
