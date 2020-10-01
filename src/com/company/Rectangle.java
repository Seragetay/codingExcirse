package com.company;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width <= 0){
            this.width = 0;
        }
        this.width = width;

        if (this.length <= length){
            this.length =0;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        if ((this.width <= 0) || (this.length <= 0)){
            System.out.println("Invalid input!");
            return 0;
        }
        return this.length * this.width;
    }

}
