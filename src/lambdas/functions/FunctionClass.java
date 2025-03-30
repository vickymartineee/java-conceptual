package lambdas.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionClass {
    public static void main(String[] args) {
        Function<Integer, String> numberInputed = FunctionClass::combiner;
        Function<String, String> stringInputed = FunctionClass::combiner;
        Function<List<String>, String> listInputed = FunctionClass::combiner;

        BiFunction<Integer,Integer,Integer> sum = (x, y)-> x+y+2;
        BiFunction<List<String>, List<Integer>, List<String>> merger = FunctionClass::combiner;

        System.out.println(sum.apply(1,2));
        System.out.println(
                combiner(List.of("a","b","c"), List.of(1,2,3))
        );

        System.out.println( numberInputed.apply(8));
        System.out.println(stringInputed.apply("Viswa"));
        System.out.println(listInputed.apply(List.of("Hello" ,"sir")));
        Stream<String> names = Stream.of("Alice", "Bob", "Charlie", "Alice", "David", "Bob");

        Map<String, Long> nameCounts = names.collect(Collectors.groupingBy(x-> x+"Hekki", Collectors.counting()));
        System.out.println("Name Counts: " + nameCounts); // Output: {Alice=2, Bob=2, Charlie=1, David=1}

        // Example 2: Using with Stream's toMap (where keys and values are the same)
        Stream<String> uniqueNames = Stream.of("Alice", "Bob", "Charlie", "David");



    }

    static <T> String combiner(T i){
        return i+" Test";
    }

    static List<String> combiner (List<String>x, List<Integer> y){
        List<String> str = new ArrayList<>();
        int l=0;
        for (String i: x){
            str.add(i+y.get(l++));
        }
        return str;
    }

}
