package com.tms.MyServis;

public class Runner {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<MyServis> servisClass = MyServis.class;
        controlServis(servisClass);
    }

    public static void controlServis(Class servisClass) throws IllegalAccessException, InstantiationException {
        boolean annotated = servisClass.isAnnotationPresent(MyServis.class);
        if (annotated) {
            MyServis servis1 = (MyServis) servisClass.newInstance();
            servis1.setName("Nougad");
            servis1.setVersion(7.11);
            servis1.classInfo();
        } else {
            System.out.println("Такой аннотации не существует");
        }
    }
}
