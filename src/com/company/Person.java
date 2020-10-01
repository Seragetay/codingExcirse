package com.company;

public class Person {
    private String firstName;
    private String secondName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 18){
            System.out.println("Access denied!");
        }else {
            System.out.println("Access granted!");
        }

    }

    public int getAge() {
        return age;
    }
}
