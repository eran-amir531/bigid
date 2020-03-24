package com.company.enums;

import java.util.Random;

public enum FirstName {
    ADI("Adi"),
    JAMES("James"),
    MARK("Mark"),
    LISA("Lisa"),
    REBECCA("Rebecca"),
    AMY("Amy"),
    ERIC("Eric"),
    ALEXANDER("Alexander"),
    ADAM("Adam");

    private String value;

    public String getValue() {
        return value;
    }

    FirstName(String value) {
        this.value = value;
    }

    public static FirstName getRandomValue() {
        int pick = new Random().nextInt(FirstName.values().length);
        return FirstName.values()[pick];
    }
}