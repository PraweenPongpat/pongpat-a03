/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution27 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate Solution27, to use getString
        Solution27 sol = new Solution27();

        //get strings as needed, passing in proper prompt
        String firstName = sol.getString("Enter the first name: ");
        String lastName = sol.getString("Enter the last name: ");
        String zipCode = sol.getString("Enter the ZIP code: ");
        String employeeID = sol.getString("Enter the employee ID:");

        //allocate inputValidator class to use other functions as needed
        InputValidator validator = new InputValidator();

        //call inputValidator class's toString that utilizes other methods
        String result = validator.validateInput(firstName,lastName,zipCode,employeeID);

        //display output
        System.out.println(result);
    }

    private String getString(String prompt) {
        //display prompt
        System.out.print(prompt);
        //read string
        //return that string
        return input.nextLine();
    }
}
