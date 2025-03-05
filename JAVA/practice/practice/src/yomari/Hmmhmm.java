package yomari;

public class Hmmhmm {
    public int age;
    public int salary;
    public int year;
    public static void main (String args[]){
        Hmmhmm hi = new Hmmhmm();
        hi.age=10;
        hi.salary=100;
        hi.year=2005;
        System.out.println("Your age is");
        System.out.println(hi.age);
        System.out.print("Your salary is ");
        System.out.println( hi.salary);
        System.out.println("Your year is "+hi.year);
        
        Hmmhmm hiTwo = new Hmmhmm();
        hiTwo.age=5;
        System.out.println("Your age is "+hiTwo.age);
        
        System.out.println("Hi! Your birth year is " + hi.year + " congratulations");
    }
}
