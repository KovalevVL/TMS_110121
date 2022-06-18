package com.tms.AtmCard;

public class Bank extends AtmCard {
    public int limit;
    public int number;


    public Bank(String type, String client, String nameBank, int limit, int number) {
        super(type, client, nameBank);
        this.limit = limit;
        this.number = number;
    }
}
