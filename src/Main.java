import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Example1<Integer> ex1= new Example1<Integer>(128);
        System.out.println("Example1");
        ex1.showType();
        System.out.println("ex1 value == "+ ex1.getob());

        Example2 ex2= new Example2("String");
        System.out.println("\n\nExample2");
        ex2.showType();
        String s= (String) ex2.getob();
        System.out.println("ex2 value == "+ ex2.getob());

        Example3<String, Double> ex3= new Example3<String, Double>("String", 14.0);
        System.out.println("\n\nExample3");
        ex3.showTypes();
        System.out.println("ex3 first value == "+ ex3.getob1()+
                "\nex3 second value == "+ ex3.getob2());
        new Scanner(System.in).next();

    }
}
//395 обобщения  396 пример простого обобщения , 401 обощение повышает безопасн,, 403 обобщенный класс с 2 мараметрами типа