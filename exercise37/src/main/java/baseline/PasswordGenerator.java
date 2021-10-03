package baseline;

import java.util.*;

public class PasswordGenerator {
    Random rand = new Random();

    //declare the variables needed
    private final int minLen;
    private final int numSpChar;
    private final int numDigit;

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
        for(int i=0; i<getNumSpChar();i++){
            arrayList.add(specialChar[rand.nextInt(specialChar.length)]);
        }
        //loop to generate random digits, same idea as above
        for(int i=0; i<getNumDigit();i++){
            arrayList.add(digit[rand.nextInt(digit.length)]);
        }
        //loop to generate random alphabets, same idea as above, but with over-random size up to 5
        for(int i=0; i<((getNumDigit()+getNumSpChar())*2+rand.nextInt(5));i++){
            arrayList.add(alphabet[rand.nextInt(alphabet.length)]);
        }
        //added loop just in case the letter type constraint is met before the length is met
        //add random letters to fill it
        while(arrayList.size()<getMinLen()){
            arrayList.add(alphabet[rand.nextInt(alphabet.length)]);
        }

        //this point, we should have a list of array with correct size that met the constraint
        //randomly re-arrange them to make at least a strong password
        //using .shuffle methods, I choose to do 20 times of shuffling
        for(int i=0; i<20;i++){
            Collections.shuffle(arrayList);
        }
        StringBuilder result= new StringBuilder();
        //build the result string
        for (Character character : arrayList) {
            result.append(character);
        }
        //since result as been appending in the loop, return it
        return result.toString();
    }
}
