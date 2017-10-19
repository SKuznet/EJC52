package com.epam.strategy;

public class SpeakCrya implements SpeakBehavior {
    @Override
    public void speak() {
        System.out.println("Crya Crya");
    }
}
