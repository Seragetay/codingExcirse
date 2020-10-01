package com.company;

import java.lang.Math;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(){
        return Math.sqrt((Math.pow(this.x, 2) + Math.pow(this.y, 2)));
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x,2) + (Math.pow(this.y - y, 2)));
    }
}
