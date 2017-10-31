package com.epam.l5;

public class Barsik extends Cat {
    public String name = "Barsik";
    protected String lastName = "Barsik";
    String firstName = "Barsik";

    @Override
    public void getInfo(String name) {
        System.out.println(super.name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
