
/**
 * Question 3: Create a class named Animal with a method makeSound() 
 * that prints "Animal makes a sound". Create a subclass Dog that extends 
 * Animal and overrides makeSound() to print "Dog barks". In the main() method, 
 * create objects of both classes and call the makeSound() method to observe the behavior.
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound(); 
    }
}

