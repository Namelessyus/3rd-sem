/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author anush
 */
public class PayPal implements PaymentMethod {
    public int account;
    public String password;
    @Override
    public void processPayment(double amount){
        double balance = 100000;
        if(balance < amount){
            System.out.println("Insufficient Balance");
            return;
        }
        if((this.password.equals("password")) && this.account==9841){
            System.out.println("Payment sucessfull of :"+amount+"remaning balance is : "+(balance-amount));
        }else{
            System.out.println("Payment unsucessfull");
        }
    }
}
