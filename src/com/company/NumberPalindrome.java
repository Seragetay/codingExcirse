package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int secondNumber = 0;
        while (number != 0) {
            int next = number % 10;
            secondNumber = (secondNumber * 10) + next;
            System.out.println(secondNumber);
            number /= 10;
        }
        return secondNumber == number;
    }
}

