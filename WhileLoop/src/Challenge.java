public class Challenge {

    public static void main(String[] args) {

        int number = 4;
        int oddCount = 0;
        int evenCount = 0;

        while(number <= 20) {
            number++;
            if(!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even Number = " + number);

            evenCount++;
            if(evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total Even Number = " + evenCount);
        System.out.println("Total Odd Number = " + oddCount);
    }

    public static boolean isEvenNumber(int number) {

        return (number % 2 == 0);
    }
}
