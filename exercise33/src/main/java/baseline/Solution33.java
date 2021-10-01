/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution33 {
    private static final int NUMBER_OF_ANSWERS = 4;
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution33 sol = new Solution33();

        //create array of string
        String[] answers = new String[NUMBER_OF_ANSWERS];
        //store specific string to each index (0 to 3, respectively)
        //      "Yes," "No," "Maybe," or "Ask again later."

        //prompt and read user for the question input
        sol.getAnswer();

        //call randomNumberGen to make a random number
        int answerIndex = sol.randomNumberGen();

        //access that index of the array and display the string inside
        System.out.println();
    }
    public int randomNumberGen(){
        //create random number between 0 and 3
        //using Random class
        //return that number
        return 0;
    }

    private String getAnswer(){
        //prompt user for the question
        //read string from user
        //return that string
        return "";
    }

}
