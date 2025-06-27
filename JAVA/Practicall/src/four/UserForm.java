import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("User Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        JButton submitButton = new JButton("Submit");

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(new JLabel()); // Empty cell
        frame.add(submitButton);

        // Button action listener
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText().trim();
                    String ageText = ageField.getText().trim();
                    String address = addressField.getText().trim();

                    if (name.isEmpty() || ageText.isEmpty() || address.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "All fields must be filled out.", "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    int age = Integer.parseInt(ageText);
                    if (age < 0) {
                        throw new IllegalArgumentException("Age cannot be negative.");
                    }

                    String message = "User Details:\n"
                                   + "Name: " + name + "\n"
                                   + "Age: " + age + "\n"
                                   + "Address: " + address;

                    JOptionPane.showMessageDialog(frame, message, "User Info", JOptionPane.INFORMATION_MESSAGE);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Age must be a valid number.", "Format Error", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Invalid Age", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}



