package com.tms;

//Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String, другой с помощью StringBulder и метода append, а также аналогично для StringBuffer.
//Сравнить скорость их выполения.
public class HomeWorkBegginerChapter2Task21 {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        String str = " В Java строка является основным носителем текстовой информации.";
        for (int i = 0; i < 15; i++) {
            str += str;
        }
        long endTime = System.currentTimeMillis();
        long Time = endTime - starTime;
        System.out.println(" Программа выполнялась миллисекунд " + Time);

        long startTime1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            stringBuilder.append("В Java строка является основным носителем текстовой информации.");
        }
        long endTime1 = System.currentTimeMillis();
        long Time1 = endTime1 - startTime1;
        System.out.println(" Программа выполнялась миллисекунд " + Time1);

        long starTime2 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 15; i++) {
            stringBuffer.append("В Java строка является основным носителем текстовой информации.");
        }
        long endTime2 = System.currentTimeMillis();
        long Time2 = endTime2 - starTime2;
        System.out.println(" Программа выполнялась миллисекунд " + Time2);

        if (Time < Time1 & Time1 < Time2) {
            System.out.println("Самая быстрая скорость выполения у операции сложения строк");
        } else if (Time1 < Time2 & Time1 < Time) {
            System.out.println("Самая быстра скорость выполения у операции StringBuilder");
        } else if (Time2 < Time & Time2 < Time1) {
            System.out.println("Самая быстра скорость выполения операции у StringBuffer");
        }
    }
}

