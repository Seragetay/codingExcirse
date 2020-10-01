package com.company;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int megaByt = kiloBytes /1024;
            int reminder = kiloBytes % 1024;
            System.out.println('"' + "" + kiloBytes + " KB " + "= "+ megaByt + " MB " + reminder + " KB" + '"' );

        }

    }
}
