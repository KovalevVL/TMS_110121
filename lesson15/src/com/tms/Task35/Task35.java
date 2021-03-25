package com.tms.Task35;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать числа и их среднее арифметическое


import java.io.*;


public class Task35 {
    public static void main(String[] args) throws IOException {
        String text = "D:\\VL_it\\TMS_110121\\lesson15\\text.txt";
        File file = new File(text);
        DataOutputStream text1;
        DataInputStream text2;
        int sum = 0;
        try {
            text1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        } catch (FileNotFoundException e) {
            return;
        }
        for (int i = 0; i < 20; i++) {
            text1.writeInt(i);
            System.out.println(i);
        }
        text1.close();
        text2 = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        int res = text2.readInt();
        while (true) {
            sum += res;
            try {
                res = text2.readInt();
            } catch (IOException e) {
                break;
            }
        }
        text2.close();
        int srAr = sum / 20;
        System.out.println('\n' + " - среднее арифметическое = " + srAr);
    }
}
