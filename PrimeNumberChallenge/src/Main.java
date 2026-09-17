public class Main {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; i <= 50; i++) {
            if (isPrime(i) == true) {
                System.out.println("Number " + i + " is a prime number");
                count++;
            }
        }
        System.out.println("Total Number of Prime Number is " + count);
    }
    public static boolean isPrime(int wholeNumber) {

        if(wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for(int i = 2; i <= wholeNumber / 2; i++) {
            if(wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}