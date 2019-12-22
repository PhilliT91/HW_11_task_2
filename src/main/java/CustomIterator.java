import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIterator implements Iterator {

    private String[] arr;
    private int next;
    private int current;
   private String nextArr;


    public CustomIterator(String[] arr) {
        this.arr = arr;
        this.next = 0;
        current=0;
        nextArr = arr[0];
    }

    public int getNext() {
        return next;
    }

    public int getCurrent() {
        return current;
    }

    public boolean hasNext()

    {
        try{
            nextArr=arr[next];

        }catch(ArrayIndexOutOfBoundsException a){
            return false;

        }
        return true;


    }






    public String next() {
        if (hasNext()) {
           current= next;
           next++;
            return arr[current];
        }
        else throw new NoSuchElementException() ;
    }

    public void remove() {


    }


}
