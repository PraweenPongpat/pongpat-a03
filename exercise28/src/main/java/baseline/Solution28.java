/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution28 {
    public static final int NUMBERS = 5;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate Solution28
        Solution28 sol = new Solution28();

        //make am array to store numbers
        double[] numArr = new double[NUMBERS];

        //make a counted loop
        for(int i = 0; i< NUMBERS; i++){
            //each iteration, get a numerical input
            numArr[i] = sol.getDouble();
        }

        //find sum
        double sum = sol.calcTotal(numArr);

        //display output
        System.out.printf("The total is %.2f%n",sum);
    }

    public double calcTotal(double[] numArr) {
        double sum=0.0;
        //counted loop go through array
        for(int i = 0; i<numArr.length; i++){
            //each iteration, find the sum
            sum += numArr[i];
        }
        //return the sum
        return sum;
    }

    private double getDouble() {
        //prompt user for number
        //read input
        //validate input must be numerical, do not let go further till numerical is entered
        //return that number
        while (true){
            System.out.print("Please enter a number: ");
            try{
                return Double.parseDouble(input.nextLine());
            } catch (NumberFormatException nfe){
                System.out.println("You need to enter a number, a NUMERICAL NUMBER!");
            }
        }
    }

}
