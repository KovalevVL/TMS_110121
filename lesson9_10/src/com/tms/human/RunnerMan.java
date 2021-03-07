package com.tms.human;

public class RunnerMan extends Man {

    RunnerMan(String name, String jacket, String pants, String shoes) {
        super(name, jacket, pants, shoes);
    }

    public static void main(String[] args) {
        Man man = new Man("Vladimir", " куртку NIKE", " штаны PUMA", " кроссовки ADIDAS");
        man.PutMan();
        man.TakeOffMan();
    }
}
