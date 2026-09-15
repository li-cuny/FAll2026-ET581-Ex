public class OperatorTest {
    public static void main(String[] args){
        // compare operators
        int a = 1;
        int b = 2;
        System.out.println(a == b);
        boolean result = a != b;
        System.out.println(result);
        System.out.println(!result); // not operator

        boolean x = true, y = false;
        System.out.println( x && y );  // and 
        System.out.println( x || y ); // or 

        // String compare
        String str1 = "abc"; // first way 
        String str2 = new String("abc"); // second way to create String
        boolean strEqual = str1.equals(str2);  // correct way to compare two String
        System.out.println("strEqual: " + strEqual);
        strEqual = str1 == str2;
        System.out.println("str1 == str2: "+ strEqual );
        // System.out.println("str1 pointer: " + str1);
        // System.out.println("str2 pointer: " + str2);

    }
}