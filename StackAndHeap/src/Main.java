class Calculator {

    int num;

    public int add(int n1, int n2) {

        return n1 + n2;
    }
}
public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 6));
    }
}