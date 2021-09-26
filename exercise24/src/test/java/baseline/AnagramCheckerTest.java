package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {
    @Test
    public void test_isAnagram(){
        //allocate the class
        String word1 = "hello";
        String word2 = "olleh";
        AnagramChecker check = new AnagramChecker(word1,word2);

        //call isAnagram to test
        boolean res = check.isAnagram(word1,word2);

        //check test result
        assertEquals(res,true);
    }
    @Test
    public void test_isAnagram2(){
        //allocate the class
        String word1 = "hello";
        String word2 = "ollej";
        AnagramChecker check = new AnagramChecker(word1,word2);

        //call isAnagram to test
        boolean res = check.isAnagram(word1,word2);

        //check test result
        assertEquals(res,false);
    }
}