/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Praween Pongpat
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution34 sol = new Solution34();

        //make an array of string to contain all the names of employee: hard code these
        ArrayList<String> employeeName = new ArrayList<>();
        //John Smith, Jackie Jackson, Chris Jones, Amanda Cullen ,Jeremy Goodwin
        String employeeName0 = "John Smith";
        employeeName.add(employeeName0);
        String employeeName1 = "Jackie Jackson";
        employeeName.add(employeeName1);
        String employeeName2 = "Chris Jones";
        employeeName.add(employeeName2);
        String employeeName3 = "Amanda Cullen";
        employeeName.add(employeeName3);
        String employeeName4 = "Jeremy Goodwin";
        employeeName.add(employeeName4);

        //prompt user show how many name there is
        System.out.println("There are "+employeeName.size()+" employees:");

        //prompt user all names in array, each iteration, display the name
        for (int i = 0; i < employeeName.size(); i++) {
            System.out.println(employeeName.get(i));
        }

        //call getName to get the string from user
        String firedEmployee = sol.getName();

        //call isEmployee
        int indexEmp = sol.isEmployee(employeeName, employeeName.size(), firedEmployee);

        //if the name given is a worker, means index is 0-4
        if(indexEmp<0){
            for (int i = 0; i < employeeName.size(); i++) {
                System.out.println(employeeName.get(i));
            }
            return;
        }

        //display the names according to the numEmployee
        employeeName.remove(indexEmp);
        System.out.println("\nThere are "+employeeName.size()+" employees:");
        for (int i = 0; i < employeeName.size(); i++) {
            System.out.println(employeeName.get(i));
        }
    }

    public int isEmployee(ArrayList employeeName, int numEmployee, String firedEmployee) {
        //go through the array
        for (int i = 0; i < numEmployee; i++) {
            //each iteration search for the name of firedEmployee
            if (employeeName.get(i).equals(firedEmployee))
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
