import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(10, calculator.subtract(15, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(10.0, 5.0), 0.001);
    }
}