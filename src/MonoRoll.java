/*Define a function called monopolyRoll(). This function provides a random result based on
the dice-rolling rules for the board game Monopoly. In Monopoly, players roll two six-sided
dice to determine their move. If they roll the same value on both dice, this is called “rolling
doubles,” and it means they go again. In our simplified version, the dice-roll function should
behave like this:
1. Generate two random integers in the 1 to 6 range.
2. If the numbers are not the same, return the sum.
3. If the numbers are the same, generate two more random integers in the 1 to 6 range,
and return the sum of all 4 numbers.
Hint: to make your code neater, you can define a second function that generates a random
integer in the 1 to 6 range (or in the 1 to x range based on a parameter) so that you do not
need to keep repeating that code.*/

public class MonoRoll {
    public static void main(String[] args) {
        int firstRoll = diceRoll(6);
        int secondRoll = diceRoll(6);

        System.out.println("First roll: " + firstRoll);
        System.out.println("Second roll: " + secondRoll);

        if (firstRoll != secondRoll) {
            int total = firstRoll + secondRoll;
            System.out.println("The total of the two random numbers are " + total);
        } else {
            int thirdRoll = diceRoll(6);
            int fourthRoll = diceRoll(6);
            int total = firstRoll + secondRoll + thirdRoll + fourthRoll;

            System.out.println("Third roll: " + thirdRoll);
            System.out.println("Fourth roll: " + fourthRoll);
            System.out.println("The total of the four numbers are " + total);
        }
    }

    public static int diceRoll(int sides) {
        double randomNumber = Math.random();
        randomNumber = randomNumber * sides;
        randomNumber += 1;
        int randomInt = (int) randomNumber;

        return randomInt;

    }
}
