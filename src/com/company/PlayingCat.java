package com.company;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){

        if ((summer && (temperature >=25 && temperature <=45)) || (!summer && temperature >= 25 && temperature <=35)){
            System.out.println("The cat is playing!!");
            return true;
        }
        System.out.println("Cat is not playing");
        return false;

    }
}
