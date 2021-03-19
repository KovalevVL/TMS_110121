package com.tms.Times;

public class RunnerTime {
    public static void main(String[] args) {
        Time time1 = new Time(23,23,22);
        Time time2 = new Time(33, 20, 4);

        time1.printTime();
        System.out.println();
        time2.printTime();
        System.out.println();
        time2.compareTime(time1);
    }
}
