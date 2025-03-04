
package main;


public class MethodExample {
    
     /**
     * method examples in Java
     * Two types of method: 1. built-in 2. User-defined
     * we are going to learn User-defined method in today's lab
     * User-defined method: methods that are defined by user i.e programmer
     * developer in the customized requirement inside the class
     * we can define method in different ways. Such as:
     * 1. with return type and without parameter
     * 2. without return type and without parameter
     * 3. with return type and with parameter
     * 4. without return type and with parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
     * 
     * a. return type: it holds the data type of the method
     * that means which type of data it is going to return
     * example: int, double, boolean, string[
     * b. without return type: it is defined as type 'void'
     * c. parameters:L variable/value defined inside method's parenthesis
     * while defining the method
     * d. argument: variable/value passed inside method's parenthesis
     * while invoking/calling the method
     * 
     * syntax of method:
     * access-specifier datatype(return type) method_name(){}
     * eg: public int doSum(){}
     */
    // 1. method with return type and without parameter
    /**
     * this method returns the area if circle
     * @return double
     */
    public double calculateArea(){
        double pi = 3.14258;
        double radius = 26.00;
        double area = pi * radius * radius; // area of circle
        return area;
    }
    public boolean getUserStatus(){
        boolean status = fasle;
        String username = "DAV";
        if(username == "DAV"){
            status = true;
        } else {
            status = false;
        }
        return status;
        }
    
    //Lab task: create a method with type 'int' which so sum of two
//whole number
    public int sumOfTwoWholeNumber(){
        int num_one = 120;
        int num_two = 358;
        int sum = num_one + num_two;
    return sum;
    }
// 2. without return type and without parameter
// here method will be type: 'void'
    public void displayQuote(){
        String quote = "Happy Day brings Happy Moment!";
        System.out.println("Quote: " + quote);
    }
    
    public void showPerimeter(){
        double pi = 3.1428;
        double radius = 15.00;
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of Circle: * + perimeter");
    }
    /**
     * Lab task 2: check a method with type 'void', and it should
     * display the details of student: full_name, email, gender, address
     * 
     * Lab task 3:create a method with type 'void' , and it should
     * display the calculation of vat & discount amount of a product
     * which has a marked price of Rs. 50,000.00, discount 10% & Vat 13%                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    


}



