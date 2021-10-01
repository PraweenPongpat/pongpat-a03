/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

public class Solution30 {
    private static final int NUM_COL = 12;
    private static final int NUM_ROW = 12;

    public static void main(String[] args) {
        Solution30 sol = new Solution30();

        System.out.println("Here is basic multiplication table:");


        //outer loop, running from 1 to NUM_COL, inclusive
        for(int i = 1; i<=NUM_COL; i++){
            //inner loop, running from 1 to NUM_ROW, inclusive
            for(int j = 1; j<=NUM_ROW; j++){
                //display the result using mulABWithTab method
                System.out.print(sol.mulABWithTab(i,j));
            }
            //enter newline
            System.out.println("");
        }
    }

    public String mulABWithTab(int i,int j){
        //make string that shows result i*j
        //without tab space to the end of it
        //return that string
        return String.format("%5d",i*j);
    }

}
