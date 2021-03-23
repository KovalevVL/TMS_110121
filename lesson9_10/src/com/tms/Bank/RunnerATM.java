package com.tms.Bank;

public class RunnerATM {
    public static void main(String[] args) {
     BankomatATM atm = new BankomatATM(10,10,10);
     atm.moneyAdd(5,3,1);
     atm.moneyAsk(100);
     atm.bank();
    }

}
