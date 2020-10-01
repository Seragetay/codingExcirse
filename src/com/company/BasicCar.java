package com.company;

public class BasicCar {
    private int doors;
    private int engineSize;
    private int tires;
    private String make;

    public BasicCar(int doors, int engineSize, int tires, String make) {
        this.doors = doors;
        this.engineSize = engineSize;
        this.tires = tires;
        this.make = make;
    }

    public String speed(){
        return "Defaulted no speed or need";
    }

    public int getDoors() {
        return doors;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public int getTires() {
        return tires;
    }

    public String getMake() {
        return make;
    }
}
