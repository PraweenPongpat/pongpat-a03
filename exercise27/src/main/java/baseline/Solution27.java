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
        String firstName = sol.getString("");
        String lastName = sol.getString("");
        String zipCode = sol.getString("");
        String employeeID = sol.getString("");

        //allocate inputValidator class to use other functions as needed
        InputValidator validator = new InputValidator("","","","");

        //call inputValidator class's toString that utilizes other methods
        String result = validator.validateInput("","","","");

        //display output
        System.out.println(result);
    }

    private String getString(String prompt) {
        //display prompt
        //read string
        //return that string
        return "";
    }
}
