import java.util.Collection;
import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args){
        Collection<String> c = new ArrayList<String>(); // storing String type
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        c.add("a");
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        c.remove("a");
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        c.add("b");
        c.add("c");
        c.add("d");
        Collection<String> c2 = new ArrayList<>(); // b,d
        c2.add("b");
        c2.add("d");
        System.out.println(c.containsAll(c2));
        boolean result = c.addAll(c2);
        System.out.println(result);
        c2.add("f");
        result = c.removeAll(c2);
        System.out.println(result);
        Collection<String> c3 = new ArrayList<>();
        result = c.removeAll(c3);
        System.out.println(result);

    }
}