package com.company;

public class Main {

    public static void main(String[] args) {

        Account Ram = new Account(1548412, 0, "Ram", "ram@gmail.com", 95459412);

        //Entering Users Information
        Ram.deposit(100);
        Ram.withdraw(50);

        Account Shyam = new Account("Shyam", "Shyam@gmail.com", 954578);
        System.out.println("Account Number is " + Shyam.getAccountNumber() + " And Name is " + Shyam.getName());

        //VIP Customer
        VipCustomer sita = new VipCustomer("Sita");
        System.out.println("Name: " + sita.getName() + " Credit Limit: " + sita.getCreditLimit());




    }
}
