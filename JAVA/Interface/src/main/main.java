/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author anush
 */
public class main {
    public static void main(String args[]){
        BankTransfer bank = new BankTransfer();
        bank.account_no=9841;
        bank.password="password";
        bank.processPayment(100.1);
    }
}
