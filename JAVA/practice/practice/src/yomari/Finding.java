package yomari;

//make a program to find if a number is more than 10
public class Finding {

    public static void main(String args[]) {
        /**
         * if (condition) {
         * print condition 
         * } else {
         * print condition 
         * }
         */
        int a = 10;
        if (a > 10) {
            System.out.println("Number is more than 10");
        }
        if (a == 10) {
            System.out.println("Number is 10");
        }

//if a number is negative or positive or zero using if else if statetment
        /**
         * if (condition1) {
         * print condition 
         * } else if (condition2) {
         * print condition 
         * } else {
         * print conditions 
         * }
         */
        int b = -10;
        if (b > 0) {
            System.out.println("The number is positive");
        } else if (b < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
        
//find greatest number amongst 3 variables then output it
        int x = 10, y = 20, z = 30;

        if (x > y && x > z) {
            System.out.println("x is the greatest");
        } else if (y > x && y > z) {
            System.out.println("y is the greatest");
        } else {
            System.out.println("z is the greatest");
        }
    }
}
