package com.company;

public class SimpleCalc {
    private double firstNum;
    private double secondNum;

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public static double simpleCal(String operator, double first, double second){
        double sum= 0;
        switch (operator){
            case "+":
                sum = first + second;
                break;
            case "-":
                sum = first - second;
                break;
            case "/":
                sum = first / second;
                break;
            case "*":
                sum = first * second;
                break;
            default:
                System.out.println("No results returned");
        }return sum;
    }
}
