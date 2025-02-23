import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class TwoFunctionCall {
    public  static void main(String [] args){
        System.out.println("Use options \nadd \nsub \nprod \ndiv");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        Integer c = sc.nextInt();
        Integer d = sc.nextInt();
        System.out.println(BifunctionalUtils.calculate(option,c,d));

        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(110, 21, 3);

        List<String> result = BifunctionalUtils.listCombiner(list1, list2, (letter, number) -> letter + number);
        System.out.println(result);
    }



}
