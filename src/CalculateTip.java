/*Write a Java function named calculateTip(). The access modifier should be public,
it should have a return type of double, and it should take as input a double parameter
representing the cost of a meal at a restaurant. And finally, it should return a double equal
to 15% of the cost parameter.
*/
public class CalculateTip {
    public static void main(String[] args) {
        System.out.println(calculateTip(1000));
    }

    public static double calculateTip(double mealCost) {
        return mealCost * 0.15;
    }
}
