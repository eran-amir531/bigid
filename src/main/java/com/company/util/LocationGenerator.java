package com.company.util;

import java.util.HashMap;
import java.util.Random;

public class LocationGenerator {

    private static HashMap<String, String> city_country = new HashMap<String, String>() {{
        put("Tel aviv", "Israel");
        put("Askelon", "Israel");
        put("Kabul", "Afghanistan");
        put("Tirana", "Albania");
        put("La Paz", "Bolivia");
        put("Cambridge", "United Kingdom");
        put("Liverpool", "United Kingdom");
        put("Manchester", "United Kingdom");
        put("San Jose", "California");
        put("Nashville", "Tennessee");
        put("Miami", " Florida");
    }};


    public static String getRandomCity(){
        return pickRandomCity();
    }

    public static String getRandomCountry(){
        return city_country.get(pickRandomCity());
    }

    public static String getCountry(String city){
        return city_country.get(city);
    }

    private static String pickRandomCity(){
        Object[] citiesArray = city_country.keySet().toArray();
        Object city = citiesArray[new Random().nextInt(citiesArray.length)];
        return city.toString();
    }
}
