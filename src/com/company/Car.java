package com.company;

public class Car extends Vehicle {
    private final String engineType;
    private final String color;
    private final String name;


    public Car(int tiresCount, int doors, String bodyType, String gearType, String engineType, String color, String name) {
        super(1, tiresCount, doors, bodyType, gearType);
        this.engineType = engineType;
        this.color = color;
        this.name = name;

    }
    public void printDescriptiion(){
        System.out.println("Name: " + this.name +"\n" +
                            "Body type: " + this.getBodyType() + "\n" +
                            "Engine Size: " + this.engineType + "\n" +
                            "Gear type: " + this.getGearType() + "\n" +
                            "Color: " + this.color);
    }

    public String getName() {
        return name;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getColor() {
        return color;
    }
    private void gear1(){
        System.out.println("The car speed between 0.1 to 35 m/h.");
    }
    private void gear2(){
        System.out.println("The car speed between 36.1 to 50 m/h.");
    }
    private void gear3(){
        System.out.println("The car speed between 50.1 to 80 m/h.");
    }
    private void gear4(){
        System.out.println("The car speed between 80.1 to 140 m/h.");
    }
    public void gearShifting(int gearing){
        if (gearing == 0){
            System.out.println("The car is not moving");
        }else {
            if (gearing == 1){
                gear1();
            }
            else if(gearing == 2){
                gear2();
            }
            else if (gearing == 3){
                gear3();
            }
            else if (gearing == 4){
                gear4();
            }
        }
    }

    @Override
    public void shiftting(int gears) {
        super.shiftting(gears);
        gearShifting(gears);
    }
}
