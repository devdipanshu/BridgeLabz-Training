import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("31-12-2023", formatter.formatDate("2023-12-31"));
        assertEquals("01-01-2024", formatter.formatDate("2024-01-01"));
    }

    @Test
    void testInvalidDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("12/31/2023");
        });
        assertEquals("Invalid date format", exception.getMessage());
    }

    @Test
    void testNullDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
        assertEquals("Date cannot be null", exception.getMessage());
    }
}
