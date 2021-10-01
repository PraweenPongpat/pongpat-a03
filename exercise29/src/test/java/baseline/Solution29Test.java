package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    private final Solution29 test = new Solution29();

    @Test
    void calcNumYearTest1() {
        //keep in mind that the input is already validated
        //these input are able to use for calculations
        int result1 = test.calcNumYear(4);
        assertEquals(18,result1);
    }

    @Test
    void calcNumYearTest2(){
        int result2 = test.calcNumYear(4.01);
        assertEquals(18,result2);
    }
}