public class challenge2 {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);

    }

    public static void printDayOfWeek(int day) {

        switch(day) {
            case 0 -> System.out.println(day + " stands for Sunday");
            case 1 -> System.out.println(day + " stands for Monday");
            case 2 -> System.out.println(day + " stands for Tuesday");
            case 3 -> System.out.println(day + " stands for Wednesday");
            case 4 -> System.out.println(day + " stands for Thursday");
            case 5 -> System.out.println(day + " stands for Friday");
            case 6 -> System.out.println(day + " stands for Saturday");
            default -> System.out.println(day + " is an Invalid Day");
        }
    }

    public static void printWeekDay(int day) {

        if(day == 0) {
            System.out.println(day + " stands for Sunday");
        } else if(day == 1) {
            System.out.println(day + " stands for Monday");
        } else if(day == 2) {
            System.out.println(day + " stands for Tuesday");
        } else if(day == 3) {
            System.out.println(day + " stands for Wednesday");
        } else if(day == 4) {
            System.out.println(day + " stands for Thursday");
        } else if(day == 5) {
            System.out.println(day + " stands for Friday");
        } else if(day == 6) {
            System.out.println(day + " stands for Saturday");
        } else {
            System.out.println(day + " is an Invalid Day");
        }
    }
}
