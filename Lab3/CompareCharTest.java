public class CompareCharTest {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println("char c value is : " + (int) c );
        System.out.println("char c value is : " + (int) 'z' );
        System.out.println("char c value is : " + (int) 'A' );
        System.out.println("char c value is : " + (int) 'Z' );
        if ( c >= 'a' && c<='z'){
            System.out.println("lowercase");
        }else if ( c >='A' && c <= 'Z'){
            System.out.println("Uppercase");
        }
        String output = c + "";
        System.out.println(output);
    }
}