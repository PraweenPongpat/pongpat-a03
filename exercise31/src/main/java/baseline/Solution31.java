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
        int age = sol.getValidatedInt("","age");
        int restingHR = sol.getValidatedInt("","heart rate");


        //allocate KarvonenHeartRate class
        KarvonenHeartRate KHR = new KarvonenHeartRate(0,0);

        //display output through KarvonenHeartRate class
        KHR.displayTable();

    }

    private int getValidatedInt(String prompt,String key) {
        //begin loop
        //display prompt
        //read input
        //if input is non-numerical value
        //or if input is not positive number
        //      display "input cannot be negative number
        return 0;
    }
}
