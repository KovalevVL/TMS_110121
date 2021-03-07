package com.tms.robot;

import com.tms.robot.hands.SamsungHand;
import com.tms.robot.hands.SonyHand;
import com.tms.robot.hands.ToshibaHand;
import com.tms.robot.heads.SamsungHead;
import com.tms.robot.heads.SonyHead;
import com.tms.robot.heads.ToshibaHead;
import com.tms.robot.legs.SamsungLeg;
import com.tms.robot.legs.SonyLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot robot1 = new Robot(new SonyHead(11), new ToshibaHand(22), new SamsungLeg(33));
        Robot robot2 = new Robot(new SamsungHead(33), new SonyHand(11), new SonyLeg(44));
        Robot robot3 = new Robot(new ToshibaHead(22), new SamsungHand(33), new SonyLeg(44));

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот 1");
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот 2");
        } else {
            System.out.println("Самый дорогой робот 3");
        }


    }
}
