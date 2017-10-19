package com.epam.l5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();

        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("Murzik");
        Cat dimok = new Cat("Dimok");

        System.out.println(barsik.hashCode());
        System.out.println(murzik.hashCode());
        System.out.println(dimok.hashCode());

        set.add(barsik);
        set.add(murzik);
        set.add(dimok);

        System.out.println(set.toString());

        System.out.println(set.contains(barsik));

        barsik.setName("Veniamin");

        System.out.println(set.toString());
        System.out.println(set.contains(barsik));

        set.add(barsik);
        System.out.println(set.contains(barsik));

        System.out.println(set);

        Set<Cat> newCatSet = new HashSet<>();
        newCatSet.addAll(set);

        System.out.println(newCatSet.toString());
        System.out.println(newCatSet.contains(barsik));

    }
}
