package com.epam.l2;

public class Decrement {
    public static void main(String[] args) {
        Decrement decrement = new Decrement();
        System.out.println(decrement.getNewCount(2));
        System.out.println(decrement.isEven(3));
    }

    private int getNewCount(int count){
        return ++count;
    }

    private boolean isEven(int count) {
        return count % 2 == 0;
    }
}
