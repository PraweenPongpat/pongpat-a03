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
        System.out.print("the list is:");
        for (int j : filteredArr) {
            System.out.print(" " + j);
        }
    }

    public int[] filterEvenNumbers(int[] originalOddAndEven) {
        //create an arrayList to keep appending dynamically
        ArrayList<Integer> resultArrList = new ArrayList<>();

        //make a loop going through the array, each iteration...
        for (int j : originalOddAndEven) {
            //  if number is even (X mod 2 == 0)
            if ((j % 2) == 0) {
                //  store it into new array and increment the index of result array
                resultArrList.add(j);
            }
            //  if number is odd (X mod 2 == 1), do nothing about it
        }

        //transfer the data in the list to int[]
        int[] result = new int[resultArrList.size()];
        for(int i=0; i<result.length;i++){
            result[i] = resultArrList.get(i);
        }
        //return the result array
        return result;
    }

    private String[] whiteSpaceScreener(String userInputString) {
        //convert a  string into char arrays
        //this should also separate if numbers has more than 2 digits: 12 --> '1','2'
        char[] charArray = userInputString.toCharArray();

        //crate a string for storing result with no space
        ArrayList<String> stringArrList = new ArrayList<>();
        StringBuilder tempString= new StringBuilder();

        //make a loop go through the size of the charArray
        for (char c : charArray) {
            //  init tempString to null
            //  each iteration, check if that index is a digit
            //  if so, appended the number into the tempString
            //  if not, store tempString as an element of arrayList
            if (Character.isDigit(c)) {
                tempString.append(c);
            } else if (c == ' ' || c == '\n') {
                stringArrList.add(tempString.toString());
                tempString = new StringBuilder();
            }
        }
        //add the last tempString to arrayList
        stringArrList.add(tempString.toString());

        //convert the arrayList into a string and return it
        return arrayListToStringConv(stringArrList);
    }

    private int[] stringArrToIntArrConv(String[] originalNoSpace) {
        //make an integer array size of string[]
        int[] intArr = new int[originalNoSpace.length];
        //make a loop go through the size
        for(int i=0; i<originalNoSpace.length; i++) {
            //each iteration, convert the element to integer using parseInt
            //  store that into each element of int[]
            intArr[i] = Integer.parseInt(originalNoSpace[i]);
        }
        //return that int[]
        return intArr;
    }

    private String[] arrayListToStringConv(ArrayList<String> stringArrList) {
        //create a String[] with size of arrayList
        String[] noSpace = new String[stringArrList.size()];
        //make a loop go through the size of arrayList
        for(int i=0; i<stringArrList.size();i++) {
            //  each iteration, store element in arrayList to string[]
            noSpace[i] = stringArrList.get(i);
        }
        //return that string
        return noSpace;
    }

    private String getString(){
        //display prompt for a set of numbers separate by space
        System.out.print("Please enter a list of numbers separate by space: ");
        //read string from user
        //return that string
        return input.nextLine();
    }
}
