package com.epam.enu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.inputFromConsole();
    }

    private String inputFromConsole() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return entryMessage(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        throw new IllegalStateException("No input from console. Please try later.");
    }

    private String entryMessage(BufferedReader reader) throws IOException {
        String catName = reader.readLine();
        return getEntryMessageWithReader(catName);
    }

    public String getEntryMessageWithReader(String name) {
        for (Cat cat : Cat.values()) {
            if (Objects.equals(cat.toString(), name)) {
                return "You can come in";
            }
        }

        throw new IllegalArgumentException("Wrong cat name: " + name);
    }

}
