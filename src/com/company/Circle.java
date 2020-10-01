package com.company;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (this.radius <= 0){
            this.radius = 0;
        }

    }

    public double getArea(){
        if (this.radius <= 0){
            System.out.println("Invalid radius value!");
        }
        return ((radius * radius * Math.PI));
    }

    public double getRadius() {
        return radius;
    }


}
