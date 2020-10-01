package com.company;

public class Wall {
    private double height;
    private double width;

    public Wall(double height, double width){
        this.height = height;
        if (this.height < 0){
            this.height = 0;
        }

        this.width = width;
        if (this.width < 0){
            this.width = 0;
        }

    }
    public Wall(){
        this(0.00, 0.00);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
