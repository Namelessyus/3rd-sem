package main;

public class ConditionalStatementExample {
    public static void main(String args[]){
        /** if statement
         * 1. if
         * 2. if else
         * 3. if else if
         * syntax:
         * if(condition){
         * block of code
         * }
         * note: the condition must be true in order to run
         * the code inside if block
         */
        // 1. if statement
        int num_one = 23;
        int num_two = 32;
        //here out resultis 55 so the code inside if statement 
        //will display in the condole
        if(num_one + num_two == 55){
            System.out.println("The given expression is true");
        }
        // incase if false statement will not run
        if(num_one + num_two == 50){
            System.out.println("The given expression is false");
    }
        
        // 2. if else
        // if the condition inside if statement is false
        // then code inside 'else' block will run
        // case one: condition true
        // here code inside if statement will run
        String college_name = "DAV";
        if(college_name == "DAV"){
            System.out.println("The college name is correct");
        } else {
            System.out.println("The college name is incorrect");
        }
        // case two: condition fasle
        // here doee inside else statement will run
        int reg_no = 15;
        if(reg_no > 16) {
            System.out.println("The given number is greater");
        } else {
            System.out.println("The given number is smaller");
        }
        
        // 3. if else if
        // to check condititons multiple times with different output
        int given_number = 23;
        if(given_number >= 0 && given_number <= 9.99){
            System.out.println("The given number is between 0-10");
        }else if(given_number >= 10 && given_number <=19.99){
            System.out.println("The given number is between 10-20");
        }else if(given_number >= 20 && given_number <=29.99){
            System.out.println("The given number is between 20-30");
        }else{
            System.out.println("The given number is between 30");
        }
        
        //4. nested if statement
        // is used when the conditons need to check inside if
        // statement that means we can use if ststement inside
        // if statement
        int pin_code = 1234;
        int acc_no = 450012;
        
        String acc_type = "savings";
        boolean status = true;
        /**
         * Note: no need to compare boolean value in case of if statement
         * simply we can pass the variable that carry boolean data in if statement
         * eg: boolean attendance = true;
         * here we can do:
         * if(attendance){}
         * this same concept works with boolean false value
         * therefore in the below example
         * status is true since it is a boolean type
         * so if(status == true) is equivalent to if(status)
         */ 
        
         // check each cases to get different nested if else statement output
         // case one: change acc_no = 450013
         // case two: change status to false
         // case three: acc_type = "current"
         // case four: pin_code = 5488;
         
        if (status && acc_no == 450012){
             System.out.println("Checking Account type and pincode");
             if (pin_code == 1234){
                 if(acc_type == "savings") {
                     System.out.println("Welcome to DAV bank");
                 } else {
                     System.out.println("Invalid account type");
                 }
                } else {
                        System.out.println("Invalid pincode or account invlaid!!");
             }
                        } else {
                        System.out.println("The account number: " + acc_no + " is not active at the moment");
                 }
             }
        }