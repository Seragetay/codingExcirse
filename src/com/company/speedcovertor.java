package com.company;

public class speedcovertor {

    public static long toMilePerHourCon(double kiloMeterPerHour){
        if (kiloMeterPerHour <0) {
            return -1;
        }
        return Math.round(kiloMeterPerHour / 1.609);
    }

    public static void printResult(double kiLometerPerHour){
        if (kiLometerPerHour < 0){
            System.out.println("Invalid Input");
        }else{
            System.out.println(kiLometerPerHour + " k/h = " + toMilePerHourCon(kiLometerPerHour) + " m/h");
        }

    }
}
