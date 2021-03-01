package com.tms.Appliances;

public class Dishwacher extends Appliances{
    public boolean drying;
    public boolean quickWash;

    Dishwacher(boolean drying, boolean quickWash, String madeIn){
        super(madeIn);
        this.drying=drying;
        this.quickWash=quickWash;
    }
    @Override
    public void TurnOn (){
    }
}
