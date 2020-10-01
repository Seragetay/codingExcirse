package com.company;

public class calcFeetAndInchesToCm {
    public static double calcFeetAndInchesToCent(double feets, double inches){

        if (feets < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid input!!");
            return -1;
        }
        double toCent = ((feets * 12)*2.54);
        toCent += inches * 2.54;
        System.out.println(feets + " feet " + " + " + inches + " inches = " + toCent + " cm.");
        return toCent;
    }
    public static double calcFeetAndInchesToCent(double inches){
        if (inches < 0){
            System.out.println("Invalid input, your input is " + inches);
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCent(feet, remainingInches);
    }

}
