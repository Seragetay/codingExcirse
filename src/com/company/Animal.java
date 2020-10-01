package com.company;

public class Animal {
    private String name;
    private int body;
    private int brain;
    private int size;
    private int weight;

    public Animal(String name, int body, int brain, int size, int weight){
        this.name = name;
        this.body = body;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
    }

    public void sound(){
        System.out.println("I can speak");
    }
    public void drink(){
        System.out.println("I am drinking");
    }
    public void move(int speed){
        System.out.println("Animal.Move() called");
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
