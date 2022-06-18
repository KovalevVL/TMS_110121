package com.tms.Appliances;

public class Dishwacher extends Appliances {
    public boolean drying;
    public boolean quickWash;
    public static int voltage;

    Dishwacher(boolean drying, boolean quickWash, String madeIn, int voltage) {
        super(madeIn);
        this.drying = drying;
        this.quickWash = quickWash;
        this.voltage = voltage;
    }

    @Override
    public void Turn220() {
        if (voltage <= 220) {
            System.out.println("Техника включена в сеть 220 Вт");
        } else {
            System.out.println("Перенапряжение");
        }
    }
}
