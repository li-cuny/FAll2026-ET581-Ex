import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class StreamTest {
    public static void main(String[] args) {
        // create stream
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        System.out.println(fruit);

        long result = fruit.stream() // creating stream
            .peek(item -> System.out.println("Before " + item)) // print item in the stream
            .filter(f -> f.equals("Banana")) // [false true true]
            .peek(item -> System.out.println("after " + item)) // print item in the stream
            .count(); // terminate stream.
        System.out.println(result);
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        integers.add(5);
        System.out.println(integers);
        int sum = integers.stream()
            .peek( i -> System.out.println(i))
            .reduce(0, (x,y) -> x + y);
        System.out.println(sum);

        List<Integer> resultIntegers = Stream.iterate(0, x->x+5)
            .limit(10)
            .peek(i -> System.out.println(i))
            //.count();
            .collect(Collectors.toList());
        System.out.println(resultIntegers);
    }
}