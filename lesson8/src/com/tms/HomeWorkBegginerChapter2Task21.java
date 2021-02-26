package com.tms;

//Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String, другой с помощью StringBulder и метода append, а также аналогично для StringBuffer.
//Сравнить скорость их выполения.
public class HomeWorkBegginerChapter2Task21 {
    public static void main(String[] args) {
        long starTime1 = System.currentTimeMillis();
        String str = " В Java строка является основным носителем текстовой информации.";
        for (int i = 0; i < 15; i++) {
            str += str;
        }
        long endTime1 = System.currentTimeMillis();
        long Time1 = endTime1 - starTime1;
        System.out.println(" Программа выполнялась " + Time1 + " миллисекунд");

        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            sb.append("В Java строка является основным носителем текстовой информации.");
        }
        long endTime2 = System.currentTimeMillis();
        long Time2 = endTime2 - startTime2;
        System.out.println(" Программа выполнялась " + Time2 + " миллисекунд");

        long starTime3 = System.currentTimeMillis();
        StringBuffer stBuf = new StringBuffer();
        for (int i = 0; i < 15; i++) {
            stBuf.append("В Java строка является основным носителем текстовой информации.");
        }
        long endTime3 = System.currentTimeMillis();
        long Time3 = endTime3 - starTime3;
        System.out.println(" Программа выполнялась " + Time3 + " миллисекунд");

        if (Time1 < Time2 & Time1 < Time3) {
            System.out.println("Самая быстрая скорость выполения у операции сложения строк");
        } else if (Time2 < Time1 & Time2 < Time3) {
            System.out.println("Самая быстра скорость выполения у операции StringBuilder");
        } else if (Time3 < Time1 & Time3 < Time2) {
            System.out.println("Самая быстра скорость выполения операции у StringBuffer");
        }
    }
}

