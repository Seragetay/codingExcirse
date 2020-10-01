package com.company;

public class Vehicle {
    private final int engine;
    private final int tiresCount;
    private final int doors;
    private final String bodyType;
    private final String gearType;

    public Vehicle(int engine, int tiresCount, int doors, String bodyType, String gearType) {
        this.engine = engine;
        this.tiresCount = tiresCount;
        this.doors = doors;
        this.bodyType = bodyType;
        this.gearType = gearType;
    }
    public void shiftting(int gear){
        System.out.println("The car can have multiple shifting gears");
    }

    public int getEngine() {
        return engine;
    }

    public int getTiresCount() {
        return tiresCount;
    }

    public int getDoors() {
        return doors;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getGearType() {
        return gearType;
    }

}
