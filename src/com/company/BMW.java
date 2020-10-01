package com.company;

public class BMW extends BasicCar {
    public BMW() {
        super(4, 3600, 4, "BMW");
    }

    @Override
    public String speed() {
        return "Here you find the speed you need, Luxury";
    }
}
