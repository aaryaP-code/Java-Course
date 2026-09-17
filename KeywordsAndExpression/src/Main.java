public class Main {

    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highscore = 50;

        if(highscore > 25) {
            highscore += 1000; // add bonus points
        }

        int health = 100;
        if((health < 25) && (highscore > 1000)) {
            highscore -= 1000;
        }
        System.out.println("Highscore is : " + highscore);
    }
}