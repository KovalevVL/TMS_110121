package com.tms;

import java.util.HashMap;
import java.util.StringTokenizer;

//Имеется текс. Следует составить для него частотный словарь.
public class Dictionary {
    public static void main(String[] args) {
        String text = "Он также обратил внимание, что Виктор Лукашенко и так" +
                "уже на протяжении длительного времени фактически работает на" +
                "посту руководителя НОК:« Я там “зонтик для этой организации(речь о периоде, когда Александр Лукашенко возглавлял НОК," +
                "первым вице-президентом был Виктор Лукашенко. Прим.БЕЛТА).Все было" +
                "хорошо.Потом они прислали требование накануне(Олимпийского собрания НОК Беларуси. Прим.БЕЛТА):" +
                "Диму Баскова под нож”,Лукашенко1,Лукашенко2  не дай бог, мы тогда санкции введем." +
                "Еще ничего не сделали, уже санкции вводить. И предложили ему от отца отказаться." +
                "Это сын откажется от отца! Ну что о них говорить дальше».";
        HashMap<String, Integer> textAg = new HashMap<>();
        StringTokenizer text1 = new StringTokenizer(text, "\\p{Punct}");
        while (text1.hasMoreTokens()) {
            String word = text1.nextToken();
            if (textAg.containsKey(word)) {
                int key = textAg.get(word);
                textAg.put(word, ++key);
            } else {
                textAg.put(word, 1);
            }
        }
        System.out.println(textAg);
    }
}
