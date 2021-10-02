/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //allocate Solution36
        Solution36 sol = new Solution36();

        //create an arrayList
        ArrayList<Double> numArrayList = new ArrayList<>();

        //call getDouble to get the first double
        double number = sol.getDouble();

        //start loop, as long as 'done' has yet entered, keep going
        //keyword 'done' uses a flag value of -999.9999
            //add number to a list, using .add
            //ask user for the next input

        //find min in the list using method min, passing in the list
        double minData;
        //find max in the list, using method max, passing in the list
        double maxData;
        //find avg in the list, using method average, passing in the list
        double avgData;
        //find standard deviation of the list using std method
        double stdVal;

        //display output
        System.out.println();

    }
    public double min(ArrayList<Double> numArrayList){
        double minVal=0;
        //loop to go through the list
            //each iteration, compare the current index with next index
            //if minVal is bigger the next index, update minVal to it
            //otherwise, pass continue the loop

        return minVal;
    }

    public double max(ArrayList<Double> numArrayList){
        double maxVal=0;
        //loop to go through the list
            //each iteration, compare the current index with next index
            //if maxVal is less the next index, update maxVal to it
            //otherwise, pass continue the loop

        return maxVal;
    }
    public double average(ArrayList<Double> numArrayList){
        double sum=0;
        //loop to go through the list
            //each iteration, keep summing the value
        if(true){
            //if size of array is 0, meaning the array is empty
            //return 0
        }
        //otherwise, return sum/size to get average
        return sum/numArrayList.size();
    }
    public double std(ArrayList<Double> numArrayList){
        //use average method to find the average value
        double avg = average(numArrayList);

        double std=0;
        //loop through the array
            //each iteration, compute (value-mean)^2, keep summing
        //compute the square root of the sum
        return std;
    }

    private double getDouble() {
        //prompt user to et a number
        //read double from user
        //if user entered a number, return that number
        //if user entered 'done', return -999.9999 as a flag that 'done' appears
        //if user entered something else, ask again
        return 0;
    }
}
