package com.company;

public class SwitchStatement {

    public static void switchState(String num){


        switch (num.toLowerCase()){
            case "a":
                System.out.println(num + " Equals A");
                break;
            case "b":
                System.out.println(num + " equals B");
                break;
            case "c":
                System.out.println(num + " equals C");
                break;
            case "d":
                System.out.println(num + " equals D");
                break;
            default:
                System.out.println("It is not A, B, C or D");
                System.out.println("It is "+ num);
                break;
        }
    }
    public static void switchState(int dayOfTheweek){
        switch (dayOfTheweek){
            case 1:
                System.out.println("It is the start, try not to snooring when you sleep in the meeting ");
                break;
            case 2:
                System.out.println("It is the only day that you can produce in!!");
                break;
            case 3:
                System.out.println("Hump Day Yay");
                break;
            case 4:
                System.out.println("We're getting closer");
                break;
            case 5:
                System.out.println("No better news can be other than it is Friday!!");
                break;
            case 6:
                System.out.println("Relax, read, go out and have fun!!");
                break;
            case 7:
                System.out.println("Remember that you need to finish everything you delayed during the week today HAHAHAHA");
                break;

            default:
                System.out.println("This is day is not available in our solar system!!");
        }
    }
}
