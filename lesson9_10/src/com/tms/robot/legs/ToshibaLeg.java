package com.tms.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {

    }

    @Override
    public void step() {
        System.out.println("Toshiba нога вверх");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
