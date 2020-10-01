package com.company;

public class Cylindar extends Circle{
    private double height;


    public Cylindar(double radius, double height) {
        super(radius);
        this.height = height;
        if (this.height == 0){
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolum(){
        if (this.height <= 0){
            System.out.println("The height value is invalid!");
        }
        return (getArea()* this.height);
    }
}
