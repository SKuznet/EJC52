package com.epam.l7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("This number is: " + main.getNumber(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getNumber(String parameter) {
        if (isNumber(parameter)){
            return Integer.parseInt(parameter);
        }

        throw new IllegalArgumentException("Parameter not number: " + parameter);
    }

    private boolean isNumber(String parameter) {
        return parameter.matches("[-+]?\\d+");
    }

}
