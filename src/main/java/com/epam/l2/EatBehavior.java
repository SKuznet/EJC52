package com.epam.l2;

public interface EatBehavior {
    void eat();

    default void hunt(){
        System.out.println("Catch mouse");
    }
}
