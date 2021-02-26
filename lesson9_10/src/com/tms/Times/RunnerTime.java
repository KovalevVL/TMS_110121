package com.tms.Times;

public class RunnerTime {
    public static void main(String[] args) {
        Time time1 = new Time(43999);
        Time time2 = new Time(33, 20, 4);

        time1.printTime();
        time2.printTime();
        time2.compareTime(time1);
    }
}
