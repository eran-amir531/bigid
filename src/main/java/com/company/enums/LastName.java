package com.company.enums;

import java.util.Random;

public enum LastName {
    SMITH("Smith"),
    THOMPSON("Thompson"),
    PEREZ("Perez"),
    ROGERS("Rogers"),
    JAMES("James"),
    BUTLER("Butler");


    private String value;

    public String getValue() {
        return value;
    }

    LastName(String value) {
        this.value = value;
    }

    public static LastName getRandomValue() {
        int pick = new Random().nextInt(LastName.values().length);
        return LastName.values()[pick];
    }
}