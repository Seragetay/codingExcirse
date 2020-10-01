package com.company;

public class EvenDigitSum {

    public static int evenDigitSum(int num){
        int sum =0;
        if (num <=0){
            System.out.println("Negative number");
            return -1;
        }
        while (num !=0){
            int last = num % 10;
            if (last%2 ==0){
                sum += last;
            }
            num /= 10;
        }
        return sum;
    }

}
