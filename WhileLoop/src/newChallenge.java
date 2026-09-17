public class newChallenge {

    public static void main(String[] args) {

        System.out.println("Sum Digits of 12345 = " + sumDigits(12345));
        System.out.println("Sum Digits of -234 = " + sumDigits(-234));
        System.out.println("Sum Digits of 32123 = " + sumDigits(32123 ));
    }

    public static int sumDigits(int number) {

        int sum = 0, count = 0;

        if(number < 0) {
            return -1;
        }

        while(number > 0) {
            sum += (number % 10);
            number = number / 10;
        }

        return sum;
    }
}
