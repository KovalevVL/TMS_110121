package com.tms.robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {

    }

    @Override
    public void upHand() {
        System.out.println("Samsung рука вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
