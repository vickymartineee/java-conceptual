package lambdas.predicate;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<String> greaterThanTen = (x) -> x.length() > 10;
        Function<Double, Integer> multiplyByTwo = (x) -> (int) Math.ceil(x * 10);
        System.out.println(greaterThanTen.test("Vignesh"));
        System.out.println(greaterThanTen.test("Vignesh1839893"));
        Predicate<Integer> greaterThanFive = (x) -> x > 5.0;
        Predicate<Integer> lessThanSeven = (x) -> x < 7.0;
        BiPredicate<Integer,Integer> customisedMaxPredicate = (x,y)-> x>y;
        Stream.generate(Math::random).limit(15)
                .map(multiplyByTwo)
                .filter(greaterThanFive)
                .forEach(System.out::println);
        System.out.println("------------------");

        //Less than 5
        Stream.generate(Math::random).limit(15)
                .map(multiplyByTwo)
                .filter(greaterThanFive.negate())
                .forEach(System.out::println);
        System.out.println("------------------");

        //5 to 7
        Stream.generate(Math::random).limit(15)
                .map(multiplyByTwo)
                .filter(greaterThanFive.and(lessThanSeven))
                .forEach(System.out::println);
        System.out.println("------------------");
        Stream.generate(Math::random).limit(15)
                .map(multiplyByTwo)
                .filter((x)->customisedMaxPredicate.test(x, 8))
                .forEach(System.out::println);

    }
}
