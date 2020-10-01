package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 8 || hourOfDay > 22 || !barking){
            return false;
        }
        return true;
    }
    public static void trigAlarm(boolean barking, int hours){
        boolean alarm = shouldWakeUp(barking, hours);
        if (alarm){
            System.out.println("Wake Up Wake Up Breach Breach!!");
        }

    }
}
