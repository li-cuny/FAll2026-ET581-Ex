public class OverloadingTest {
    // same method name can be created.
    public static void square(int a){ // param is diff
        System.out.println("square(int a)");
    }
    public static void square(double a){
        System.out.println("square(double a)");
    }
    public static void square(char a){
        System.out.println("square(char a)");
    }
    public static void square(long a){
        System.out.println("square(long a)");
    }
    // we call method square is overloaded.
    public static void main(String[] args) {
        square(1); // passing int
        square(102L); // passing long value
        square('a');
    }
}