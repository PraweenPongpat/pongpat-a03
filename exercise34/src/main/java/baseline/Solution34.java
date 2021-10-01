/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.Scanner;

public class Solution34 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution34 sol = new Solution34();

        int numEmployee = 5;

        //make an array of string to contain all the names of employee: hard code these
        String[] employeeName = new String[numEmployee];
        //John Smith, Jackie Jackson, Chris Jones, Amanda Cullen ,Jeremy Goodwin
        employeeName[0] = "John Smith";
        employeeName[1] = "Jackie Jackson";
        employeeName[2] = "Chris Jones";
        employeeName[3] = "Amanda Cullen";
        employeeName[4] = "Jeremy Goodwin";

        //prompt user show how many name there is
        System.out.println();

        //prompt user all names in array
        for (int i = 0; i < numEmployee; i++) {
            //each iteration, display the name
            System.out.println();
        }

        //call getName to get the string from user
        String firedEmployee = sol.getName();

        //call isEmployee
        int indexEmp = sol.isEmployee(employeeName, numEmployee, firedEmployee);

        //if the name given is a worker, means index is 0-4
        //call delProcessArray passing in the array name, name input, number of employee
        employeeName = sol.delProcessArray(employeeName, indexEmp, numEmployee);
        //this should delete the name inside the array
        //decrement numEmployee by 1

        //if the name given is not a worker, means index is negative
        //display the origin array, don't do anything
    }

    public int isEmployee(String[] employeeName, int numEmployee, String firedEmployee) {
        //go through the array
        for (int i = 0; i < numEmployee; i++) {
            //each iteration search for the name of firedEmployee
            if (employeeName[i].equals(firedEmployee))
                return i;   //if the name is found, return that index

        }
        //if the name is not found, return -1
        return -1;
    }

    private String[] delProcessArray(String[] employeeName, int indexEmp, int numEmployee) {
        //access the name through that indexEmp and change it to null
        employeeName[indexEmp] = "";
        //make a loop go through names after the indexEmp
        String temp;
        int i;
        for (i = indexEmp; i < numEmployee; i++){
            //  swap the names up by 1 index
            employeeName[i] = employeeName[i+1];
            //  repeat the swapping till the end of array
        }
        //set the last name to null
        employeeName[i] = "";

        //return the array
        return employeeName;
    }

    private String getName() {
        //prompt user for the name to be deleted
        //read string from user
        //return that string
        return"";
    }


}
