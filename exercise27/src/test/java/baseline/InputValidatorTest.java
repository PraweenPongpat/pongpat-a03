package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {
    private InputValidator test = new InputValidator("","","","");

    @Test
    public void InputValidatorTest() {
        //test all functions in set#1
        String result = test.validateInput("John", "Zena", "12345", "AK-9876");
        String firstNameTest = test.nameValidator("John", "first");
        String lastNameTest = test.nameValidator("Zena", "last");
        String zipCodeTest = test.ZIPValidator("12345");
        String empTest = test.employeeValidator("Ak-9876");
        assertEquals("passed", firstNameTest);
        assertEquals("passed", lastNameTest);
        assertEquals("passed", zipCodeTest);
        assertEquals("passed", empTest);
        assertEquals("There were errors found.", result);
    }
    @Test
    public void InputValidatorTest1() {
        //test all functions in set#2
        String firstNameTest1 = test.nameValidator("J", "first");
        String lastNameTest1 = test.nameValidator("Z123", "last");
        String zipCodeTest1 = test.ZIPValidator("123456");
        String empTest1 = test.employeeValidator("Ak-98765");
        assertEquals("The first name must be at least 2 characters long.", firstNameTest1);
        assertEquals("The last name must be only letters.", lastNameTest1);
        assertEquals("The zipcode must be a 5-digit number.", zipCodeTest1);
        assertEquals("The employee ID must in the format AA-1234.", empTest1);
    }
    @Test
    public void InputValidatorTest2(){
        //test all functions in set#3
        String firstNameTest2 = test.nameValidator("","first");
        String lastNameTest2 = test.nameValidator("","last");
        String zipCodeTest2 = test.ZIPValidator("ABCDE");
        String empTest2 = test.employeeValidator("AA-123A");
        assertEquals("The first name must be filled in.",firstNameTest2);
        assertEquals("The last name must be filled in.",lastNameTest2);
        assertEquals("The zipcode must be a 5-digit number.",zipCodeTest2);
        assertEquals("The employee ID must in the format AA-1234.",empTest2);
    }
}