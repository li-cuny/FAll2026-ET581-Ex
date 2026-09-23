public class FunctionTest { // class body start here
    // method 1
    public static void method1(){  // method body start here
        System.out.println("method1 is called.");
    } // method body end here.
    public static void main(String[] args) {
        // call method 1 
        method1(); // empty params
        int x = 1;
        double y = 0.25;
        method2(x, y); // args with int 1 and double 0.25
    }
    // method 2 
    public static void method2( int a, double b ){
        System.out.println("method2 is called.");
        System.out.println(a + b);
    }
    // your method can be anywhere inside class body.
} // class body end here.