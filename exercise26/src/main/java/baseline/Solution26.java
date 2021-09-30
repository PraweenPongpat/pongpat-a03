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

        //get balance, using getDouble
        double balance = sol.getDouble("What is your balance?: ");
        //get APR, using getDouble, convert it to dailyAPR by div with 365.00
        double dailyAPR = (sol.getDouble("What is the APR on the card (as a percent)?: ")/(365.00*100.00));
        //get monthly payment, using getDouble
        double monthlyPayment = sol.getDouble("What is the monthly payment you can make?: ");

        //allocate class APRCalculator
        //init with values above by class's constructor
        PaymentCalculator paymentCalculator = new PaymentCalculator(dailyAPR,balance,monthlyPayment);

        //use PaymentCalculator class to get the result
        int numMonthLeft = paymentCalculator.calculateMonthsUntilPadOff();

        //display outputs
        System.out.println("It will take you "+numMonthLeft+" months to pay off this card.");
    }

    private double getDouble (String prompt){
        //display prompt for value
        //read a double, make sure to get a non-negative numeric value
        //      using try-catches with exceptions
        //use loop, until the user enter number
        double number;
        while(true){
            System.out.print(prompt);
            try{
                number = Double.parseDouble(input.nextLine());
                if(number<0.00) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (NumberFormatException nfe){
                System.out.println("Please re-enter a numerical value!");
            } catch (IllegalArgumentException e){
                System.out.println("Please re-enter a non-negative number!");
            }
        }
        //return that number
        return number;
    }
}
