package com.epam.l5;

import com.epam.l6.Gav;

public class NotMain {
    public static void main(String[] args) {
        Gav gav = new Gav();
        System.out.println(gav.lastName);

        if (gav.lastName.equals("1")) {
            System.out.println("S karti ni4ego ne spisali");
        } else if (gav.lastName.equals("2")) {
            System.out.println("s karti spisali 10000");
        }

        throw new RuntimeException("Something going wrong: " + gav.lastName);

    }
}
