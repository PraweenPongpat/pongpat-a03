package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void makePasswordTest1() {
        PasswordGenerator test = new PasswordGenerator(8,2,2);
        String passwordTest1 = test.makePassword();
        int numDigit = 0;
        int numAlphabet = 0;
        char[] passwordArrTest = passwordTest1.toCharArray();
        for (char c : passwordArrTest) {
            if (Character.isDigit(c))
                numDigit++;
            else if (Character.isAlphabetic(c))
                numAlphabet++;
        }
        int numSpChar = passwordArrTest.length - numAlphabet - numDigit;

        //tests
        String lengthTest = (passwordTest1.length()>8)? "passed":"LenFailed";
        assertEquals("passed",lengthTest);
        String numSpCharTest = (numSpChar==2)? "passed":"SpCharFailed";
        assertEquals("passed",numSpCharTest);
        String numDigitTest = (numDigit==2)? "passed":"digitFailed";
        assertEquals("passed",numDigitTest);
    }

    @Test
    void makePasswordTest2() {
        PasswordGenerator test = new PasswordGenerator(10,3,3);
        String passwordTest1 = test.makePassword();
        int numDigit = 0;
        int numAlphabet = 0;
        char[] passwordArrTest = passwordTest1.toCharArray();
        for (char c : passwordArrTest) {
            if (Character.isDigit(c))
                numDigit++;
            else if (Character.isAlphabetic(c))
                numAlphabet++;
        }
        int numSpChar = passwordArrTest.length - numAlphabet - numDigit;

        //tests
        String lengthTest = (passwordTest1.length()>10)? "passed":"LenFailed";
        assertEquals("passed",lengthTest);
        String numSpCharTest = (numSpChar==3)? "passed":"SpCharFailed";
        assertEquals("passed",numSpCharTest);
        String numDigitTest = (numDigit==3)? "passed":"digitFailed";
        assertEquals("passed",numDigitTest);
    }
}