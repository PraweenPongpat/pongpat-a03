package baseline;

import java.util.*;

public class PasswordGenerator {
    Random rand = new Random();

    //declare the variables needed
    private int minLen;
    private int numSpChar;
    private int numDigit;

    //constructor
    public PasswordGenerator(int minLen, int numSpChar, int numDigit) {
        this.minLen = minLen;
        this.numSpChar = numSpChar;
        this.numDigit = numDigit;
    }

    //getters to access the value
    public int getMinLen(){
        return minLen;
    }
    public int getNumSpChar(){
        return numSpChar;
    }
    public int getNumDigit(){
        return numDigit;
    }

    public String makePassword() {
        //create set of characters to randomly generate
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l'
                            ,'m','n','o','p','q','r','s','t','u','v','w','x','y','z'
                            ,'A','B','C','D','E','F','G','H','I','J','K','M','N'
                            ,'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] specialChar = "!#$%&()*+-/?@[]^_~".toCharArray();
        char[] digit = "0123456789".toCharArray();

        //allocate the list used to access to store a password
        ArrayList<Character> arrayList = new ArrayList<>();

        //take one type of characters at a time to ensure the amount store inside
        //loop to generate random special characters
        //      each iteration, create random number 0-to-sizeOfSpCharArray, access char[] with that index
        //      add to list
        //loop to generate random digits, same idea as above
        //loop to generate random alphabets, same idea as above

        //this point, we should have a list of array with correct size that met the constraint
        //randomly re-arrange them to make at least a strong password


        //since result as been appending in the loop, return it
        return "";
    }

    public int randomNumberGenerator(int upperBound){
        //create a random number from the given upper bound
        //using Random class
        return 0;
    }
}
