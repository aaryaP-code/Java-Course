public class Main {

    public static void main(String[] args) {

        for(int counter = 1; counter <= 5; counter ++) {
            System.out.println(counter);
        }

        for(double i = 2.0; i <= 5.0; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10_000, i));
        }

        for(double i = 7.5; i <= 10; i += 0.25) {
            if(calculateInterest(100,i) > 8.5) {
                break;
            }
            System.out.println("$100.00 at " + i + "% interest = $" + calculateInterest(100, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}