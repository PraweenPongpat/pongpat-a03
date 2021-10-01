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
        System.out.println("It will take "+ numYear + " years to double your initial investment.");
    }

    private double getValidatedDouble() {
        //begin loop to trap bad input
        while(true) {
            //prompt user for the number
            System.out.print("What is the rate of return?: ");
            //read input
            try{
                double result = Double.parseDouble(input.nextLine());
                if (result>-0.00001 && result<0.00001)
                    throw new NumberFormatException();
                return result;
            } catch (NumberFormatException nfe){
                //if input is non-numerical value
                //or if input is zero           : print "Sorry, that is not a valid input"
                System.out.println("Sorry, that is not a valid input");
            }
        }
    }

    public int calcNumYear (double value){
        //perform calculation 72/r
        //round the number up to the next integer
        //return the number
        return (int) Math.ceil(72/value);
    }


}
