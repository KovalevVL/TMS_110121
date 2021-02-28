package com.tms.Bank;

//Создать класс и объекты описывающие банкомат. Набор купюр находящихся в банкомате должен задватться тремя свойствами: количество купюр номиналом 20, 50, 100.
//Сделать методы для добавления денег в банкомат.
//Сделать функцию снимающую деньги. На вход передается сумма денег. На выход - булевское значение ( операция удалась или нет).
//При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдвется сумма.
//Создать конструктор  с тремя параметрами  - количество купюр.


//Создание класса

public class BankomatATM {
    private int twenty = 20;
    private int fifty = 50;
    private int hundred = 100;
    public int i = 1;
    private int sunMoney;
    boolean exitMoney = true;
    boolean addMoney = true;


    //конструктор

    BankomatATM(int tw, int f, int h) {
        this.twenty = 20;
        this.fifty = 50;
        this.hundred = 100;
        sunMoney();

    }
    // Определение суммы

    private void sunMoney() {
        sunMoney = this.hundred * 100 + this.fifty * 50 + this.twenty * 20;
    }

    //Ввод денег в банкомат

    protected void moneyAdd(int moneySumAdd) {
        for (i = 1; i < moneySumAdd / 100; i++) {
        }
        if (moneySumAdd % 100 == 0) {
            addMoney = true;
            System.out.println("Внесено " + moneySumAdd + " долларов " + i + " купюрами, номиналом " + hundred);
        } else if (moneySumAdd % 50 == 0) {
            addMoney = true;
            System.out.println("Внесено " + moneySumAdd + " долларов " + i + " купюрами, номиналом " + fifty);
        } else if (moneySumAdd % 20 == 0) {
            addMoney = true;
            System.out.println("Внесено " + moneySumAdd + " долларов " + i + " купюрами, номиналом " + twenty);
        } else {
            System.out.println("Внесенная купюра не принята.");
        }
    }


    //Вывод денег из банкомата
    protected void remMoney(int moneySumRem) {
        for (i = 1; i < moneySumRem / 100; i++) {
        }
        if (moneySumRem % 100 == 0) {
            exitMoney = true;
            System.out.println("Вы сняли " + moneySumRem + " долларов " + i + " купюрами, номиналом " + hundred);
        } else if (moneySumRem % 50 == 0) {
            exitMoney = true;
            System.out.println("Вы сняли " + moneySumRem + " долларов " + i + " купюрами, номиналом " + fifty);
        } else if (moneySumRem % 20 == 0) {
            exitMoney = true;
            System.out.println("Вы сняли " + moneySumRem + " долларов " + i + " купюрами, номиналом " + twenty);
        } else {
            System.out.println("Данную сумму снять не возможно!");
        }
    }

    //вывод данных
    public void printResult() {
        if (exitMoney) {
            System.out.println("Операция прошла успешно");
        } else {
            System.out.println("Ошибка! Попробуйте еще раз.");
            exitMoney = true;
        }
    }
}