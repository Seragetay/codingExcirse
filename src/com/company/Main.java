package com.company;



public class Main {

    public static void main(String[] args) {
        for (int i= 1; i<5; i++){
            BasicCar car = randomCar();
            System.out.println("Car #" + i + ":" + car.getMake() + "\n" +
                                "The logo of the car says: "+ car.speed());
        }


        }
    BasicCar car = new BasicCar(4,3600,4, "Unknown");

    public static BasicCar randomCar(){
        int randomNum = (int) (Math.random()*3)+1;
        System.out.println();
        switch (randomNum){
            case 1:
                return new Porchi();
            case 2:
                return new BMW();
            case 3:
                return new Jacuar();
            default:
                System.out.println("No car is urs");
                break;
        }
        return null;
    }

}


