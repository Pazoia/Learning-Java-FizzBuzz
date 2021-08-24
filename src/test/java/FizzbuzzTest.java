import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    void testGenerateListsNumbersUpToOne() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(1);
        assertEquals("1", result);
        // Note that in JUnit, the expected value comes first
        // This is called 'Yoda Conditions'.
    }

    @Test
    void testGenerateListsNumbersUpToTwo() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(2);
        assertEquals("1, 2", result);
    }

    @Test
    void returnFizzWhenNumberIsDivisableByThree() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.convert(3);
        assertEquals("Fizz", result);
    }

    @Test
    void returnBuzzWhenNumberIsDivisableByFive() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.convert(5);
        assertEquals("Buzz", result);
    }
}
