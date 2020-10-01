package com.company;

import java.util.Scanner;

public class sumOfIntNum {

    public static void sumOfInt(int timesOfInt){

        int counter = 0;

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (true){
            int order = counter +1;
            System.out.println("Please enter #" + order);
            boolean ishasInt = scanner.hasNextInt();

            if (ishasInt){
                int number = scanner.nextInt();
                counter++;
                sum +=number;
                System.out.println("You entered #" + number);
                if (counter == timesOfInt){
                    break;
                }
            }else {
                System.out.println("Invalid Number!!");
            }
            scanner.nextLine();
        }

        System.out.println("Sum = " + sum);

        scanner.close();

    }

}
