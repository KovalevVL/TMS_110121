package com.tms.homeWorkDop.Dop2;

import java.io.*;

public class main extends textFormat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\VL_it\\TMS_110121\\lesson15\\src\\com\\tms\\homeWorkDop\\Dop2\\text.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\VL_it\\TMS_110121\\lesson15\\src\\com\\tms\\homeWorkDop\\Dop2\\textNew.txt"));
        String text = br.readLine();
        while (text != null) {
            if (polindromi(text)) {
                bw.write(text + " ");
            } else if (numberOfWords(text) > 2 & numberOfWords(text) < 6 & !polindromi(text)) {
                bw.write(text + " ");
            }
            text = br.readLine();
        }
        br.close();
        bw.close();
    }
}
