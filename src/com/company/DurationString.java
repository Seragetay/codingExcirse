package com.company;

public class DurationString {
    public static String getDurationString(long minutes, long second){
        if ((minutes < 0) || (second < 0) || (second > 59)){
            System.out.println("Invalid input");
            return "Invalid";
        }
        long hours = minutes / 60;
        long mints = minutes % 60;
        return hours + "h " + mints + "m " + second + "s";
    }
    public static String getDurationString(long second){
        if (second < 0){
            System.out.println("Invalid Input");
            return "Invalid Input";
        }
        long minutes = second / 60;
        long remainingSec = second % 60;

        return getDurationString(minutes, remainingSec);
    }
}
