package com.company;

import java.util.Scanner;

public class secondPartyBusiness {
    private String businessName;
    private String address;

    public secondPartyBusiness(String businessName, String address) {
        this.businessName = businessName;
        this.address = address;
    }
    Scanner scanner = new Scanner(System.in);
    public String business(){
        this.businessName = scanner.nextLine();
        return this.businessName;
    }
    public String address(){
        this.address = scanner.nextLine();
        return this.address;
    }
}
