public class ForLoopTest {
    public static void main(String[] args) {
        // int x = 1;  // init
        // while (x < 10) { // condition
        //     System.out.println(x); // repeat job
        //     x++ ; // update
        // }
        // convert it to for loop
        for ( int x = 1 ;  x < 10  ; x++  ) { // 1. init 2. condition 3. update
            System.out.println(x);
        }

        for (int y=1; y<10; y++)System.out.println(y);
        int z = 1;
        for (  ;z<10; ){
            System.out.println(z);
            z++;
        }
        for (int i = 0 , j=100; i<j; i ++, j--){
            System.out.println("i and j: " + i + j);
        }
    }
}