/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution26 {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate class solution, to use .getDouble
        Solution26 sol = new Solution26();

        //get APR, using getDouble, convert it to dailyAPR by div with 365.00
        Double dailyAPR = (sol.getDouble("")/365.00);
        //get balance, using getDouble
        Double balance = sol.getDouble("");
        //get monthly payment, using getDouble
        Double monthlyPayment = sol.getDouble("");

        //allocate class APRCalculator
        //init with values above
        PaymentCalculator paymentCalculator = new PaymentCalculator(0,0,0);

        //use PaymentCalculator class to get the result
        int numMonthLeft = paymentCalculator.calculateMonthsUntilPadOff();

        //display outputs
        System.out.println();
    }

    private double getDouble (String prompt){
        //display prompt for value
        //read a double
        //make sure to get a non-negative numeric value
        //      using try-catches with exceptions
        //use loop, until the user enter number
        //return that number
        return 0.00;
    }
}
