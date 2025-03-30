package lambdas.functions;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cs = (x) -> System.out.println("Calculator is called " + x);
        cs.calculate(5);

    }


}
