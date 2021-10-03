package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {
    String[][] rawInfo = {{"John", "Johnson", "Manager", "2016-12-31"},
            {"Tou","Xiong","Software Engineer","2016-10-05"},
            {"Michaela","Michaelson","District Manager","2015-12-19"},
            {"Jake","Jacobson","Programmer",""},
            {"Jacquelyn","Jackson","DBA",""},
            {"Sally","Webber","Web Developer","2015-12-18"}};
    Solution40 test = new Solution40();
    @Test
    void findPositionTest1() {
        ArrayList<Integer> expectedResultTest = new ArrayList<>();
        expectedResultTest.add(0);
        expectedResultTest.add(1);
        expectedResultTest.add(2);
        expectedResultTest.add(3);
        expectedResultTest.add(4);

        Map<String,String> firstNameMap = test.makeSearchMap(rawInfo,0);
        Map<String,String> lastNameMap = test.makeSearchMap(rawInfo,1);

        ArrayList<Integer> actualResultTest = test.findPosition("o",firstNameMap,lastNameMap);
        assertEquals(expectedResultTest,actualResultTest);
    }
    @Test
    void findPositionTest2() {
        ArrayList<Integer> expectedResultTest = new ArrayList<>();
        expectedResultTest.add(3);
        expectedResultTest.add(4);

        Map<String,String> firstNameMap = test.makeSearchMap(rawInfo,0);
        Map<String,String> lastNameMap = test.makeSearchMap(rawInfo,1);

        ArrayList<Integer> actualResultTest = test.findPosition("Ja",firstNameMap,lastNameMap);
        assertEquals(expectedResultTest,actualResultTest);
    }
}