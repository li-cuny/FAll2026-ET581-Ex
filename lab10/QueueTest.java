import java.util.Queue;
import java.util.LinkedList;
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String> ();
        System.out.println(q);
        q.add("a"); // collection method
        q.offer("b"); // queue method
        System.out.println(q);
        String head = q.remove();
        System.out.println("Head is : " + head);
        System.out.println(q);
        head = q.poll();
        System.out.println("Head is : " + head);
        System.out.println(q);
        // remove item from empty queue.
        //head = q.remove(); // stops program by exception/error
        System.out.println(q);
        // good way to retrive item from queue is using 
        head = q.poll(); // safe fail without error.
        System.out.println(head);
        System.out.println(q);
        //head = q.element();
        q.offer("c");
        System.out.println(q);
        head = q.peek();
        System.out.println(head);
        System.out.println(q);

    }
}