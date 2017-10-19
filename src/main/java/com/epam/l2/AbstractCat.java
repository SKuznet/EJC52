package com.epam.l2;

public abstract class AbstractCat {
    private int count = 10;

    abstract void getSurname();

    public int getCount(){
        return count;
    }
}
