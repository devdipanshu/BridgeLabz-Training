import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Abcdef12"));
    }

    @Test
    void testTooShortPassword() {
        assertFalse(validator.isValid("Abc12"));
    }

    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("abcdef12"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Abcdefgh"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
