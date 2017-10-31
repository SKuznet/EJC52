package com.epam.l8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        ArrayList<String> newList = new ArrayList<>();

        newList.trimToSize();

        list.add("Barsik");

        list.removeIf(O -> O.equals("JAck"));
        System.out.println(list);
    }

}

