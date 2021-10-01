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
        System.out.println("There are "+numEmployee+" employees:");

        //prompt user all names in array, each iteration, display the name
        for (int i = 0; i < numEmployee; i++) {
            System.out.println(employeeName[i]);
        }

        //call getName to get the string from user
        String firedEmployee = sol.getName();

        //call isEmployee
        int indexEmp = sol.isEmployee(employeeName, numEmployee, firedEmployee);

        //if the name given is a worker, means index is 0-4
        if(indexEmp>=0) {
            //access that name through the index
            employeeName[indexEmp] = "";
        }

        //display the names according to the numEmployee
        int numLeft = (indexEmp>=0)? numEmployee-1:numEmployee;
        System.out.println("\nThere are "+numLeft+" employees:");
        for (int i = 0; i < numEmployee; i++) {
            if(employeeName[i].length()!=0)
                System.out.println(employeeName[i]);
        }
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

    private String getName() {
        //prompt user for the name to be deleted
        System.out.print("\nEnter an employee name to remove: ");
        //read string from user
        //return that string
        return input.nextLine();
    }
}
