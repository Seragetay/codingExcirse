package com.company;

public class SumDigital {

    public static int sumDigits(int num){
        int sum=0;
        if (num <= 9){
            System.out.println("Single or negative digit!!");
            return -1;
        }
        while (num > 0){
             int dig1 = num%10;
             sum += dig1;

             num /= 10;
        }
        System.out.println("The total of " + num + " digits = " + sum);
        return sum;
    }
}
