
import org.junit.*;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class CustomIteratorTest {
    String[] arr= new String[] {"1111","222","333","444","555" };
    CustomIterator it = new CustomIterator(arr);



@Test
    public void constructorWorkCorrectly(){
assertTrue(it.hasNext());
assertEquals(0,it.getNext());
assertEquals(0,it.getCurrent());

    }



    @Test (expected= NoSuchElementException.class)
    public void nextTest()  {
for(int i=0;i<arr.length;i++){
    assertEquals(arr[i],it.next());
}
String test=it.next();

    }
}
