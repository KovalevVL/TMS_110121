package com.tms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записаных по правилам Java, с помощью регулярных выражений.
//Вывести их на страницу.
public class HomeWorkBegginerChapter2Task22 {
    public static void main(String[] args) {
        String str = " 0xFFF В Java строка является основным носителем текстовой 0xAAA информации.";
        Pattern pattern = Pattern.compile("0[Xx]{1,3}[(a-fA-F)(0-9)]{1,3}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
