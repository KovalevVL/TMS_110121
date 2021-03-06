package com.tms.Transport;

//В воздушный траспорт добовляется: размах крыльев, минимальная длинна взлетно-посадочной полосы для взлета.
public class AirTransport extends Transport {
    private int wingspan;
    private int laneLength;

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
