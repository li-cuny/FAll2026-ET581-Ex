public class IfTest {
    public static void main(String[] args){
        int a = 1;
        int b = 6;
        if (a + b == 7 ){
            //
            // 
            System.out.println("sum is 7");
        }else {
            System.out.println("sum is not 7 ");
        }
        
        int x = (a == b)? 1000: 2000; //condition ? trueValue: falseVAlue
        System.out.println(x);

        x = 3;
        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                break;
        }
        // after break come here 
    }
}