package com.tms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записаных по правилам Java, с помощью регулярных выражений.
//Вывести их на страницу.
public class HomeWorkBegginerChapter2Task22 {
    public static void main(String[] args) {
        String str = " В Ja4va сCтрока являеCB3тся основным носиC4телем текDDDстовой информации.";
        Pattern pattern = Pattern.compile("[\\d(A-IK-Z]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
