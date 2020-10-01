package com.company;

import java.util.Scanner;

public class Contract {
    private firstParty firstParty;
    private secondPartyBusiness secondPartyBusiness;
    private String data;
    private String typeOfContract;
    private String body;
    private String terms;

    Scanner scanner = new Scanner(System.in);


    public Contract(firstParty firstParty, secondPartyBusiness secondParty, String data, String typeOfContract) {
        this.firstParty = firstParty;
        this.secondPartyBusiness = secondParty;
        this.data = data;
        this.typeOfContract = typeOfContract;
    }



    public void bodyOfContract(){
        System.out.printf("Please enter the contract body: ");
        this.body = scanner.nextLine();
        System.out.println(this.body);

    }
    public void theTerms(){
        this.terms = scanner.nextLine();
    }

    public firstParty getFirstParty() {
        return firstParty;
    }

    public secondPartyBusiness getSecondPartyBusiness() {
        return secondPartyBusiness;
    }

    public String getData() {
        return data;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

}
