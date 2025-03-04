package main;

public class ClassObjectiveExample {
    public static void main(String args[]){
        /** creating objective of classes
         * Note: class 'Customer' does not have any constructor
         * so here 'default constructor' will be invoked/called while
         * creating the objective of 'Customer
         */
        Costumer c1 = new Costumer ();
        
        Costumer c2 = new Costumer ();
        
        Costumer c3 = new Costumer ();
        //Note: here all objects c1,c2 and c3 are different objects and
        //they will carry different data i.e state of class customer
        
        //assigning / storing data in class 'Consrumer; attributes
        
        c1.full_name = "Hira Lal Bajahain";
        c1.email = "hirab@gmail.com";
        c1.address = "Bharatpur";
        c1.gender = "Male";
        c1.contact="+977 986543210";
        c1.dob="1990-02-15";
        
        c2.full_name = "Hira Bajahain";
        c2.email = "hira@gmail.com";
        c2.address = "Bhaktapur";
        c2.gender = "Male";
        c2.contact="+977 986543211";
        c2.dob="1991-02-15";
        
        c3.full_name = "potato";
        c3.email = "poo@gmail.com";
        c3.address = "potato world";
        c3.gender = "potato";
        c3.contact="+977 6482956286";
        c3.dob="0000-01-01";
                
        c1.displayCustomerInfo();
        System.out.println();
        c2.displayCustomerInfo();
        System.out.println();
        c3.displayCustomerInfo();
        // calling/invoking 'method' with parameter and return type
        // method one: storing value return by methof in any variable
        // note: datatype of variable must be same as return type
        boolean result = c1.checkAvailability("harilal@gmail.com");
        //we call use either conditional statement or simpley ternary operator
        // in thid case: we are using ternary operator
        System.out.println("Email Status:" + (result? "email is correct":"Email is incorrect"));
        //methid two: direct using conditional statement
        if(c2.checkAvailability ("shreekumari@gmail.com")){
            System.out.println("Email is matching");
        } else {
            System.out.println("Email is not matching");
        }
        // method three: direct printing
        System.out.println("Email ststus: " + c3.checkAvailability("poo@gmail.com"));
        
       //creating object of class Product
       // Note: we have defined default constriuctor of class 'Product'
      // so here the defined constructor will be callled whenever the 
      // object is created
      Product pl = new Product();
      // invoking the method of class 'product'
      // since rhe data are already intialized inisde the conbstructor
      // so the dfulkt
    }
    
}
