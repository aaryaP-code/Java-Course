public class challenge1 {
    public static void main(String[] args) {
        double firstNum = 20.00d;
        double secondNum = 80.00d;

        double totalNum = (firstNum + secondNum) * 100.00d;
        System.out.println("Total value = " + totalNum);

        double reminder = totalNum % 40.00d;
        System.out.println("The Reminder is " + reminder);

        boolean noReminder = (reminder == 0) ? true : false;
        System.out.println("noReminder : " + noReminder);

        if(!noReminder) {
            System.out.println("Got some Reminder!");
        }

    }
}
