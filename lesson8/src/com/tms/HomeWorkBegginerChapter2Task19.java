package com.tms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Имеется строка с тектом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться несколькими пробелами.
//В начале и в конце текста также могуть быть пробелы, но могут и отсутсвовать.
public class HomeWorkBegginerChapter2Task19 {
    public static void main(String[] args) {
        String str = "в этой сроке,напрмер, ровно семь слов";
        int word = 0;
        String regex = "[\\pP\\s]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
            word++;
            System.out.println("количество слов в предложении " +word);
    }
}

