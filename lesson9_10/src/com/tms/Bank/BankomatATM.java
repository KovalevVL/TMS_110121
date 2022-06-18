package com.tms.Bank;

//Создать класс и объекты описывающие банкомат. Набор купюр находящихся в банкомате должен задватться тремя свойствами: количество купюр номиналом 20, 50, 100.
//Сделать методы для добавления денег в банкомат.
//Сделать функцию снимающую деньги. На вход передается сумма денег. На выход - булевское значение ( операция удалась или нет).
//При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдвется сумма.
//Создать конструктор  с тремя параметрами  - количество купюр.


//Создание класса

public class BankomatATM {
    private static int x20 = 20;
    private static int x50 = 20;
    private static int x100 = 100;
    public int sunMoney;
    private boolean getMoney = true;

    //конструктор

    BankomatATM(int x20, int x50, int x100) {
        this.x20 = x20;
        this.x50 = x50;
        this.x100 = x100;
    }
    // Определение суммы

    private void MoneyResult() {
        sunMoney = this.x100 * 100 + this.x50 * 50 + this.x20 * 20;
    }

    //Ввод денег в банкомат

    public void moneyAdd(int banknota20, int banknota50, int banknota100) {
        sunMoney = x20 * 20 + x50 * 50 + x100 * 100;
        int moneyAddSun = banknota20 * 20 + banknota50 * 50 + banknota100 * 100;
        sunMoney += moneyAddSun;
        x20 += banknota20;
        x50 += banknota50;
        x100 += banknota100;
        System.out.println("Вы внесли денежные средства на сумму " + moneyAddSun);
    }

    //Вывод денег из банкомата

    public void moneyAsk(int requestCash) {
        if (sunMoney >= requestCash) {
            getMoney = true;
            System.out.println("Операция  удалась");
        } else {
            getMoney = false;
            System.out.println("Операция не удлась");
        }
    }

    public void bank() {
        System.out.println("Количество денег в банкомате " + sunMoney);
        System.out.println("Количество купюр номиналом 20 = " + x20 + ", на сумму " + x20 * 20);
        System.out.println("Количество купюр номиналом 50 = " + x50 + ", на сумму " + x50 * 50);
        System.out.println("Количество купюр номиналом 100 = " + x100 + ", на сумму " + x100 * 100);
        return;
    }
}

