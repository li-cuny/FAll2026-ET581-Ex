public class MathOperatorTest {
    public static void main(String[] args){
        int x; // declare var
        x = 0; // assignment

        int y = 1; // dec + assign

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println(" 7/2 = " + 7/2);
        System.out.println(" 7%2 = " + 7%2);

        int a = 1;
        long b = 200L;
        long c = a + b;
        // int d = a + b;
        System.out.println("c = " + c);
        int e = 2;
        double f = 3.5;
        double g = e + f;
        System.out.println("g = " + g);

        double doubleValue = 2.5;
        int intValue = (int) doubleValue;
        System.out.println("int value of 2.5 " + intValue);
    }
}