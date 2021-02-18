package com.tms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
public class HomeWorkBegginerChapter2Task18 {
    public static void main(String[] args) {
        String str = "Строка - это упорядоченная последовательность символов. В Java строка является основным носителем текстовой информации. Для работы со строками здесь используются следующие классы: - String, - StringBuilder, - StringBuffer.";
        int n = 0;
        char symbol;
        String regex = "[\\p{Punct}]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            n++;
        }
        System.out.println("Общее колизчество знаков препинания " + n);
    }
}
