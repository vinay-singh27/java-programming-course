package com.company;

public class Account {

    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private int mobileNumber;

    public Account() {
        this(0000, 0, "Default Name", "Default Email", 0000);
        System.out.println("Default Constructor is called");
    }

    public Account(int accountNumber, int balance, String name, String email, int mobileNumber) {
        System.out.println("Account Constructor is called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public Account(String name, String email, int mobileNumber) {
        this(0000, 0, name, email, mobileNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void deposit(int amount) {
        if (amount < 0)
            System.out.println("Invalid Amount cannot be deposited");
        else {
            this.balance += amount;
            System.out.println("Amount " + amount + " is successfully deposited");
            System.out.println("New Balance is: " + this.balance);
        }
    }

    public void withdraw(int amount) {
        if (amount < 0)
            System.out.println("Invalid amount cannot be withdrawn");
        else if (amount < this.balance) {
            this.balance -= amount;
            System.out.println("Amount " + amount + " is successfully withdrawn");
            System.out.println("New Balance is : " + this.balance);
        }
        else {
            System.out.println("Withdrawn amount is greater than the current balance. It cannot be withdrawn");
        }
    }
}
