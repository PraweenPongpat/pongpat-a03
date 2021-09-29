/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution25 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution25 sol = new Solution25();

        //prompt user for an input 'password', from user
        String password = sol.getPassword();

        //allocate passwordStrengthIndicator class
        Password pass = new Password("password");

        //calls passwordStrengthIndicator class on 'password'
        int strength = pass.passwordValidator(password);

        //pick the strength word from keywordFinder
        String keyword = sol.keywordFinder(strength);

        //display output
        System.out.println("The password '" + password + "' is a " + keyword + " password!!");

    }

    private String keywordFinder(int value){
        //for the 'value'...
        return switch (value) {
            //if 1 , return very week
            case 1 -> "very week";
            //if 2 , return week
            case 2 -> "week";
            //if 3 , return strong
            case 3 -> "strong";
            //if 4 , return very strong
            case 4 -> "very strong";
            //otherwise, unknown
            default -> "unknown";
        };
    }

    private String getPassword(){
        //prompt user for a password
        System.out.println("Please enter a password, I will tell you the strength of it.");
        //read string
        //return that string
        return input.nextLine();
    }
}
