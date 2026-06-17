package com.tka.june16;

public class Book {

    int id;
    String title;
    String author;
    boolean issued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    void display() {
        System.out.println(id + " | " + title + " | " + author);
    }
}