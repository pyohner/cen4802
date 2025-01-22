import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacciZero() {
        assertEquals(0, Fibonacci.fibonacci(0), "Fibonacci of 0 should be 0");
    }

    @Test
    public void testFibonacciOne() {
        assertEquals(1, Fibonacci.fibonacci(1), "Fibonacci of 1 should be 1");
    }

    @Test
    public void testFibonacciTen() {
        assertEquals(55, Fibonacci.fibonacci(10), "Fibonacci of 10 should be 55");
    }

    @Test
    public void testFibonacciFive() {
        assertEquals(5, Fibonacci.fibonacci(5), "Fibonacci of 5 should be 5");
    }
}
