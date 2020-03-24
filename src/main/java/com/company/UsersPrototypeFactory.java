package com.company;

import com.company.entities.RegularUser;
import com.company.entities.UserPrototype;
import com.company.enums.UsersTypes;
import java.util.HashMap;

import static com.company.enums.UsersTypes.*;

public class UsersPrototypeFactory {

    public static HashMap<String, UserPrototype> UserPrototypeMap  = new HashMap<String, UserPrototype>();

    public static UserPrototype getUserById(String UserId) {
        return UserPrototypeMap.get(UserId);
    }

    public static void createRegularUsers(int numOfUsers){
        for (int i = 0; i < numOfUsers; i++) {
            createRegularUser();
        }
    }

    public static UserPrototype createRegularUser(){
        return creteUser(REGULAR_USER);
    }

    public static UserPrototype creteUser(UsersTypes userType) {
        if (userType.equals(REGULAR_USER)) {
            RegularUser regularUser = new RegularUser();
            addToUserPrototypeMap(regularUser);
            return regularUser;
        }else {
            throw new IllegalArgumentException("The user type " + userType.toString() + "is not valid");
        }
    }

    private static void addToUserPrototypeMap(UserPrototype userPrototype){
        UserPrototypeMap.put(userPrototype.getId() , userPrototype);
    }

}