import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String f = sc.next();
       Integer a = sc.nextInt();
       Integer b = sc.nextInt();
       if(f.equals("add")){
           System.out.println(a+b);
       } else if (f.equals("sub")) {
           System.out.println(a+b);
       }

    }
}