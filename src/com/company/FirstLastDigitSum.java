package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = 0;
        int firstDigit = 0;
        int countLoop = 0;

        do {
            if (countLoop ==0){
                lastDigit = number%10;
            }
            int digit = number %10;
            number /= 10;
            if (number == 0){
                firstDigit = digit;
            }
            countLoop++;

        }while (number !=0);
        return firstDigit + lastDigit;
    }

}
