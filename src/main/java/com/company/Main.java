package com.company;

import com.company.entities.User;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new User().printUserData()            ;
        }
    }
}
