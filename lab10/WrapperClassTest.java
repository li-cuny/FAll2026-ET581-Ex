import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class WrapperClassTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(1));
        list.add(2);
        System.out.println(list);
        Integer integer = list.get(1);
        int i = list.get(0);
        System.out.println(integer.intValue());
        System.out.println(i);
        int j = Integer.parseInt("5555");
        System.out.println(j);
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList, (a,b)-> b-a);
        System.out.println(arrayList);
        Collections.sort(arrayList, (a,b)-> a-b);
        System.out.println(arrayList);

    }
}