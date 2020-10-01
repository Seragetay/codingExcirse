package com.company;

import java.util.Scanner;

public class UserInput {

    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasInt = scanner.hasNextInt();
        if (hasInt){
            int yearOfBirth = scanner.nextInt();
            int age = 2020 - yearOfBirth;

            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age >=0 && age <=100){
                System.out.println("Your name is " + name + " and you're " + age + " years old.");
            }else {
                System.out.println("Invalid year of birth!!");
            }



        }else {
            System.out.println("Year of birth needs to have a valid year not a text!!");

        }
        scanner.close();

    }

}
