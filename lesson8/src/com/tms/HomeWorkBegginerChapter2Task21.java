package com.tms;

//Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String, другой с помощью StringBulder и метода append, а также аналогично для StringBuffer.
//Сравнить скорость их выполения.
public class HomeWorkBegginerChapter2Task21 {
    public static void main(String[] args) {

        String str = " В Java строка является основным носителем текстовой информации.";
        StringBuilder sb = new StringBuilder(" В Java строка является основным носителем текстовой информации.");
        StringBuffer stBuf = new StringBuffer(" В Java строка является основным носителем текстовой информации.");

        long starTime = System.currentTimeMillis();
        for (int i = 0; i < 15; i++) {
            str += str;
        }
        long endTime = System.currentTimeMillis();
        long Time = endTime - starTime;
        System.out.println(" Программа выполнялась " + Time + " миллисекунд");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 15; i++) {
            sb.append(" В Java строка является основным носителем текстовой информации.");
        }
        long endTime1 = System.currentTimeMillis();
        long Time2 = endTime1 - startTime1;
        System.out.println(" Программа выполнялась " + Time2 + " миллисекунд");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 15; i++) {
            stBuf.append(" В Java строка является основным носителем текстовой информации.");
        }
        long endTime2 = System.currentTimeMillis();
        long Time3 = endTime2 - startTime2;
        System.out.println(" Программа выполнялась " + Time3 + " миллисекунд");

        if (Time < Time2 & Time < Time3) {
            System.out.println("Самая быстрая скорость выполения у операции сложения");
        } else if (Time2 < Time & Time2 < Time3) {
            System.out.println("Самая быстра скорость выполения у операции StringBuilder");
        } else if (Time3 < Time & Time3 < Time2) {
            System.out.println("Самая быстра скорость выполения операции у StringBuffer");
        }
    }
}

