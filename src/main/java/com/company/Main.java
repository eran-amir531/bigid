package com.company;

import com.company.entities.User;

public class Main {

    private static int numOfUserToPrint = 37;

    public static void main(String[] args) {
        System.out.printf("----------> start printing %s user data <----------\n", numOfUserToPrint);
        for (int i = 0; i < numOfUserToPrint; i++) {
            new User().printUserData();
        }
    }
}
