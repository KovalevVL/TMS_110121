package com.tms.Task35;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать числа и их среднее арифметическое


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Taks35 {
    public void toNumber() throws IOException {
        DataOutputStream text;
        try {
            text = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("text.dat")));
        } catch (FileNotFoundException e) {
            return;
        }
        for (int i = 0; i < 20; i++) {
            text.writeInt(i);
        }
        text.close();
    }
    public List<Integer> numberAdd () throws IOException{
        List<Integer>number = new ArrayList<>();
        DataInputStream text1 = new DataInputStream(new BufferedInputStream(new FileInputStream("text.dat")));
        while (text1.available()>0){
            number.add(text1.readInt());
        }
        return number;

        }
        public int sumNumber() throws IOException{
        List<Integer>numbers=numberAdd();
        int sum=0;
        int srSum=0;
        for (int number:numbers){
            sum+=number;
        }
        return sum/numbers.size();

    }
}
