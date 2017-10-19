package com.epam.l3;

import com.epam.l2.Barsik;

import java.io.IOException;
import java.util.Objects;

/**
 * Class for ...
 *
 * */
public class Main {


    public static void main(String[] args) throws IOException {
        int i;

        i = 10; i =20; i =1;
        Book jackName = null;
        Paper jackCred = null;

        System.out.println(Objects.equals(jackCred, jackName));
        String name = "1";
        try {
            throw new IOException();
        } catch (NullPointerException e) {
            //ignore
        }

    }
}
