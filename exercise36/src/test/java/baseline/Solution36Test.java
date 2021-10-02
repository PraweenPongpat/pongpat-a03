package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    Solution36 test = new Solution36();
    private final ArrayList<Double> list = new ArrayList<>();
    @Test
    void minTest() {
        list.add(100.00);
        list.add(200.00);
        list.add(300.00);
        list.add(1000.00);
        double min = test.min(list);
        assertEquals(100.00,min,0.001);
    }

    @Test
    void maxTest() {
        list.add(100.00);
        list.add(200.00);
        list.add(300.00);
        list.add(1000.00);
        double max = test.max(list);
        assertEquals(1000.00,max,0.001);
    }

    @Test
    void averageTest() {
        list.add(100.00);
        list.add(200.00);
        list.add(300.00);
        list.add(1000.00);
        double avg = test.average(list);
        assertEquals(400.00,avg,0.001);
    }

    @Test
    void stdTest() {
        list.add(100.00);
        list.add(200.00);
        list.add(300.00);
        list.add(1000.00);
        double std = test.std(list);
        assertEquals(353.55,std,0.01);
    }
}