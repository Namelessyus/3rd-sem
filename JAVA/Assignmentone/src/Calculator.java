/**
 * Question 2: Create a class named Calculator. Define three overloaded methods named add():   
add(int a, int b)   
add(double a, double b)
add(int a, int b, int c)
In the main() method, create an object of the Calculator class and call each overloaded method with appropriate
arguments.
 */

public class Calculator {
    
    int add(int a, int b){
        return a + b;
    }
    
    double add(double a, double b){
        return a + b;
    }
    
    int add(int a, int b, int c){
        return a + b + c;
    }
         public static void main(String args[]) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 int: " + calc.add(5, 10));             
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));       
        System.out.println("Sum of 3 int: " + calc.add(5, 10, 15));      
   
    }
}
