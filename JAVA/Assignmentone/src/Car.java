/**
Question 1:  Create a class named Car with the following attributes: brand, model, and year. Add a method displayDetails() to print the
car's information. In the main() method, create an object of the Car class, assign values to its attributes, and call displayDetails().
 */
public class Car {
    String brand;
    String model;
    int year;
 
    void displayDetails(){
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
    }
    public static void main(String args[]){
        Car theCar = new Car();
        theCar.brand = "prajwal";
        theCar.model = "boi";
        theCar.year = 2005;
        
        theCar.displayDetails();
    }
}

