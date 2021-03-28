package com.tms.homeWorkDop.Dop2;

//��������� ���� �������� �����.����� ������� ��������� � ������ ���� ������ ���������� ������ �� ����������
//� ������� �� 3-� �� 5-�� ����. ���� � ����������� ������������ �����-���������, �� ����� �������� �����
//���������� ���� � �����������.��� �������� � ����� ����.
//����� ��� � ��� �����. ������� ����� TextFormat � ������� ��� ����������� ������:
//1)����� ��������� ������ � ���������� ���������� ���� � ������.
//2)����� ��������� ������ � ��������� ���� �� � ������ ����� - ���������. ���� ���� ���������� true , ���� ��� false.


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
