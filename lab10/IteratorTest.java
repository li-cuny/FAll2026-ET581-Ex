import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("Apple");
        c.add("Banana");
        c.add("Cherry");
        Iterator<String> iterator = c.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }

    }
}