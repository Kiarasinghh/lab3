import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


interface StringChecker { boolean checkString(String s); }


public class ListTest implements StringChecker{

    ArrayList<String> list1 = new ArrayList<>();
    list1.add("cat");
    list1.add("dog");
    list1.add("strawberry");
    list1.add("basketball");
    list1.add("hog");

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("cat");
    list2.add("cat");
    list2.add("cat");




    @Test 
	public void testFilter() {

    
    }
}



