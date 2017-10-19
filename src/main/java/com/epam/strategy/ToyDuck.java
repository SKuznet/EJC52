package com.epam.strategy;

public class ToyDuck extends AbstractDuck {
    public ToyDuck(SpeakBehavior speakBehavior) {
        super(speakBehavior);
    }

    @Override
    public void getInfo() {
        System.out.println("I am redhat duck");
    }
}
