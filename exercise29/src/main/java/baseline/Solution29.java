/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution29 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution29 sol = new Solution29();

        //call getDouble, to get a double from user
        double number = sol.getValidatedDouble();

        //calculate number of years to pay off by calcNumYear method
        int numYear = sol.calcNumYear(number);

        //display output
        System.out.println();
    }

    private double getValidatedDouble() {
        //prompt user for the number
        System.out.println();

        //begin loop to trap bad input
            //read input
            //if input is non-numerical value: print "Sorry, that is not a valid input" also
            //keep the loop going
            //if input is zero: print "Sorry, that is not a valid input"
            // keep the loop going
            //else, this means it is numerical non-zero number
            //get out of loop

        return 0;
    }

    public int calcNumYear (double value){
        //perform calculation 72/r
        //round the number up to the next integer
        //return the number
        return (int) Math.ceil(72/value);
    }


}
