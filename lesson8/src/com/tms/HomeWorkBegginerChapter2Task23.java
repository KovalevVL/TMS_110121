package com.tms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч тех, у которых есть параметры, например <p id="p1", и замену их на простые теги абзацев <p>.
public class HomeWorkBegginerChapter2Task23 {
    public static void main(String[] args) {
        String str = "<p id=”p1”>1-Написать программу, выполняющую поиск в строке всех тегов абзацев</p>\n" +
                "<p id=”p1”>2-Написать программу, выполняющую поиск в строке всех тегов абзацев</p>\n" +
                "<p id=”p1”>3-Написать программу, выполняющую поиск в строке всех тегов абзацев</p>\n" +
                "<p id=”p1”>4-Написать программу, выполняющую поиск в строке всех тегов абзацев</p>";
        str = str.replaceAll("<((p(\\s(id)?\\s?=\\s?\\W\\S+\\W)?|(p+.?)))>", "<p>");
        System.out.println(str);
    }
}

