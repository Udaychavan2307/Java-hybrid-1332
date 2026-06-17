package com.tka.june16;

public class TeacherMember extends Member {

    TeacherMember(int id, String name) {
        super(id, name);
    }

    int getLimit() {
        return 5;
    }
}