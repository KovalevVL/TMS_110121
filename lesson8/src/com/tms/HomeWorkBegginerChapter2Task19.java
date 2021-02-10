package com.tms;

//Имеется строка с тектом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут разделяться несколькими пробелами.
//В начале и в конце текста также могуть быть пробелы, но могут и отсутсвовать.
public class HomeWorkBegginerChapter2Task19 {
    public static void main(String[] args) {
        String str = " В Java строка является основным носителем текстовой информации.";
        int word = 0;
        int i = 0;
        char symbol;
        for (i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ' ') {
                word++;
            }

        }
        System.out.println("Количество слов в строке " + word);
    }
}
