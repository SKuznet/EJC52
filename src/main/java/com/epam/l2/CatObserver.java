package com.epam.l2;

public class CatObserver {
    private volatile int i = 10;

    public static void main(String[] args) {
        CatObserver catObserver = new CatObserver();
        System.out.println(catObserver.getCount());
        System.out.println(catObserver.i);
    }

    private int getCount(){
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            return i;
        } finally {
            i = 20;
        }
    }
}
