package com.tms.Appliances;

public class RunnerAppliances {
    public static void main(String[] args) {

        Dishwacher dishwacher = new Dishwacher(true, true, "USSR",220);
        Fridge fridge = new Fridge("Horizont", "Black", "Black", 11221,220);

        fridge.Turn220();
        dishwacher.Turn220();
    }

}
