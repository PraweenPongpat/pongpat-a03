package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    Solution38 test = new Solution38();
    @Test
    void filterEvenNumbersTest1() {
        int[] originalTest1 = {1,2,3,4,5,8,10,11,14,15,16};
        int[] resultTest1 = test.filterEvenNumbers(originalTest1);
        int elementTest1;
        String elementResultTest1 = "failed";
        for(int i=0; i<resultTest1.length;i++){
            elementTest1 = resultTest1[i];
            if((elementTest1%2)==0)
                elementResultTest1 = "passed";
            else
                elementResultTest1 = "failed at element"+i;
            assertEquals("passed",elementResultTest1);
        }
    }
    @Test
    void filterEvenNumbersTest2() {
        int[] originalTest2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,14,16,17};
        int[] resultTest2 = test.filterEvenNumbers(originalTest2);
        int elementTest2;
        String elementResultTest2 = "failed";
        for(int i=0; i<resultTest2.length;i++){
            elementTest2 = resultTest2[i];
            if((elementTest2%2)==0)
                elementResultTest2 = "passed";
            else
                elementResultTest2 = "failed at element"+i;
            assertEquals("passed",elementResultTest2);
        }
    }
}