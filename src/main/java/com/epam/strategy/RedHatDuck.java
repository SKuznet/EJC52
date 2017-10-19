package com.epam.strategy;

public class RedHatDuck extends AbstractDuck {
    public RedHatDuck(SpeakBehavior speakBehavior) {
        super(speakBehavior);
    }

    @Override
    public void getInfo() {
        System.out.println("I am redhat duck");
    }
}
