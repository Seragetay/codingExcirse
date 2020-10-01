package com.company;

public class SumThreeAndFIve {

    public static void sumToNums(int num1, int numt2, int loop){
            int sum=0;
            int counter=0;
        for (int i = 1; i<=loop; i++){
            if ((i % num1==0) && (i % numt2==0)){
                System.out.println(i + " number can be divided by " + num1 + " & " + numt2 + ".");
                sum +=i;
                counter++;

            }

            if (counter==5){
                break;
            }

        }
        System.out.println("Sum = " + sum);

    }

}
