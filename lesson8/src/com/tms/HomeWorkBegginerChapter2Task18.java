package com.tms;

//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
public class HomeWorkBegginerChapter2Task18 {
    public static void main(String[] args) {
        String str = "Строка — это упорядоченная последовательность символов. В Java строка является основным носителем текстовой информации. Для работы со строками здесь используются следующие классы: String, StringBuilder, StringBuffer.";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '.' || symbol == ':' || symbol == '—') {
                n++;
            }
        }
        System.out.println("Общее колизчество знаков препинания " + n);
    }
}
