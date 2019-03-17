import org.junit.Test;

import static client.ValidatePassword.validatePassword;
import static org.junit.Assert.*;

public class ValidatePasswordTest {

    @Test
    public void validationCharTest() {
        String test = validatePassword("A1!@#$%^&*(){}[]");
        assertEquals("Your password contains a forbidden character.", test);
    }

    @Test
    public void validationLenTest() {
        String test = validatePassword("A1");
        assertEquals("Your password must be at least 8 characters in length.", test);
    }

    @Test
    public void validationCapTest() {
        String test = validatePassword("a1b2c3d4e5");
        assertEquals("Your password must contain at least one capital letter.", test);
    }

    @Test
    public void validationNumTest() {
        String test = validatePassword("AbCdEfGhIj");
        assertEquals("Your password must contain at least one number.", test);
    }

}