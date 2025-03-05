/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Learn;

/**
 *
 * @author anush
 */


public class NewClass {
    public String name;
    public String department;
    
    protected String gender;
    protected String desigination;
    
    private String email;
    private long contact;
    public static int hi;
    int emp_no;
    
    public static String username = "DAV Nepal";
  
    public void setEmail(String param_email){
    this.email = param_email;
    
}
public String getEmail(){
return this.email;
}
public void setContact(long param_contact){
this.contact = param_contact;              
}
public long getContact(){
    return this.contact;
}    
    public void showDetail(){
        System.out.println("Name: "+ this.name);
        System.out.println("Department: "+ this.department);
        System.out.println("gender: "+ this.gender);
        System.out.println("Designation: "+ this.desigination);
        System.out.println("Email: "+ this.email);
        System.out.println("contacts: "+ this.contact);
        System.out.println("employee Number: "+ this.emp_no);
    }
}