package com.company;

import java.util.Scanner;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length){
        this.width = width;
        if (this.width ==0){
            this.width = 0;
        }
        this.length = length;
        if (this.length == 0){
            this.length = 0;
        }

    }
     public double getWidth(){
        return width;
     }

    public double getLength() {
        return length;
    }

    public void cost (){
        double price=0;
        Scanner scanner = new Scanner(System.in);

     while (true){
            System.out.println("Please enter the unit price");
            boolean isHasDouble = scanner.hasNextDouble();
            if (isHasDouble){
                double unitPrice = scanner.nextDouble();
                price = (this.length * this.width) * unitPrice;
                System.out.println("The length is " + this.length + " and the width is "+ this.width +" The total price of carpet is: " + price);
                break;
            }
            else {
                System.out.println("Please enter a valid numbers.");

            }
            scanner.nextLine();

        }

    }
}
