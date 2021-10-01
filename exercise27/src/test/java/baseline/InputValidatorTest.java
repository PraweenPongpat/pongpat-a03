package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {
    private final InputValidator test = new InputValidator();

    @Test
    void InputValidatorTest0() {
        //test all functions in set#1
        String result = test.validateInput("John", "Zena", "12345", "AK-9876");
        String firstNameTest = test.nameValidator("John", "first");
        String lastNameTest = test.nameValidator("Zena", "last");
        String zipCodeTest = test.zipValidator("12345");
        String empTest = test.employeeValidator("Ak-9876");
        assertEquals("passed", firstNameTest);
        assertEquals("passed", lastNameTest);
        assertEquals("passed", zipCodeTest);
        assertEquals("passed", empTest);
        assertEquals("There were errors found.", result);
    }
    @Test
    void InputValidatorTest1() {
        //test all functions in set#2
        String firstNameTest1 = test.nameValidator("J", "first");
        String lastNameTest1 = test.nameValidator("Z123", "last");
        String zipCodeTest1 = test.zipValidator("123456");
        String empTest1 = test.employeeValidator("Ak-9");
        assertEquals("The first name must be at least 2 characters long.", firstNameTest1);
        assertEquals("The last name must be only letters.", lastNameTest1);
        assertEquals("The zipcode must be a 5-digit number.", zipCodeTest1);
        assertEquals("The employee ID must in the format AA-1234.", empTest1);
    }
    @Test
    void InputValidatorTest2(){
        //test all functions in set#3
        String firstNameTest2 = test.nameValidator("","first");
        String lastNameTest2 = test.nameValidator("","last");
        String zipCodeTest2 = test.zipValidator("ABCDE");
        String empTest2 = test.employeeValidator("AAA-123");
        assertEquals("The first name must be filled in.",firstNameTest2);
        assertEquals("The last name must be filled in.",lastNameTest2);
        assertEquals("The zipcode must be a 5-digit number.",zipCodeTest2);
        assertEquals("The employee ID must in the format AA-1234.",empTest2);
    }
}