/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate Solution35
        Solution35 sol = new Solution35();

        //declare arrayList
        ArrayList<String> nameArrayList = new ArrayList<String>();

        //get the first name using getName method
        String nameInputFromUser = sol.getName();
        //make loop, as long as input is not null, keep going
        while() {
            //Store name append to list using .add
            //call getName methode again, asking the next name
        }
        //call randomNumberGen on this, passing size of list for upper bound
        int winnerIndex;

        //display output, accessing the name of the list through winnerIndex
        System.out.println();
    }

    private String getName() {
        //display prompt to user for name
        //read string from user
        //return that string
        return "";
    }
    public int randomNumberGen(int upperBound){
        //generate random number using Random class
        //return the number generated
        return 0;
    }
}
