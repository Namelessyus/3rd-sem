package controller;
import java.util.Map;
import java.util.HashMap;
import model.Employee;
/**
 *
 * @author user
 */
public class EmployeeController {
    public boolean addEmployee(HashMap <String,String> data){
        boolean status = false;
        Employee e = new Employee();
        e.setName(data.get("name"));
        e.setEmail(data.get("email"));
        e.setDesignation(data.get("designation"));
        if(e.createEmployee(e)){
            status = true;
        }
        return status;
    }
}
