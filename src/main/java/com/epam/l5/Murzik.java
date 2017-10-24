package com.epam.l5;

public class Murzik extends Barsik {
    private String name = "Murzik";

    @Override
    public void getInfo (String name){
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
}
