package com.company;

public class Porchi extends BasicCar{


    public Porchi() {
        super(4, 3400, 4, "Porchi");
    }

    @Override
    public String speed() {
        return "Come for a speed ride!!!";
    }
}
