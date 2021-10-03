package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    Solution39 test = new Solution39();
    String[][] rawInfo = {{"John", "Johnson", "Manager", "2016-12-31"},
            {"Tou","Xiong","Software Engineer","2016-10-05"},
            {"Michaela","Michaelson","District Manager","2015-12-19"},
            {"Jake","Jacobson","Programmer",""},
            {"Jacquelyn","Jackson","DBA",""},
            {"Sally","Webber","Web Developer","2015-12-18"}};

    @Test
    void makeMapTest() {
        Map<String,String> hashMap1 = new HashMap<>();
        hashMap1.put("0",rawInfo[0][0]);
        hashMap1.put(rawInfo[0][0],rawInfo[0][1]);
        hashMap1.put(rawInfo[0][1],rawInfo[0][2]);
        hashMap1.put(rawInfo[0][2],rawInfo[0][3]);

        Map<String,String> rowMapTest = test.makeMap(rawInfo,0);
        assertEquals(hashMap1,rowMapTest);
    }

    @Test
    void makeTreeMapTest() {
        Map<String, String> treeMap1 = new TreeMap<>();
        treeMap1.put(rawInfo[0][1],"0");
        treeMap1.put(rawInfo[1][1],"1");
        treeMap1.put(rawInfo[2][1],"2");
        treeMap1.put(rawInfo[3][1],"3");
        treeMap1.put(rawInfo[4][1],"4");
        treeMap1.put(rawInfo[5][1],"5");

        Map<String,String> testTreeMap = test.makeTreeMap(rawInfo);
        assertEquals(treeMap1,testTreeMap);

    }
}