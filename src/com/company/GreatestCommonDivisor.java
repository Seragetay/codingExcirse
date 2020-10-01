package com.company;

public class GreatestCommonDivisor {

    public static int greateCommonDivisor(int fistNum, int secNum){
        int divisor = 0;
        int greatesFiv = 0;
        if ((fistNum <0)|| (secNum <0)){
            return -1;
        }
        while (divisor <= fistNum || divisor <= secNum){

            divisor++;
            if (fistNum % divisor==0 && secNum % divisor ==0){
                greatesFiv = divisor;
            }

            return greatesFiv;

        }
        return greatesFiv;
    }

}
