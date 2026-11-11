import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ListTest{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b"); // comes from collection method.
        System.out.println(list.get(0));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator();// regular Iterator
        ListIterator<String> lit = list.listIterator(); // list interface
        while(lit.hasNext()){
            String item = lit.next();
            int index = lit.nextIndex();
            System.out.println(item + index);
        }
        while(lit.hasPrevious()){
            String item = lit.previous();
            int index = lit.previousIndex();

            System.out.println(item + index);
        }

    }
}