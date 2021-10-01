/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution31 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate Solution31 class
        Solution31 sol = new Solution31();

        //get validated integer from user
        int restingHR = sol.getValidatedInt("heart rate");
        int age = sol.getValidatedInt("age");


        //allocate KarvonenHeartRate class
        KarvonenHeartRate KHR = new KarvonenHeartRate(age,restingHR);

        //display output through KarvonenHeartRate class
        KHR.displayTable();

    }

    private int getValidatedInt(String key) {
        //begin loop
        while (true) {
            //display prompt
            //read input
            //if input is non-numerical value
            //or if input is not positive number
            //      display "input cannot be negative number
            System.out.print("What is your "+key+"?: ");
            try {
                int result = Integer.parseInt(input.nextLine());
                if (result<=0)
                    throw new IllegalArgumentException();
                return result;
            } catch (NumberFormatException nfe){
                System.out.println("Please enter a numerical integer!!");
            } catch (IllegalArgumentException e){
                System.out.println(key+ " needs to be a positive integer!!");
            }
        }
    }
}
