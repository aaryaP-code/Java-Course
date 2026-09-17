public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Aarya");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than Second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or Both conditions are true");
        }

        int newValue = 10;
        if(newValue == 10) {
            System.out.println("This is an True!");
        }

        boolean isCar = false;
        if(!isCar) {
            System.out.println("This is not supposed to happen.");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;


        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our Client is " + ageText);

        String s = (isDomestic) ? "The car is Domestic" : "The car is not Domestic";
        System.out.println(s);
    }
}
