import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2026;

        System.out.println(getInputFromScanner(currentYear));
    }

//    public static String getInputFromConsole(int currentYear) {
//
//        String name = System.console().readLine("Hi, What is your Name? ");
//        System.out.println("Hi " + name + ", Thanks for taking the course!");
//
//        String yearOfBirth = System.console().readLine("What year were you born? ");
//        int age = currentYear - Integer.parseInt(yearOfBirth);
//
//        return "So you are " + age + " years old";
//    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What is your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);

            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch(NumberFormatException badUserData) {
                System.out.println("Characters not Allowed! Try Again");
            }
        } while(!validDOB);
        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String yearOfBirth) {

        if((Integer.parseInt(yearOfBirth) < currentYear - 125) || (Integer.parseInt(yearOfBirth) > currentYear)) {
            return -1;
        }

        return (currentYear - Integer.parseInt(yearOfBirth));
    }
}