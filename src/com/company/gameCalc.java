package com.company;

public class gameCalc {

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " Points");
        return score * 500;
    }
    public static int calculateScore(int score){
        System.out.println("Guest player scored " + score + " Points");
        return score * 500;
    }
    public static int calculateScore(){
        System.out.println("No Player in the game!!");
        return 0;
    }
}
