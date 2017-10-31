package com.epam.l10;

import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.err.println(main.getColor("GREEN"));
        Color color = Color.GREEN;
        Color color1 = Color.valueOf("GREEN");
    }

    private String getColor(String color) {
        for (Color col : Color.values()) {
            if (Objects.equals(col.toString(), color)) {
                return color;
            }
        }

        throw new IllegalArgumentException("Incorrect color: " + color);
    }
}
