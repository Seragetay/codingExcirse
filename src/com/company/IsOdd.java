package com.company;

public class IsOdd {

    public static boolean isOdd(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Invalid number");
            return false;
        }
        boolean odd = false;
        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                odd = true;
                sum +=i;
                System.out.println(i + " is odd number.");
            }
        }
        System.out.println("Sum = " + sum);
        return odd;

    }

}
