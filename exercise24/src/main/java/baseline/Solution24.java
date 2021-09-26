package baseline;

import java.util.Scanner;

public class Solution24 {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Solution24 sol = new Solution24();

        //prompt user what's the program for
        System.out.println("Enter two string and I will tell you if they are anagrams");

        //word1 = get string#1 from user
        String word1 = sol.getString("first");

        //word2 = get string#2 from user
        String word2 = sol.getString("second");

        //allocate class AnagramChecker with word1 and word2
        AnagramChecker check = new AnagramChecker(word1,word2);

        //result = pass word1 and word2 to anagramChecker's checking method
        boolean resultAnagramCheck = check.isAnagram(word1,word2);

        //determine "are" or "are not" from the result
        String flag;
        if(resultAnagramCheck)
            flag = " are ";
        else
            flag = " are not ";

        //display output
        System.out.println("\""+word1+"\" and \""+word2+"\""+flag+"anagrams.");
    }

    private String getString(String prompt){
        //print out the prompt to user for a string input
        System.out.print("Enter the "+prompt+" string: ");

        //read string from user and return that string
        return input.nextLine();
    }

}
