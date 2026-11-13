import java.util.Set;
import java.util.HashSet;

public class SetTest{
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>(); // create set object.
        // HashSet<String> hasSet = s;
        s.add("first");
        boolean result = s.add("second");
        System.out.println(s);
        System.out.println(result);
        result = s.add("second");
        System.out.println(s);
        System.out.println(result);
    }
}