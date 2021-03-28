package com.tms.homeWorkDop.Dop2;

//Текстовый файл содержит текст.После запуска программы в другой файл должен записаться только те преложения
//в которых от 3-х до 5-ти слов. Если в предложении присутствуют слово-полиндром, то имеет значение какое
//количество слов в предложении.Оно попадает в новый файл.
//Пишем все в ООП стиле. Создаем класс TextFormat в котором два статических метода:
//1)метод принимает строку и возвращает количество слов в строке.
//2)метод принимает строку и проверяет если ли в строке слово - полиндром. Если есть возвращает true , если нет false.


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormat {
    public static int numberOfWords(String line) {
        int numberOfWords = 0;
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            numberOfWords++;
        }
        return numberOfWords;
    }

    public static boolean polindromi(String line) {
        boolean polindrom = false;
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            for (int i = 0; i < line.length() / 2; i++) {
                if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
