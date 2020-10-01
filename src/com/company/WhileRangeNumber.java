package com.company;

import com.company.IsEvenNumber;

public class WhileRangeNumber {

    public static void numberEvenTest(int start, int end){
        int sum = 0;
        int counter= 0;
        while (start <= end){
            start+=1;
            if (!IsEvenNumber.isEvenNum(start)){
                continue;
            }
            sum += start;
            counter++;
            System.out.println(start + " is an even number.");

            if (counter == 5){
                System.out.println("Sum = " + sum);
                break;
            }
        }

    }
}
