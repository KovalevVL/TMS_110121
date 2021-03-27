package com.tms.homeWorkDop.Dop1;

//В исходном файленаходится слова, каждое слово на новой строке.
//После запуска программа должна создать файл, который будет содержать в себе только полидромы.


import java.io.*;

public class Polindromi {
    public static void main(String[] args) throws IOException {
        String text = "D:\\VL_it\\TMS_110121\\lesson15\\src\\com\\tms\\homeWorkDop\\Dop1\\textPolindrom.txt";
        File file = new File(text);
        BufferedReader rd = new BufferedReader(new FileReader(text));
        DataOutputStream dt;
        try {
            dt = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\VL_it\\TMS_110121\\lesson15\\src\\com\\tms\\homeWorkDop\\Dop1\\textPolindromNew.txt")));
        } catch (FileNotFoundException e) {
            return;
        }
        String textNew;
        while ((textNew = rd.readLine()) != null) {
            if (textNew.equals(new StringBuilder(textNew).reverse().toString())) {
                dt.writeUTF(textNew);
            }
        }
        dt.close();
        rd.close();
    }
}