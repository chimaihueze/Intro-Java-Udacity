/*
 Write Java code to define a double variable called fahrenheit and set it to an initial value
between 0 and 100. Then, create a double variable called celsius, and calculate its value
based on the value of fahrenheit. (To convert from Fahrenheit to Celsius, subtract 32,
then multiply by 5, then divide by 9.) Finally, print the final value of celsius.
 */

public class TempConversion {
    public static void main(String[] args) {
        
        double fahrenheit = 50;
        double celsius = ((fahrenheit - 32) * 5) / 9.0;

        System.out.println(fahrenheit + " degrees fahrenheit is approximately " + celsius + " degrees celsius.");

    }
}
