/*Complete the Java function below to print out all the Strings in the String array parameter
in reverse order. (The String at the highest index should be printed first, then the String at
the next highest index, and so on. The String at index 0 should be printed last.)
For example, if a String array called weekdays had value
{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}
then this function call:
printInVerverse(weekdays);
would print:
Friday
Thursday
Wednesday
Tuesday
Monday
Starting code:
public void printInReverse(String[] stringArray) {
}
*/

public class ReversePrint {
    public static void main(String[] args) {

        String [] stringArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        printInReverse(stringArray);
    }
    public static void printInReverse(String[] stringArray) {
        for (int i = stringArray.length-1; i >=0; i--) {
            System.out.println(stringArray[i]);
        }
    }
}
