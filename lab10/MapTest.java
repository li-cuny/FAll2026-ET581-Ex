import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
public class MapTest {

    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        System.out.println(m);
        m.put("a", "Alice");
        m.put("b", "Bob");
        System.out.println(m);
        String value = m.get("b");
        System.out.println(value );
        value = m.get("c"); // if value is not in map
        System.out.println(value);
        boolean isInMap = m.containsKey("c");
        System.out.println(isInMap);
        String result = m.remove("a");
        System.out.println(m + " " + result);
        result = m.remove("c");
        System.out.println(m + " " + result);
        String s = "java is easy java";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}