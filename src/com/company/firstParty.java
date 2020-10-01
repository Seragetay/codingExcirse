package com.company;

public class firstParty {
    private String firstName;
    private String lastName;
    private String initial;

    public firstParty(String firstName, String lastName, String initial) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.initial = initial;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInitial() {
        return initial;
    }
}
