/*
A savings account yields 5% interest annually. This Java function is designed to determine
how many years it will take for you to have $1,000,000 on deposit given an initial value. The
parameter represents the initial deposit, and the function should return an integer number
of years before there will be $1,000,000 or more in the account. Write a loop to determine
the number of years, and return that value.
(Hint: Do we know how many times this loop needs to iterate? Does this mean a for loop
or a while loop is more appropriate?)
Starting code:
public int yearsTilOneMillion(double initialBalance) {
return 0;
}
*/

public class NumberOfYears {
    public static void main(String[] args) {

        double initialBalance = 900000;
        int numYrs = yearsTilOneMillion(initialBalance);
        System.out.println(numYrs);

    }

    public static int yearsTilOneMillion(double initialBalance) {

        double targetAmount = 1000000;
        double currentBalance = initialBalance;
        int numberOfYrs = 0;

        for (int i = 1; currentBalance < targetAmount; i++) {
            currentBalance = currentBalance + (currentBalance * 0.05);
            numberOfYrs += 1;

        } return numberOfYrs;

    }
}
