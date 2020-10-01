package com.company;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){
        System.out.println("The fish is resting");
    }

    private void moveMuscle(){
        System.out.println("Fish is moving muscle");
    }

    private void moveBackFins(){
        System.out.println("Fish is moving back fins");
    }

    public void swim(int speed){
        moveMuscle();
        moveBackFins();
        move(speed);
    }

}
