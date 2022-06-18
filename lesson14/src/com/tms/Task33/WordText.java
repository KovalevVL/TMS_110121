package com.tms.Task33;

//Создать файл с текстом, почитать, подсчитать в тексте количество знаков препинания и слов.

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WordText {

    public static void main(String[] args) throws Exception {
        String TextNameFile = new String("D:\\VL_it\\TMS_110121\\lesson14\\src\\com\\tms\\Task33\\Text.txt");
        BufferedReader tx = new BufferedReader(new FileReader(TextNameFile));
        Scanner sc = new Scanner(new FileInputStream(TextNameFile));
        int punct = 0;
        int word = 0;
        while (sc.hasNext()) {
            sc.next();
            word++;
        }
        Scanner scanner = new Scanner(new FileInputStream(TextNameFile));
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        while (matcher.find()) {
            punct++;
        }

        System.out.println("Количество слов в тексте " +word);
        System.out.println ("Количество знаков препинания в тексте " +punct);
    }
}
