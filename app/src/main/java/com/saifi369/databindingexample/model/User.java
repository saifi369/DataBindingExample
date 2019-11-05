package com.saifi369.databindingexample.model;

public class User {

    private String firstName;
    private int age;

    public User(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
