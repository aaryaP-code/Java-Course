import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Enter Number #" + counter + ": ");
            String nextNumber = scanner.nextLine();
            try {
//                  int number = Integer.parseInt(nextNumber);
                    double number = Double.parseDouble(nextNumber);
                    counter++;
                    sum += number;
            } catch(NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        } while(counter <= 5);

        System.out.println("The sum of 5 numbers = " + sum);
    }
}