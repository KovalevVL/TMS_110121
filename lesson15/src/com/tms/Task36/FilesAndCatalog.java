package com.tms.Task36;

//Вывести список файлов и каталогов выбранного каталога на диске.
//Файлы и каталоги должны быть распечатаны отдельно.

import java.io.File;

public class FilesAndCatalog {
    public static void main(String[] args) {
        File f = new File("D:\\VL_it\\TMS_110121");
        if (f.exists()) {
            if (f.isDirectory()) {
                System.out.println(f.toString());
            } else {
                System.out.println("File");
            }
        } else {
            System.out.println("No file");
        }
        File f2 = new File("text.txt");
        if (f2.exists()) {
            System.out.println(f2.toString());
        } else {
            System.out.println("No file");
        }
    }
}
