public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final score is " + finalScore);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("Final score is " + calculateScore(gameOver, score, levelCompleted, bonus));

        calculateMyAge(2006);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1_000;
        }

        return finalScore;
    }

    public static int calculateMyAge(int dateOfBirth) {
        int myAge = 2026 - dateOfBirth;
        System.out.println("My age is " + myAge);
        return myAge;
    }
}