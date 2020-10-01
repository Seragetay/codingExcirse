package com.company;

import java.lang.Math;

public class AreaCalculator {

    public static double area(double radius){
        final double byrad = 3.14;
        if (radius < 0){
            System.out.println("Your input is lesser than '0'");
            return -1;
        }
        double area = byrad * Math.pow(radius, 2);
        System.out.println("The are of this circal is = " + area);
        return area;

    }
    public static double area(double x, double y){
        if (x < 0 || y< 0){
            System.out.println("Your input is invalid");
        }
        double area = x * y;
        System.out.println("The area for this rectangle = " + area);
        return area;
    }

}
