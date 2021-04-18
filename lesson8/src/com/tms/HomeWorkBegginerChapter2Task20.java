package com.tms;


//Имеется строка с текстом. Вывести текс, составленный из последних букв всех слов.
public class HomeWorkBegginerChapter2Task20 {
    public static void main(String[] args) {
        String str = " В Java - строка является      основным носителем текстовой информации.";
        str = str.replaceAll("\\pP", " ");
        str = str.trim();
        String[] str1 = str.split(" +");
        String lit = "";
        for (String word : str1) {
            lit += word.toCharArray()[word.length() - 1];
        }
        System.out.println(lit);
    }
}
