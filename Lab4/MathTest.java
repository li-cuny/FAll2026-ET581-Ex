public class MathTest {
    public static void main(String[] args){
        double randomNumber = Math.random(); // 0.0 - 1.0 not include 1.0
        System.out.println(randomNumber);
        // print number from 0 to 9 
       // int intNumber = (int)( randomNumber * 10 );
        int intNumber = (int)( randomNumber * 101 ); // 0 to 100 
        System.out.println(intNumber);

        // max and min
        System.out.println(Math.max(204,203));
        System.out.println(Math.min(204,203));
        System.out.println(Math.pow(2,4));

    }
}