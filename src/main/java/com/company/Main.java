package com.company;

import com.company.entities.RegularUser;
import com.company.enums.UsersTypes;

import static com.company.UsersPrototypeFactory.createRegularUsers;
import static com.company.printStrategy.printAllUsers;

public class Main {

    private static int numOfUserToPrint = 37;

    public static void main(String[] args) {
        System.out.printf("----------> start printing %s user data <----------\n", numOfUserToPrint);
        createRegularUsers(numOfUserToPrint);
        printAllUsers(UsersTypes.REGULAR_USER);

    }
}
