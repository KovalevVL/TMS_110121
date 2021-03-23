package com.tms.AtmCard;

//Создать иерархию классов, описывающих банковски карты. Иерархия должна иметь хотя бы три уровня.

public class AtmCard {
    public String type;
    private final String client;
    public String nameBank;

    public AtmCard(String type, String client, String nameBank) {
        this.type = type;
        this.client = client;
        this.nameBank=nameBank;
    }
}
