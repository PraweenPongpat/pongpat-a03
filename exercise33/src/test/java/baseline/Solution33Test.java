package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    private final Solution33 test = new Solution33();
    @Test
    void randomNumberGenTest(){
        for (int i = 0; i<200; i++) {
            int randomNum = test.randomNumberGen();
            if (randomNum == 0) {
                System.out.println("it's 0");
                assertEquals(0, randomNum);
            } else if (randomNum == 1) {
                System.out.println("it's 1");
                assertEquals(1, randomNum);
            } else if (randomNum == 2) {
                System.out.println("it's 2");
                assertEquals(2, randomNum);
            } else if (randomNum == 3) {
                System.out.println("it's 3");
                assertEquals(3, randomNum);
            } else {
                System.out.println("something is wrong");
                assertEquals(-1, randomNum);
            }
        }
    }

}