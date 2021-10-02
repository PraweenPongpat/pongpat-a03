/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
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
        while (!(number > -999.9991 && number < -999.9989)) {
            //add number to a list, using .add
            numArrayList.add(number);
            //ask user for the next input
            number = sol.getDouble();
        }
        //find min in the list using method min, passing in the list
        double minData = sol.min(numArrayList);
        //find max in the list, using method max, passing in the list
        double maxData = sol.max(numArrayList);
        //find avg in the list, using method average, passing in the list
        double avgData = sol.average(numArrayList);
        //find standard deviation of the list using std method
        double stdVal = sol.std(numArrayList);

        //display output
        System.out.printf("The average is %.2f%nThe minimum is %.2f%n",avgData,minData);
        System.out.printf("The maximum is %.2f%nThe standard deviation is %.2f%n", maxData, stdVal);

    }
    public double min(List<Double> numArrayList){
        double minVal = numArrayList.get(0);
        //loop to go through the list
        for(int i = 1; i<numArrayList.size(); i++) {
            //each iteration, compare the current index with next index
            //if minVal is bigger the next index, update minVal to it
            if(minVal > numArrayList.get(i))
                minVal=numArrayList.get(i);
            //otherwise, pass continue the loop
        }
        return minVal;
    }

    public double max(List<Double> numArrayList){
        double maxVal = numArrayList.get(0);
        //loop to go through the list
        for(int i = 1; i<numArrayList.size(); i++) {
            //each iteration, compare the current index with next index
            //if maxVal is less the next index, update maxVal to it
            if (maxVal < numArrayList.get(i))
                maxVal = numArrayList.get(i);
            //otherwise, pass continue the loop
        }
        return maxVal;
    }
    public double average(List<Double> numArrayList){
        double sum=0.00;
        //loop to go through the list
        for (Double aDouble : numArrayList) {
            //each iteration, keep summing the value
            sum += aDouble;
        }
        //if size of array is 0, meaning the array is empty
        if(numArrayList.isEmpty())
            return 0;
        //otherwise, return sum/size to get average
        return sum/numArrayList.size();
    }
    public double std(List<Double> numArrayList){
        //use average method to find the average value
        double avg = average(numArrayList);

        double std=0;
        //loop through the array
        for (Double aDouble : numArrayList) {
            //each iteration, compute (value-mean)^2, keep summing
            std += Math.pow(aDouble - avg, 2);
        }
        //compute the square root of the sum
        return Math.sqrt(std/numArrayList.size());
    }

    private double getDouble() {
        while (true) {
            //prompt user to et a number
            System.out.print("Please enter a number: ");
            String userInput;
            //read double from user
            //if user entered a number, return that number
            //if user entered 'done', return -999.9999 as a flag that 'done' appears
            try{
                userInput = input.nextLine();
                if(userInput.equals("done"))
                    return -999.999;
                return Double.parseDouble(userInput);
            } catch (NumberFormatException nfe){
                //if user entered something else, ask again
                System.out.println("enter a number, or <done> to end");
            }
        }
    }
}
