public class BreakContinueTest {
    public static void main(String[] args) {
        int i = 0;//init
        while(i<10){ // condition checking
            System.out.println(i); // repeat statement
            if (i==5) break;
            i++; // update statement
        }
        // when i == 5 exit while body and come here.
        System.out.println("this is end of the program");

        // continue statement
        i = 0;//init
        while(i<10){ // condition checking
            if (i ==5) {
                i++;
                continue;
            }
            System.out.println(i); // repeat statement
           
            i++; // update statement
        }
    }
}