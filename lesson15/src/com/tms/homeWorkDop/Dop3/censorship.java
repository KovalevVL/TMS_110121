package com.tms.homeWorkDop.Dop3;

//ѕроверка на цензуру.
//—оздайте два файла:
// - содержит исходный код.
// - содержит недопустимые слова в тексте ( black list).
//—труктура файла определите сами, хотите каждое слова на новой строке, хотите через зап€тую.
//«адача: необходимо проверить проходит ли текст цензуру. ≈сли в тексте не встретилось ни одного слова,
//то выводите сообщение   о том , что текст прошел проверку на цензуру.
//≈сли нет, то выводите соответсвующее сообщение, количество предложений не прошедших проверку и сами
//предложени€ подлежащие исправлению.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class censorship {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader text = new BufferedReader(new FileReader("D:\\VL_it\\TMS_110121\\lesson15\\src\\com\\tms\\homeWorkDop\\Dop3\\textCensorship.txt"));
        String st = text.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (st != null) {
            stringBuilder.append(st);
            st = text.readLine();
        }
        text.close();
        String st1 = String.valueOf(stringBuilder);
        st1 = st1.replaceAll("(?U)\\W", "");
        st1 = st1.trim();
        String[] str = st1.split(" +");
        for (int i = 0; i < str.length; i++) {
            count = 0;
            BufferedReader text1 = new BufferedReader(new FileReader("D:\\VL_it\\TMS_110121\\lesson15\\src\\com\\tms\\homeWorkDop\\Dop3\\textDop3.txt"));
            String string = text1.readLine();
            while (string != null) {
                Pattern pattern = Pattern.compile(str[i]);
                Matcher matcher = pattern.matcher(string);
                while (matcher.find()) {
                    count++;
                    System.out.println(str[i] + " встречаетс€ в предложении");
                    System.out.println(string);
                }
                string = text1.readLine();
            }
            if (count > 0) {
                System.out.println('\n' + "“екст не прошел цензуру");
            }
            System.out.println('\n' + str[i] + " , наход€щиес€ в censorship - встречаетс€ в данном тексте  - " + count + '\n');
            text1.close();
        }
    }
}
