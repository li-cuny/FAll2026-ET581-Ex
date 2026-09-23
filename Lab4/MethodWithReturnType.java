public class MethodWithReturnType {
    public static void main(String[] args) {
          
    }
    public static int method1(){ // none void method must return a value
        return 1;
    }
    public static double method2(){
        return 1.0;
    }
    public static String method3(){
        return "String type";
    }
    public static void method4(int a){ // void method return is optional.
       // return;
       if (a %2 ==1 ) return;
       else System.out.println("even number");
    }
}