package com.epam.l7;

public class Cat {
    public static void main(String[] args) {
        System.out.println(somethingStrange());
    }

    private static int somethingStrange() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(20);
            System.exit(1);
        } finally {
            System.err.println(10);
        }
        return 1;
    }
}
