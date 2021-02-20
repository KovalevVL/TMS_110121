package com.tms;

//Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String, другой с помощью StringBulder и метода append, а также аналогично для StringBuffer.
//Сравнить скорость их выполения.
public class HomeWorkBegginerChapter2Task21 {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        String str = " В Java строка является основным носителем текстовой информации.";
        for (int i = 0; i < 100; i++) {
            str += " В Java строка является основным носителем текстовой информации.";
        }
        long timeSpent1 = System.currentTimeMillis() - starTime;
        System.out.println(" Программа выполнялась " + timeSpent1 + " миллисекунд");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("В Java строка является основным носителем текстовой информации.");
        }
        long timeSpent2 = System.currentTimeMillis() - starTime;
        System.out.println(" Программа выполнялась " + timeSpent2 + " миллисекунд");
        StringBuffer stBuf = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("В Java строка является основным носителем текстовой информации.");
        }
        long timeSpent3 = System.currentTimeMillis() - starTime;
        System.out.println(" Программа выполнялась " + timeSpent3 + " миллисекунд");
        if (timeSpent1 == timeSpent2 & timeSpent2 == timeSpent3 & timeSpent1 == timeSpent3) {
            System.out.println("Способ сложения строк в милисекундах везде одинаковый");
        } else if (timeSpent1 < timeSpent2 | timeSpent1 < timeSpent3) {
            System.out.println("Самый быстрой способ слoжения строчек , с помощью оператора сложения");
        } else if (timeSpent2 < timeSpent1 | timeSpent2 < timeSpent3) {
            System.out.println("Самый быстрый способ сложения строчек , с помощью StringBuilder");
        } else if (timeSpent3 < timeSpent2 | timeSpent3 < timeSpent1) {
            System.out.println("Самый быстрый способ сложения строчек , с помощью StringBuffer");
        }
    }
}

