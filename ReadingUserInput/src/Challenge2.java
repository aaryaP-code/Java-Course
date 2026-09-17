import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double minimum = 0;
        double maximum = 0;
        boolean firstNumber = true;

        do {
            System.out.println("Enter a number or Enter any character to exit loop : ");
            String nextNumber = scanner.nextLine();

            try {
                double number = Double.parseDouble(nextNumber);
                if(firstNumber) {
                    minimum = number;
                    maximum = number;
                    firstNumber = false;
                }

                if(number < minimum) {
                    minimum = number;
                }

                if(number > maximum) {
                    maximum = number;
                }
            } catch(NumberFormatException nfe) {
                break;
            }
        } while(true);

        System.out.println("Minimum Number = " + minimum);
        System.out.println("Maximum Number = " + maximum);
    }
}