package com.tms.Transport;

//В воздушный траспорт добовляется: размах крыльев, минимальная длинна взлетно-посадочной полосы для взлета.
public class AirTransport extends Transport {
    private int wingspan;
    private int laneLength;

    AirTransport(double energy, int maxSpeed, double weight, String brand,int wingspan,int laneLength) {
        super(energy, maxSpeed, weight, brand);
        this.laneLength=laneLength;
        this.wingspan=wingspan;
    }

    // метод описания который будет возвращать составленную строку
    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getLaneLength() {
        return laneLength;
    }

    public void setLaneLength(int laneLength) {
        this.laneLength = laneLength;
    }
}
