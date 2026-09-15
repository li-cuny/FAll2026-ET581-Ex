import java.util.StringTokenizer;
public class StringTokenizerTest {
    public static void main(String[] args) {
        String sentence = "apple orange mango";
        StringTokenizer st1 ; // declare a var which type is StringTokenizer;
        st1 = new StringTokenizer(sentence);// default seperator which is space char
        String first = st1.nextToken();
        String second  = st1.nextToken();
        String third = st1.nextToken();
        //st1.nextToken();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        // 
        String sentence2 = "apple,orange,mango";
        StringTokenizer st2 = new StringTokenizer(sentence2, ",");
        first = st2.nextToken();
        second  = st2.nextToken();
        third = st2.nextToken();
        //st1.nextToken();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
    }
}