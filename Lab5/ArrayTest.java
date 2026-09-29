import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // declare an array
        int[] intArray ;
        double [] doubleArray;
        String [] stringArray;

        // init 
        intArray = new int[5]; // intArray = [0, 0, 0, 0, 0]
        doubleArray = new double [3];
        stringArray = new String[6];
        System.out.println(intArray);
        System.out.println(doubleArray);
        System.out.println(stringArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(stringArray));

        for(int i = 0; i<5 ;i++){
            System.out.println(intArray[i]);
        };

        // second way to create array
        int[] intArray2 = {1,2,3,4};
        double[] doubleArray2 = {0.1,0.2};
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(doubleArray2));
        //third way
        int[] intArray3 = new int[] {1,2,4};
        int size = 10;
        int[] intArray4 = new int[size];
        System.out.println(Arrays.toString(intArray3));
        System.out.println(Arrays.toString(intArray4));
    }
}