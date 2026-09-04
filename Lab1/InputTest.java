import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        System.out.println("input an int value:");
        Scanner input = new Scanner(System.in); // creating a scanner object called input.
        int x ; // declare a var storing user input
        x = input.nextInt();
        System.out.println("x = " + x);
        input.close(); // close any resource you opened.

    }
}