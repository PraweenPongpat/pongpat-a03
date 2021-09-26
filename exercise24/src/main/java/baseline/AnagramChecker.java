package baseline;

import java.util.Arrays;

public class AnagramChecker {
    //two words for checking if they're anagram
    private String word1;
    private String word2;

    //constructor
    public AnagramChecker(String word1, String word2){
        //set initials
        this.word1 = word1;
        this.word2 = word2;
    }

    public boolean isAnagram(String word1, String word2){
        //sort word1, using Arrays.sort()
        char[] sortedWord1 = word1.toCharArray();
        Arrays.sort(sortedWord1);

        //sort word2
        char[] sortedWord2 = word2.toCharArray();
        Arrays.sort(sortedWord2);

        //check if sortedWord1 the same as sortedWord2 and return result
        return Arrays.equals(sortedWord1,sortedWord2);
    }
}
