package yomari;

public class Question {
    public static void main(String[] args) {
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