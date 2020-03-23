package com.company.entities;

import com.company.enums.FirstName;
import com.company.enums.LastName;
import com.company.util.LocationGenerator;

import static com.company.util.IdGenerator.createId;

public class User {
    String id;
    String email;
    FirstName firstName;
    LastName lastName;
    String city;
    String country;

    public User(String id, FirstName firstName, LastName lastName, String email, String city, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.country = country;
    }

    public User(){
        this.id = createId();
        this.firstName = FirstName.getRandomValue();
        this.lastName = LastName.getRandomValue();
        this.email = firstName.getValue() + "." + lastName.getValue() + "@company.com";
        this.city = LocationGenerator.getRandomCity();
        this.country = LocationGenerator.getCountry(city);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FirstName getFirstName() {
        return firstName;
    }

    public void setFirstName(FirstName firstName) {
        this.firstName = firstName;
    }

    public LastName getLastName() {
        return lastName;
    }

    public void setLastName(LastName lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(email);
        stringBuilder.append(", ");
        stringBuilder.append(firstName.getValue());
        stringBuilder.append(", ");
        stringBuilder.append(lastName.getValue());
        stringBuilder.append(", ");
        stringBuilder.append(country);
        stringBuilder.append(", ");
        stringBuilder.append(city);
        stringBuilder.append(", ");
        stringBuilder.append(id);
        return stringBuilder.toString();
    }

    public void printUserData(){
        System.out.println(toString());
    }
}