package baseline;

public class Solution24 {
    public static void main(String[] args) {

        Solution24 sol = new Solution24();

        //word1 = get string#1 from user
        String word1 = sol.getString();

        //word2 = get string#2 from user
        String word2 = sol.getString();

        //allocate class AnagramChecker with word1 and word2
        AnagramChecker check = new AnagramChecker(word1,word2);

        //result = pass word1 and word2 to anagramChecker's checking method
        boolean resultAnagramCheck = check.isAnagram(word1,word2);

        //display output
        System.out.println();
    }

    private String getString(){
        //print out the prompt to user for a string input
        //read string from user
        //return that string
        return "";
    }

}
