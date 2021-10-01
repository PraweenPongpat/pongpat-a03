package baseline;

import org.junit.jupiter.api.Test;

import static baseline.Solution28.NUMBERS;
import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    private Solution28 test = new Solution28();
    @Test
    void calcTotal() {
        double[] testArr = {1, 2.1, 3.2, 4.3, 5.4};
        double sumTest = test.calcTotal(testArr);
        assertEquals(16,sumTest,0.001);
    }

    @Test
    void calcTotal1() {
        double[] testArr = {-1,-2,-3,-4,5};
        double sumTest = test.calcTotal(testArr);
        assertEquals(-5,sumTest,0.001);
    }
}