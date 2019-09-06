package com.spring.export.model;

import com.opencsv.bean.CsvBindByPosition;

public class User {
    @CsvBindByPosition(position = 0)
    private long id;
    @CsvBindByPosition(position = 1)
    private String name;
    @CsvBindByPosition(position = 2)
    private String email;
    @CsvBindByPosition(position = 3)
    private String country;
    @CsvBindByPosition(position = 4)
    private int age;

    public User(long id, String name, String email, String country, int age){
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setCountry(country);
        this.setAge(age);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
