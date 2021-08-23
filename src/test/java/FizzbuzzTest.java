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
}
