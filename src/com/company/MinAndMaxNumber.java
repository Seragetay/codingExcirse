package com.company;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MinAndMaxNumber {

    public static void minMaxNumber(){

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean first= true;

        while (true){
            System.out.println("Enter your number: ");
            boolean isHasInt = scanner.hasNextInt();
            if (isHasInt){
                int number = scanner.nextInt();
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
            }else {
                break;
            }

            scanner.nextLine();

        }
        System.out.println("max number = " + max + ", min number = "+ min);
        scanner.close();
    }


}
