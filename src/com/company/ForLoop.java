package com.company;

public class ForLoop {
    public static void forLoop(int loop, double percent, double amount){
        for (int i=8; i>(loop); i--){

            System.out.println(i + ":" + "Interest of " + amount + " at " + percent + "%" + " = " + String.format("%.2f", InterestCalc.interesetCalc(amount, percent)));
            percent--;

        }

    }
}
