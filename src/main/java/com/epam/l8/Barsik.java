package com.epam.l8;

public class Barsik extends Cat<String> {
    private String name;


    @Override
    void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}
