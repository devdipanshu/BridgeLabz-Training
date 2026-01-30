import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> {
            registration.registerUser("dipanshu", "dipanshu@gmail.com", "Pass1234");
        });
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "dipanshu@gmail.com", "Pass1234");
        });
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("dipanshu", "dipanshu.gmail.com", "Pass1234");
        });
        assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("dipanshu", "dipanshu@gmail.com", "pass");
        });
        assertEquals("Password must be at least 8 characters", exception.getMessage());
    }

    @Test
    void testNullInputs() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, null, null);
        });
        assertEquals("Username cannot be empty", exception.getMessage());
    }
}
