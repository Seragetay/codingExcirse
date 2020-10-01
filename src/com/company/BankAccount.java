package com.company;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(1111, 0.00, "Default", "None", "000-000-0000");
        System.out.println("Empty Constructor has been called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("The constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName= customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(88888, 500.40, customerName, email, phoneNumber);

    }

    public void deposit(double cash) {
        if (cash <=0){
            System.out.println("Invalid deposited amount");
        }else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You have deposited " + cash + " Please confirm (Y/N).");
            String answer = scanner.nextLine();
            answer.toLowerCase();
            if (answer.equals("y")){
                balance += cash;
                System.out.println("Deposited amount is: " + cash + ", Total balance is "+
                        balance);
            }
            else {
                System.out.println("Please check your deposited cash.");
            }
        }
    }

    public void withdraw(double wcash){

        if (wcash <=0 || wcash < balance){
            System.out.println("Insufficient balance, your available balance is " + balance);
        }else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You want to withdraw " + wcash + " Please confirm (Y/N).");
            String answer = scanner.nextLine();
            answer.toLowerCase();
            if (answer.equals("y")){
                balance -= wcash;
                System.out.println("Withdraw amount is: " + wcash + ", Available balance is "+
                        balance);
            }
            else {
                System.out.println("Please check withdraw amount cash.");
            }
        }

    }


    public void setAccountNumber(int accountNumber) {
        if (this.balance < 50){
            System.out.println("no account is set.");
        }
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        System.out.println("Your account number is ");
        return accountNumber;
    }

    public void setBalance(double balance) {
        if (balance < 50){
            System.out.println("You need to deposit $50 in order to create your account");
        }
        this.balance = balance;
    }



    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }





}

