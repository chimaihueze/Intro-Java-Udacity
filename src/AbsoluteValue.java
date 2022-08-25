/*Write a Java function called absoluteValue(). The access modifier should be public, it
should have a return type of double, and it should take one double parameter as input. If
the double parameter is less than 0, it should return that number negated. Otherwise, it
should return the parameter unchanged.*/

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println(absoluteVal(-5));
    }

public static double absoluteVal(double absValue) {
    if (absValue < 0) {
        return -absValue;
    } else {
        return absValue;
        }
    }
}