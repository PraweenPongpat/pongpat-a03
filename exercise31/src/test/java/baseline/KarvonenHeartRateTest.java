package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateTest {
    KarvonenHeartRate test = new KarvonenHeartRate(22,65);
    @Test
    void displayLine1() {
        String result1 = test.displayLine(55);
        assertEquals("55%          | 138 bpm",result1);
    }

    @Test
    void displayLine2() {
        String result2 = test.displayLine(95);
        assertEquals("95%          | 191 bpm",result2);
    }
}