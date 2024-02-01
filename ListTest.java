import static org.junit.Assert.*;
import org.junit.*;


public class ListTest {
    LinkedList linkedList1=new LinkedList();

    @Test 
	public void testPrepend() {
    linkedList1.prepend(10);
    assertEquals(10,linkedList1.root.value);
    assertSame(null,linkedList1.root.next);

    linkedList1.prepend(20);
    assertEquals(20,linkedList1.root.value);
    assertEquals(10,linkedList1.root.next.value);
    assertSame(null,linkedList1.root.next.next);
    }
}



