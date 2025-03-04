package main;
//since our ConstructorOverloadingEample class is in different package
// we need to import the class and name for MethodOverloadingExample
import main.construction.ConstructorOverloadingExample;
import main.method.MethodOverloadingExample;

public class Main {
    public static void main(String args[]){
        /**Constructor Overloading example
         * creating object with constructor having parameter and parameterless
         * 1. default constructor i.e parameterless constructor
         */
        ConstructorOverloadingExample eg_one = new ConstructorOverloadingExample();
        /**we already have initialized the data to class variable inside
         * default constructor so whenever we create object using default
         * constructor, the data are passed automatically but if any of the attributes
         * are not assigned the value inside constructor then they will hold 'null; value
         * during the time of object creation
         */ 
        // acessing date i.e attribute using object
        System.out.println("Name:" + eg_one.full_name);
        System.out.println("Username:" + eg_one.username);
        System.out.println("role:" + eg_one.role);

        
        
        /**2. creating object with single parameter
         * in case of our example we have assigned value to 'username' only so
         * except 'username' other attributes will have 'null' value during
         * creating object using this constructor
         */
        ConstructorOverloadingExample eg_two = new ConstructorOverloadingExample("useradmin");
        //acessing value:
        System.out.println("Name:" + eg_two.full_name);
        System.out.println("Username:" + eg_two.username);
        System.out.println("role:" + eg_two.role);
        
        //3. creating object with multiple parameter constructor
        ConstructorOverloadingExample eg_three = new ConstructorOverloadingExample("Himal Rai","director");
        //accessing data of class attributes:
        System.out.println("Name:" + eg_three.full_name);
        System.out.println("Username:" + eg_three.username);
        System.out.println("role:" + eg_three.role);
        
        //Method Overloading Exmaples
        //creating object of class 'MethodOverloadingExample'
        MethodOverloadingExample eg_four = new MethodOverloadingExample();
        //calling all method
        //1. method with type void and two double parameter
        eg_four.area(15.00, 10.00);
        
        //2.method with type double and simple parameter
        //since the method returns vaule so we can re-use assigning it to variable
        //or simply print incase of no future use
        System.out.println("Area of circle:" + eg_four.area(11.00));
        //storing to any value
        double result = eg_four.area(12.00); //since it returns double value
        
    }
    
        //3. method with type int and paramterless
        System.out.println("Area of Square: " + eg_four.area());
            //storing to any value
        int output = eg_four.area();
        System.out.println("Area of Square: " + output);

        //4. method with type int and two parameter
        System.out.println("Area of triangle: " + eg_four.area(5,8));

    }
