public class NestedLoop {
    public static void printRowOfHello() {
        for (int j = 1; j <= 4; j++) { // repeat Hello 4 times
            System.out.print("Hello ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // printRowOfHello();
        // printRowOfHello();
        // printRowOfHello();
        // printRowOfHello();
        // printRowOfHello();

        // for (int i = 0 ;i < 5; i++ ){
        //     printRowOfHello();
        // }

        for (int i = 0 ;i < 5; i++ ){
            for (int j = 1; j <= 4; j++) { // repeat Hello 4 times
                System.out.print("Hello ");
            }
            System.out.println();
        }
    }
}