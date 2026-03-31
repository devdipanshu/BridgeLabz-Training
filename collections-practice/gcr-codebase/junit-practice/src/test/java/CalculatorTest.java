import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calc.add(5,5));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.subtract(5,3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calc.multiply(5,3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(10,5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(10,0);
        });
    }
}
