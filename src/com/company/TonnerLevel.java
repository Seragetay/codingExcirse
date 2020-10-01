package com.company;

public class TonnerLevel {
    private int inkPercentage;
    private  String color;
    private String Manifacturer;

    public TonnerLevel(int inkPercentage, String color, String manifacturer) {
        if (inkPercentage > 0 && inkPercentage <=100){
            this.inkPercentage = inkPercentage;
        }
        this.color = color;
        this.Manifacturer = manifacturer;
    }
    public int inkLevel(int inkCunsumed){
        if (this.inkPercentage <= 0){
            System.out.print("Cartridges need to be changed");
        }else {
            this.inkPercentage = this.inkPercentage - inkCunsumed;
            System.out.println(this.inkPercentage + "% remaining ink Cartridges");
        }
        System.out.println("Level of ink is: " + inkPercentage);
        return inkPercentage;
    }

    public String getColor() {
        return color;
    }

    public String getManifacturer() {
        return Manifacturer;
    }

}
