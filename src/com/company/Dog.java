package com.company;

public class Dog extends Animal {
    private int legs;
    private int tail;
    private String coat;


    public Dog(String name, int body, int brain, int size, int weight, int legs, int tail, String coat) {
        super(name, body, brain, size, weight);
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Chew() called");
    }

    public void walk(){
        int speed = 5;
        System.out.println("Dog.walk() called");
        super.move(speed);
        System.out.println("Dog walk at speed of " + speed);
    }

    public void run(){
        int speed = 10;
        System.out.println("Dog.run() called");
        move(speed);
        System.out.println("Dog run at speed of " + 10);
    }

    @Override
    public void drink() {
        chew();
        super.drink();
    }
    private void moveLegs(int speed) {
        System.out.println("moveLegs() method called");
    }

    @Override
    public void move(int speed) {
        System.out.println("super.mover() called");
        moveLegs(speed);
        super.move(speed);
    }


}
