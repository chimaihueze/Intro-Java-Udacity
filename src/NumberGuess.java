import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        // Generate a random number from 1 - 100
        double randomDouble = Math.random() * 100; // Generating a random double between 0 and 100
        int randomInt = (int) randomDouble + 1; // Making sure the number generated is an integer, and always greater than 1
        //System.out.println(randomInt);
        Scanner randNum = new Scanner(System.in);
        System.out.println("Try to guess a number from 1 to 100: ");
        // Generating a loop that asks the user to guess a number

        int count = 10; // Initiating the number of times a user is allowed to guess

        while (true) {
            System.out.println("You have " + count + " chance(s) left."); // Warning the user on the numb er of times he has left to guess
            int randInt = randNum.nextInt();
            count--; // reducing the number of times a user is allowed to guess, after each turn

            if (count == 0) { // When the user has exhausted the number of times allowed, terminate the loop
                System.out.println("GAME OVER! You couldn't guess the right number!");
                break;
            } else {
                if (randInt > randomInt) {
                    System.out.println("Sorry! " + randInt + " is greater than the actual number.");
                    System.out.println("Guess again: "); // Ask to guess again
                } else if (randInt < randomInt) {
                    System.out.println("Sorry! " + randInt + " is less than the actual number.");
                    System.out.println("Guess again: "); // Ask to guess again
                } else {
                    System.out.println("Congratulations! You guessed right. " + randInt + " is the correct number.");
                    break;
                }
            }
        }
    }
}
