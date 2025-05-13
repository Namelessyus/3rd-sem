package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * - Lab 10: 
 * Configuring mysql-connector driver in netbeans, 
 * establishing Java Database Connection (JDBC) 
 * & executing simple CRUD Operation 
 */
public class DatabaseConnection {
    public static void main(String args[]){
        try{
            // Step 1: register the JDBC Driver
            // New Package version
            Class.forName("com.mysql.cj.jdbc.Driver");
            // In exam i.e. older version
            // Class.forName("com.mysql.jdbc.Driver");
            // Step 2: Connection object & estalish connection
            String url = "jdbc:mysql://localhost:3306/lab_ten_jdbc"; // localhost + db user
            String user = "root"; // localhost root username
            String password = ""; // user password - xampp mysql root password
            // is blank by default so we pass blank value
            Connection con = DriverManager.getConnection(url,user,password);
            
            // Step 3: Creating Statement to execute MySQL queries
            // 1. insert query
            String insert_query = "INSERT INTO users(first_name, last_name, username, email, dob, address) VALUES('Anushma','Shakya','hello2','hello.com','2005-10-18','Patan')";
            // Creating statement object
            Statement stmt = con.createStatement();
            int insert_result = stmt.executeUpdate(insert_query);
            if(insert_result>0){
                System.out.println("Data inserted successfully!");
            }
            
            String update_query = "UPDATE users SET first_name='abcd', last_name='efg' WHERE id=1 ";
            int update_result = stmt.executeUpdate(update_query);
            if(update_result > 0){
                System.out.println("Data updated successfully");
            }
            
            //3. Select Query
            String select_query = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(select_query);
            while(rs.next()){
                System.out.println("User Id: " + rs.getInt("id"));
                System.out.println("First Name: " + rs.getString("first_name"));
                System.out.println("Last Name: " + rs.getString("last_name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Date of Birth: " + rs.getString("dob"));
                System.out.println("Address: " + rs.getString("address"));
        }

            //4. Delete Query
            String delete_query = "DELETE FROM users WHERE id=2";
                    int delete_result = stmt.executeUpdate(delete_query);
                    if (delete_result > 0){
                        System.out.println("Data deleted sucessfully");
                    }
            
        } catch(SQLException | ClassNotFoundException e){
            System.out.println("Error Message: " + e.getMessage());
        }
         
    }
}