package com.company;

public class Jacuar extends BasicCar{
    public Jacuar() {
        super(4, 3200, 4, "Jaquar");
    }

    @Override
    public String speed() {
        return "Maby not the fastest, but I give you the luxury";
    }
}
