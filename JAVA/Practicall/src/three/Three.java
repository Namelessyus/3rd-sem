/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical;
import java.io.*;
/**
 *
 * @author Admin
 */
public class Practical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("order.txt");
            FileOutputStream output = new FileOutputStream("order_copied.txt");

            int data;
            while ((data = input.read()) != -1) {
                // Print each character to the console
                System.out.print((char) data);

                // Write each character to the new file
                output.write(data);
            }

            input.close();
            output.close();

            System.out.println("\nOrders copied to order_copied.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}