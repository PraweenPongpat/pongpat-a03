package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
    private final Solution30 test = new Solution30();

    @Test
    void mulABWithTab1() {
        String resultTest1 = test.mulABWithTab(12,12);
        assertEquals("  144",resultTest1);
    }
    @Test
    void mulABWithTab2() {
        String resultTest2 = test.mulABWithTab(1,12);
        assertEquals("   12",resultTest2);
    }
}