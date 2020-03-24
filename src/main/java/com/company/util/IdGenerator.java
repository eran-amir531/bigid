package com.company.util;

import java.util.Random;

//this class generate id's by increment the currantId++
public class IdGenerator {
    private static int idLength = 9;
    private static Integer currantId = 0;

    //the fun can return number in this format 000043567
    public static String createId() {
        currantId++;
        if (currantId>999999999){
            throw new ArithmeticException("cant create more then 999999999");
        }
        return stringOfZeros(idLength-currantId.toString().length()) + currantId.toString();
    }


    private static String stringOfZeros(int numOfZero){
        String temp = "";
        for (int i = 1; i <= numOfZero; i++) {
            temp +="0";
        }
        return temp;
    }

    private static String generateRandomId() {
        Random random = new Random();
        return String.valueOf(random.nextInt(999999999));
    }
}
