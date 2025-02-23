import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BifunctionalUtils {
     static Integer calculate(String ops, Integer a1, Integer a2){
        BiFunction<Integer,Integer, Integer> add = Integer::sum;
        BiFunction<Integer,Integer, Integer> sub = (a,b)-> a - b;
        BiFunction<Integer,Integer, Integer> prod = (a,b)-> a * b;
        BiFunction<Integer,Integer, Integer> div = (a,b)-> a/b;
        HashMap<String,BiFunction<Integer,Integer, Integer>> functionalMap = new HashMap<>();
        functionalMap.put("add",add);
        functionalMap.put("sub",sub);
        functionalMap.put("prod",prod);
        functionalMap.put("div",div);
        BiFunction<Integer,Integer,Integer> biFunction = functionalMap.get(ops);
        return biFunction.apply(a1,a2);
    }


    static <T, U, R> List<R> listCombiner(
            List<T> list1, List<U> list2, BiFunction<T, U, R> combiner) {
        return IntStream.range(0, Math.min(list1.size(), list2.size()))
                .mapToObj(i -> combiner.apply(list1.get(i), list2.get(i)))
                .collect(Collectors.toList());
    }


}
