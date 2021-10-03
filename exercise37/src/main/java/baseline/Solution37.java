package baseline;

import java.util.Scanner;

public class Solution37 {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Solution37 sol = new Solution37();
        //prompt and get numbers from getInt method
        //get minimum length
        int minLen = sol.getInt("");
        //get number of special char
        int numSpecialChar = sol.getInt("");
        //get number of digits
        int numDigit = sol.getInt("");

        //allocate PasswordGenerator class
        PasswordGenerator password = new PasswordGenerator(0,0,0);
        //call method to create password
        String generatedPassword = password.makePassword();

        //display output
        System.out.println();
    }

    private int getInt(String prompt) {
        //make loop for integer validation
        //  prompt user fot the input
        //  read in put as a string and convert to integer
        //      if no exception occurs, meaning integer has been entered
        //  if the integer is greater than 0, to return it
        //  if integer is 0 or negative, throw the exception
        //  if exception/error occurs, prompt user to re-enter integer
        //  keep asking till integer is entered
        return 0;
    }
}
