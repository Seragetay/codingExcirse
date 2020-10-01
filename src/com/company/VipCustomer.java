package com.company;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
        System.out.println("Full account has been created for " + customerName + ", with credit limit of " + creditLimit + ".");
    }
    public VipCustomer(String customerName, double creditLimit){
        this(customerName, creditLimit, "Temp@Temp");
        System.out.println("Accout has been created temporally for " + customerName + ", with credit limit of " + creditLimit + " Still waiting for email address.");
    }

    public VipCustomer(){
        this("Need Name", 0.00, "Temp@temp");
        System.out.println("Test account has been created. Customer name " + customerName + ", credit limit " + creditLimit + ", and email address is " + customerEmail+".");
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
