public class ScopeTest {
    public static String X = "X"; // first member of the class 
    public static void main(String[] args) {// second memberr
        System.out.println(X);
        //System.out.println(y);
        // a + b
    }
    public static void method1(){
        String y = "abc";
        System.out.println(X);
        System.out.println(y);
        // a+ b
    }
    public static void method2(int a, int b) {
        System.out.println(a + b);
        if (a > b ) {
            int x = 5;
        }
        // System.out.println(x);
        {
            int z = 8;
        }
        //System.out.println(z);
    }
}