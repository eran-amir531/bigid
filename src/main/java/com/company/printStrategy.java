package com.company;

import com.company.entities.UserPrototype;
import com.company.enums.UsersTypes;

import static com.company.UsersPrototypeFactory.UserPrototypeMap;

public class printStrategy {

    public static void printUser(UserPrototype userPrototype){
        userPrototype.printUserData();
    }

    public static void printAllUsers(){
        for (UserPrototype value : UserPrototypeMap.values()) {
            value.printUserData();
        }
    }

    public static void printAllUsers(UsersTypes usersTypes){
        for (UserPrototype value : UserPrototypeMap.values()) {
            if(usersTypes == value.getUsersType())
                value.printUserData();
        }
    }
}
