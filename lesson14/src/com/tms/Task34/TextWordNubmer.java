package com.tms.Task34;

//Имеется файл с тестом, в котором присутсвуют числа. Найти все числа, распечатать, посчитать сумму.
//Убрать все повторяющиеся числа и снова распечатать.


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;

public class TextWordNubmer {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        String TextNameFile = new String("D:\\VL_it\\TMS_110121\\lesson14\\src\\com\\tms\\Task34\\Text1234.txt");
        BufferedReader textNumber = new BufferedReader(new FileReader(TextNameFile));
        String res = textNumber.readLine();
        StringBuilder textNumber2 = new StringBuilder();
        while (res != null) {
            textNumber2.append(res);
            res = textNumber.readLine();
        }
        textNumber.close();
        String text = String.valueOf(textNumber2);
        text = text.replaceAll("(?U)\\D", " ");
        text = text.trim();
        String[] text1 = text.split(" +");
        System.out.println("Цифры в тексте = " + text);
        for (int i = 0; i < text1.length; i++) {
            sum += Integer.parseInt(text1[i]);
            System.out.println(sum);
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(text1));
        System.out.print("Все числа без повторений = ");
        for (Object hash : hashSet) {
            System.out.print(hash + " ");
        }

    }
}


