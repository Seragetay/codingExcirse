package com.company;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount <0) || (smallCount <0) || (goal<0)){
            return false;
        }
        bigCount = bigCount * 5;
        int sum = bigCount + smallCount;

        if (bigCount > goal){
            return false;
        }

        return bigCount + smallCount == goal + 1 || bigCount + smallCount == goal;
    }

}
