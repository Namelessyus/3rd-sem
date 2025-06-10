package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import config.DbConnection;
/**
 *
 * @author user
 */
public class Employee {
    private String name;
    private String Email;
    private String designation;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
    public String getEmail(){
        return this.Email;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public String getDesignation(){
        return this.designation;
    }
    public boolean createEmployee(Employee e){
        boolean status = false;
        try{
            Connection connect = DbConnection.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            String query = "INSERT INTO employeeinfo(Name,Email,Designation)VALUES("+"'"+e.getName()+"',"+"'"+e.getEmail()+"',"+"'"+e.getDesignation()+"')";
        if(stmt.executeUpdate(query)>0){
            status = true;
        }
        }catch(SQLException error){
            System.out.println("Error: " + error.getMessage());
        }
        
        return status;
    }
}
