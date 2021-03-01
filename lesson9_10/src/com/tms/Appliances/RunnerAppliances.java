package com.tms.Appliances;

public class RunnerAppliances {
    public static void main(String[] args) {

        Dishwacher dishwacher = new Dishwacher(true, true, "USSR");
        Fridge fridge = new Fridge("Horizont", "Black", 400, "Belarus");

        dishwacher.TurnOn();
        fridge.TurnOn();
    }
}
