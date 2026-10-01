import java.util.Arrays;

public class TwoDArrayTest {
    public static void main(String[] args) {
        int[][] array = {
            {0,0,0,0},
            {1,1,1,1},
            {2,2,2,2}
        };
        System.out.println(Arrays.deepToString(array));

        for (int r=0; r<array.length; r++){
           // System.out.println(Arrays.toString(array[r]));
            for (int c =0; c< array[r].length; c++){
                System.out .print(array[r][c] );
            }
            System.out.print("\n");
        }
    }
}