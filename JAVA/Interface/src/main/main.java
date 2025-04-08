package main;

/**
Question 1: Create a Java program for a where different payment methods like CreditCard, PayPal, 
and BankTransfer implement a PaymentMethod interface. The interface should define a method processPayment(double amount). 
Write a main class that demonstrates processing a payment using all three methods.
Demonstrate how interfaces allow different classes to follow a common contract and support polymorphism.
 */

public class main {
    public static void main(String args[]){
        BankTransfer bank = new BankTransfer();
        bank.account_no=9841;
        bank.password="password";
        bank.processPayment(100.1);
    }
}
