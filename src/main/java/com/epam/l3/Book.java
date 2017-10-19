package com.epam.l3;

public class Book implements Readable {
    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getTable() {
        return null;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
