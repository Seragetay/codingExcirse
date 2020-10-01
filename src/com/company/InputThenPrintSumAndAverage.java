package com.company;

import java.util.Scanner;

public class InputThenPrintSumAndAverage {

    public static void InputCalculator(){

        Scanner scanner = new Scanner(System.in);

        double divider = 0;
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        boolean first = true;


        while (true){
            System.out.println("Enter your number: ");
            boolean isHasInt = scanner.hasNextDouble();

            if (isHasInt){
                double number = scanner.nextDouble();
                divider++;
                sum += number;
//                if (first){
//                    first = false;
//                    max = number;
//                    min = number;
//                }
                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }else{
                break;
            }
        }
        System.out.println("The Sum = " + sum + ", average is = " + sum/divider + ", Max number = " + max + ", Min number = " + min);

    }

}
