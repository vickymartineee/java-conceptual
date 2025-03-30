package lambdas.consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<String> logConsumer = System.out::println;
        Consumer<String> logInteger = System.out::println;
        logConsumer.andThen(logInteger).accept(String.valueOf(199));


        // BiConsumer
        List<String> a1 = List.of("Vignesh", "Viswa", "Martin");
        List<Integer> k1 = List.of(100, 110, 120);
        BiConsumer<List<String>, List<Integer>> combiner = (a, k) -> IntStream.range(0, a.size())
                .forEach(i -> System.out.println(a.get(i) + " " + k.get(i)*2));

        combiner.accept(a1,k1);

       /* IntStream.range(0, a.size())
                .forEach(i -> System.out.println(STR."\{a.get(i)}: \{a.get(i)}"));*/
    }
}
