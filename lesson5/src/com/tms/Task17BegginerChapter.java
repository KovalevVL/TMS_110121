package com.tms;

//Создать двухмерный массив, и заполнить его бабочкой.
public class Task17BegginerChapter {
    public static void main(String args[]) {
        char[][] arr = new char[5][5];
        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = i; j < arr.length - i; j++) {
                arr[i][j] = '1';
            }
        }
        for (int i = arr.length - 1; i > arr.length / 2 - 1; i--) {
            for (int j = i; j > arr.length - i - 2; j--) {
                arr[i][j] = '1';
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '\0') {
                    arr[i][j] = '*';
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



