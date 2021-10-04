package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    Solution34 test = new Solution34();

    @Test
    void isEmployeeTestForYes() {
        ArrayList<String> employeeName = new ArrayList<>();
        //John Smith, Jackie Jackson, Chris Jones, Amanda Cullen ,Jeremy Goodwin
        String employeeName0 = "John Smith";
        employeeName.add(employeeName0);
        String employeeName1 = "Jackie Jackson";
        employeeName.add(employeeName1);
        String employeeName2 = "Chris Jones";
        employeeName.add(employeeName2);
        String employeeName3 = "Amanda Cullen";
        employeeName.add(employeeName3);
        String employeeName4 = "Jeremy Goodwin";
        employeeName.add(employeeName4);
        int empIndThree = test.isEmployee(employeeName,5,"Amanda Cullen");
        assertEquals(3,empIndThree);
    }

    @Test
    void isEmployeeTestForNo() {
        ArrayList<String> employeeName = new ArrayList<>();
        //John Smith, Jackie Jackson, Chris Jones, Amanda Cullen ,Jeremy Goodwin
        String employeeName0 = "John Smith";
        employeeName.add(employeeName0);
        String employeeName1 = "Jackie Jackson";
        employeeName.add(employeeName1);
        String employeeName2 = "Chris Jones";
        employeeName.add(employeeName2);
        String employeeName3 = "Amanda Cullen";
        employeeName.add(employeeName3);
        String employeeName4 = "Jeremy Goodwin";
        employeeName.add(employeeName4);
        int empIndThree = test.isEmployee(employeeName,5,"Amanda CooCoo");
        assertEquals(-1,empIndThree);
    }
}