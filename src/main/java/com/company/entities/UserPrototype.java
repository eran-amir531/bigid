package com.company.entities;

import com.company.enums.UsersTypes;

public interface UserPrototype {
    public void printUserData();
    public String toString();
    public String getId();
    public UsersTypes getUsersType();
}
