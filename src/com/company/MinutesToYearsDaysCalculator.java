package com.company;

public class MinutesToYearsDaysCalculator {

    public static void printYearsDays(long minutes){
        final long minutesInYear = 525600L;
        final long minutesInDay = 1440L;
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        System.out.println(minutes);
        long years = minutes / minutesInYear;
        long days = (minutes % minutesInYear)/1440;

        if (years < 10){
            System.out.println("There are 0" + years + " years and " + days + " days in " + minutes + " minutes ");
        }else {
            System.out.println("There are " + years + " years and " + days + " days in " + minutes + " minutes ");

        }

    }

}
