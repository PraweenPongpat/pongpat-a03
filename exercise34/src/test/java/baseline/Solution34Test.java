package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    Solution34 test = new Solution34();

    @Test
    void isEmployeeTestForYes() {
        String[] employeeName = new String[5];
        employeeName[0] = "John Smith";
        employeeName[1] = "Jackie Jackson";
        employeeName[2] = "Chris Jones";
        employeeName[3] = "Amanda Cullen";
        employeeName[4] = "Jeremy Goodwin";
        int empIndThree = test.isEmployee(employeeName,5,"Amanda Cullen");
        assertEquals(3,empIndThree);
    }

    @Test
    void isEmployeeTestForNo() {
        String[] employeeName = new String[5];
        employeeName[0] = "John Smith";
        employeeName[1] = "Jackie Jackson";
        employeeName[2] = "Chris Jones";
        employeeName[3] = "Amanda Cullen";
        employeeName[4] = "Jeremy Goodwin";
        int empIndThree = test.isEmployee(employeeName,5,"Amanda CooCoo");
        assertEquals(-1,empIndThree);
    }
}