package com.tms;

//Имеется строка с текстом. Вывести текс, составленный из последних букв всех слов.
public class HomeWorkBegginerChapter2Task20 {
    public static void main(String[] args) {
        String str = " В Java строка является основным носителем текстовой информации.";
        StringBuilder res = new StringBuilder();
        str = str.trim();
        String[] words = str.split(" ");
        for (String word : words)
            res.append(word.toCharArray()[word.length() - 1]);
        System.out.println(res.toString());

    }
}
