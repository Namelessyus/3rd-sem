/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author anush
 */
public class BankTransfer implements PaymentMethod{
    public int account_no;
    public String password;
    @Override
    public void processPayment(double amount){
        if((this.password.equals("password")) && this.account_no==9841){
            System.out.println("Payment sucessfull of :"+amount);
        }else{
            System.out.println("Payment unsucessfull");
        }
    }
}
