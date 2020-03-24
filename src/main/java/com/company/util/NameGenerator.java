package com.company.util;

import java.util.Random;

//this is a bonus class ,crating non-meaningful names .which is a better way to create randoms names
public class NameGenerator {

    private static int maxNameLength = 12;
    private static int minNameLength = 3;


    public static String generatingRandomAlphabeticString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = randomNameLength();
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    private static int randomNameLength(){
        return (int)(Math.random() * (maxNameLength - minNameLength + 1) + minNameLength);
    }
}
