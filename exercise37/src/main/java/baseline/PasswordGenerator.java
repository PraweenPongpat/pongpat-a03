package baseline;

import java.util.ArrayList;
import java.util.List;

public class PasswordGenerator {
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
        //create three numbers based on the variables needed
        //to track as index creating random sp char from array
        int randSpCharIndex;     //  !#$%&'()*+,-/?@[]^_`{|}~
        //to track as index creating random alphabet a-z and A-Z
        int randAlphabetIndex;
        //to track as index creating random numbers 0-9
        int randDigitIndex;

        //create set of characters to randomly generate
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l'
                            ,'m','n','o','p','q','r','s','t','u','v','w','x','y','z'
                            ,'A','B','C','D','E','F','G','H','I','J','K','M','N'
                            ,'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] specialChar = "!#$%&'()*+,-/?@[]^_`{|}~".toCharArray();
        char[] digit = "0123456789".toCharArray();
        String result="";

        //allocate the list used to access to make a password
        List<char[]> list = new ArrayList<char[]>();
        //add all three char[] above to the list


        //make a loop to keep going as long as number of letters is still less than either digit or specialChar
        //  each iteration, create random number between 0-2 to access either alphabet, specialChar, or digit respectively
        //      keep track of the number accesses of each mode
        //  access the list number generate the random number again within 0-sizeOfChar[]
        //      get the info of that char, append it String result
        //  if any of number of access mode reaches the times of condition, ensure not to over access it
        //keep the loop going till condition is met

        //since result as been appending in the loop, return it
        return result;
    }
}
