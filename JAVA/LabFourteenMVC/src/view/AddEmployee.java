package view;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

import controller.EmployeeController;
/**
 *
 * @author user
 */
public class AddEmployee extends JFrame implements ActionListener {
    JButton btn_add;
    JButton txt_clear;
    
    JTextField Email_field = null;
    JTextField name_field = null;
    JTextField Des_field = null;
    
    public AddEmployee(){
        setTitle("Add Employee");
        setLayout(new GridLayout(4,2,20,15));
        setBounds(50,100,600,500);
        
        JLabel name_lbl = new JLabel("Employee Name: ");
        name_field = new JTextField();
        
        JLabel Email_lbl = new JLabel("Employee Email: ");
        Email_field = new JTextField();
        
        JLabel Des_lbl = new JLabel("Employee Designation: ");
        Des_field = new JTextField();
        
        add(name_lbl);
        add(name_field);
        add(Email_lbl);
        add(Email_field);
        add(Des_lbl);
        add(Des_field);
        
        btn_add = new JButton("Add Employee");
        btn_add.addActionListener(this);
        
        txt_clear = new JButton ("Clear Text");
        txt_clear.addActionListener(this);
        add(btn_add);
        add(txt_clear);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == txt_clear){
            Email_field.setText("");
            name_field.setText("");
            Des_field.setText("");
        }
        if(e.getSource()==btn_add){
            HashMap<String,String> data = new HashMap<>();
            data.put("name", name_field.getText());
            data.put("email", Email_field.getText());
            data.put("designation", Des_field.getText());
            if(data.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Enter required field");
            }else{
                EmployeeController ec = new EmployeeController();
                if(ec.addEmployee(data)){
                    JOptionPane.showMessageDialog(rootPane, "Added Sucessfully");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Fail! Try again!!!");
                }
            }
        }
    }
    public static void main(String args[]){
        new AddEmployee();
    }
}
