import java.util.Arrays;
import java.util.Scanner;
public class ArrayWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        // create an array of the size
        int[] array = new int[size];
        for (int i = 0; i<array.length; i++ ){
            array[i] = 2;
        }
        System.out.println(Arrays.toString(array));
        // for each loop
        for (int element : array){
            System.out.println(element);
        }
    }
}