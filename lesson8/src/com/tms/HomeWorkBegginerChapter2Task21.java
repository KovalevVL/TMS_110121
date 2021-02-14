package com.tms;

//Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String, другой с помощью StringBulder и метода append, а также аналогично для StringBuffer.
//Сравнить скорость их выполения.
public class HomeWorkBegginerChapter2Task21 {
    public static void main(String[] args) {
        String str = " В Java строка является основным носителем текстовой информации.";
        for (int i = 0; i < 100; i++) {
            str+=" В Java строка является основным носителем текстовой информации.";
        }
        long st=System.currentTimeMillis();
        System.out.println(st);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<100;i++){
            sb.append("В Java строка является основным носителем текстовой информации.");
        }
        long stB= System.currentTimeMillis();
        System.out.println(stB);
        StringBuffer stBuf= new StringBuffer();
        for (int i=0; i<100;i++) {
            sb.append("В Java строка является основным носителем текстовой информации.");
        }
        long strBuf=System.currentTimeMillis();
        System.out.println(strBuf);
        

    }
}
