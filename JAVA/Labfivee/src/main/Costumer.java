/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class Costumer {
    
    //atributes/members of class 'customer'
    
    public String full_name;
    public String email;
    public String contact;
    public String gender;
    public String address;
    public String dob;
    
    //behavior/methods of class 'Customer'
    public void displayCustomerInfo (){
        System.out.println("Name:" + this.full_name);
        System.out.println("Email:" + this.email);
        System.out.println("Contact:" + this.contact);
        System.out.println("Gender:" + this.gender);
        System.out.println("Addresss:" + this.address);
        System.out.println("Date of Birth:" + this.dob);
    }
    /**
     * This method checks if the email is already available
     * in the system or not before registering the customer
     * @param parem_email
     * @return 
     */
    
    public boolean checkAvailability(String parem_email){
        boolean status = false;
        if(this.email == param_email){
            status = true;
        }
        return status;
        }
   
    }

