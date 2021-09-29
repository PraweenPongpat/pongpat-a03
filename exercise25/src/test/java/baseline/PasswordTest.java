package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void passwordValidatorTest() {
        //case of very strong
        Password test = new Password("1337h@xor!");
        int resTest = test.passwordValidator(test.getPassword());
        assertEquals(4,resTest);
        //case of strong
        test.setPassword("abc123xyz");
        resTest = test.passwordValidator(test.getPassword());
        assertEquals(3,resTest);
        //case of week
        test.setPassword("abcdeFFF");
        resTest = test.passwordValidator(test.getPassword());
        assertEquals(2,resTest);
        //case of very week
        test.setPassword("1234567");
        resTest = test.passwordValidator(test.getPassword());
        assertEquals(1,resTest);
        //case of unknown
        test.setPassword("!@#!@#!@#!@#");
        resTest = test.passwordValidator(test.getPassword());
        assertEquals(0,resTest);
    }
}