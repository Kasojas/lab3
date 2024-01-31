import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    
    @Test
    public void testAppend() {
        LinkedList l1 = new LinkedList();
        l1.append(0);
        l1.append(1);
        l1.append(2);
    }

    @Test 
    public void testFirst() {
        LinkedList l1 = new LinkedList();
        assertEquals(null, l1.first());
    }
}
