package com.epam.l4;

public class Love {
    public Love(String name) {
        this.name = name;
    }

    private String name;
    private static Love instance;

    public static synchronized Love getInstance() {
        if (null == instance) {
            instance = new Love("Sveta");
        }
        return instance;
    }

    public void getInfo() {
        System.out.println(name);
    }
}
