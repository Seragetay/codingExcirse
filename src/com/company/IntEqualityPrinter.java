package com.company;

public class IntEqualityPrinter {

    public static void printEqual(int num1, int num2, int num3){

        if (num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Input!!");
        }
        else if (num1 == num2 && num2 == num3){
            System.out.println("All nubers are equal!!");
        }
        else if ((num1 == num2 ) || (num1 != num3)){
            System.out.println("Neither all equal or different!!");
        }else {
            System.out.println("All Numbers are different");

        }

    }
}
