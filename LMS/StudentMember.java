package com.tka.june16;

public class StudentMember extends Member {

    StudentMember(int id, String name) {
        super(id, name);
    }

    int getLimit() {
        return 2;
    }
}