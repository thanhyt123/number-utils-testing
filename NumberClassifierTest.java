import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
    public void testMoreEvens() {
        int[] arr = {2, 4, 6};
        assertEquals("More evens", NumberClassifier.classifyNumbers(arr));
    }

    @Test
    public void testMoreOdds() {
        int[] arr = {1, 3, 5};
        assertEquals("More odds", NumberClassifier.classifyNumbers(arr));
    }

    @Test
    public void testEqual() {
        int[] arr = {1, 2};
        assertEquals("Equal", NumberClassifier.classifyNumbers(arr));
    }
}
@Test
public void testEmptyArray() {
    int[] arr = {};
    assertEquals("Equal", NumberClassifier.classifyNumbers(arr));
}

@Test
public void testMixedMoreEvens() {
    int[] arr = {2, 4, 6, 1};
    assertEquals("More evens", NumberClassifier.classifyNumbers(arr));
}

@Test
public void testMixedMoreOdds() {
    int[] arr = {1, 3, 5, 2};
    assertEquals("More odds", NumberClassifier.classifyNumbers(arr));
}
@Test
public void testEmptyArray() {
    int[] arr = {};
    assertEquals("Equal", NumberClassifier.classifyNumbers(arr));
}
