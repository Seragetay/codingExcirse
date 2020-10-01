package com.company;

public class Cuboid extends Rectangle {
    private double depth;

    public Cuboid(double width, double length, double depth) {
        super(width, length);
        this.depth = depth;
        if (this.depth <= 0){
            this.depth =0;
        }

    }
     public  double getDepth(){
        return this.depth;
     }
     public void getVolume(){
        if (this.depth <= 0){
            System.out.println("Invalid depth provided!");
            this.depth =0;
        }
        double volume = getArea() *  this.depth;
         System.out.println(volume);
     }

}
