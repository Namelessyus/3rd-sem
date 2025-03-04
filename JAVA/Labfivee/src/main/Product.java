/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class Product {
    //attributes of classs 'Product'
    public int product_id;
    public string product_title;
    public double product_price;
    public string product_category ;
    public string product_brand ;
    public string product_description ;
    
    //initializing default constructor
    //Note: constructo name must be same as class name and
    // musdt be of without any return type
    public Product(){
        //initiallizing value/data toi attribute insie constructor
        //that means whenever the obejct of this class is created
        // the below initialized data are assigned automatically
        this.product_id = 1;
        this.product_title = "Smart Board";
        this.product_category = " Electronics ";
        this.product_brand = "Huawei";
        this.product_price = 20000.00;
        this.product_description = "AI integrated Smart Board";
        
                }
    }


    

