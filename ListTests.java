import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

//interface StringChecker { boolean checkString(String s); }

public class ListTests {
    @Test
    public void testFilterFullList() {
        String[] inputArr = {"this", "bliss", "no", "that", "is"};
        List<String> input = new ArrayList<>();
        input.add("this");
        input.add("bliss");
        input.add("no");
        input.add("that");
        input.add("is");
        List<String> result = ListExamples.filter(input, "is");
        for (int i = 0; i < result.size(); i++) {
            assertEquals(input.get(i), result.get(i));
        }
    }

    @Test
    public void testMergeFullList() {
        List<String> inputA = new ArrayList<>();
        List<String> inputB = new ArrayList<>();
        inputA.add("a");
        inputA.add("g");
        inputA.add("n");
        inputB.add("b");
        inputB.add("l");
        inputB.add("r");
        inputB.add("v");
        inputB.add("z");
        String[] combined = {"a", "b", "g", "l", "n", "r", "v", "z"};
        List<String> result = ListExamples.merge(inputA, inputB);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(combined[i], result.get(i));
        }
    }
}
