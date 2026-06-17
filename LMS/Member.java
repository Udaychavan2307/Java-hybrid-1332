package com.tka.june16;

public class Member {

    int id;
    String name;

    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    int getLimit() {
        return 0;
    }
}