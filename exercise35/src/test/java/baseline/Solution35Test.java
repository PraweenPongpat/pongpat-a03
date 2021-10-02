package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    Solution35 test = new Solution35();

    @Test
    void randomNumberGenTest() {
        //from all 1000 random generating, make sure bounded from 0 to (upperBound - 1)
        for (int i = 0; i<1000; i++) {
            int randomNum = test.randomNumberGen(5);
            if (randomNum == 0) {
                assertEquals(0, randomNum);
            } else if (randomNum == 1) {
                assertEquals(1, randomNum);
            } else if (randomNum == 2) {
                assertEquals(2, randomNum);
            } else if (randomNum == 3) {
                assertEquals(3, randomNum);
            } else if (randomNum == 4) {
                assertEquals(4,randomNum);
            }
        }
    }
}