package com.epam.l2;

public class Barsik extends AbstractCat implements EatBehavior, DrinkBehavior {
    private String name;

    public Barsik(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("NyamNyam");
    }

    @Override
    public void drink() {
        System.out.println("HlyupHlyuip");
    }

    @Override
    void getSurname() {
        System.out.println("asdasda");
    }
}
