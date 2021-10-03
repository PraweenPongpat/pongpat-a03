/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate Solution38
        Solution38 sol = new Solution38();

        //get string from user using getSting method
        String userInputString = sol.getString();

        //split the original string with using <space> as a separator
        String[] originalNoSpace = sol.whiteSpaceScreener(userInputString);

        //convert each element in the originalNoSpace into integer
        int[] originalOddAndEven = sol.stringArrToIntArrConv(originalNoSpace);

        //filtering process, leave only even numbers
        int[] filteredArr = sol.filterEvenNumbers(originalOddAndEven);

        //display the numbers in the filtered array
        System.out.println();
    }

    public int[] filterEvenNumbers(int[] originalOddAndEven) {
        int[] result;   //declare an int[] with same as original size
        //make a loop going through the array, each iteration...
        //  if number is even (X mod 2 == 0), store it into new array
        //      increment the index of result array
        //  if number is odd (X mod 2 == 1), do nothing about it

        //return the result array
        return result;
    }

    private String[] whiteSpaceScreener(String userInputString) {
        //convert a  string into char arrays
        //this should also separate if numbers has more than 2 digits: 12 --> '1','2'
        char[] charArray = userInputString.toCharArray();

        //crate a string for storing result with no space
        ArrayList<String> stringArrList = new ArrayList<>();
        String tempString;

        //make a loop go through the size of the charArray
        //  init tempString to null
        //  each iteration, check if that index is a digit
        //  if so, append the number into the tempString
        //  if not, store tempString as an element of arrayList

        //convert the arrayList into a string
        String[] noSpace = arrayListToStringConv(stringArrList);
        //return the string, i.e. {"2","4","5","10","12","13"}
        return noSpace;
    }

    private int[] stringArrToIntArrConv(String[] originalNoSpace) {
        //make an integer array size of string[]
        //make a loop go through the size
        //each iteration, convert the element to integer using parseInt
        //  store that into each element of int[]
        //return that int[]
    }

    private String[] arrayListToStringConv(ArrayList<String> stringArrList) {
        //create a String[] with size of arrayList
        String[] noSpace;
        //make a loop go through the size of arrayList
        //  each iteration, store element in arrayList to string[]
        //return that string
        return noSpace;
    }


    private String getString(){
        //display prompt for a set of numbers separate by space
        //read string from user
        //return that string
        return "";
    }
}
