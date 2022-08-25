/*
Write Java code to create a String variable called firstName, define it to be your first name
as a String. Then define a variable called lastName and define it to be your last name as a
String. Then define a variable called fullName and set it to be your first name followed by
a space followed by your last name. Use the existing variables for your first and last name
and String concatenation to define fullName. Finally, write code to print this text:

Hello, my name is [full name].
There are [number] letters in my name.

Use String concatenation to create the first String to print using the fullName variable, and
use the .length() command on firstName and lastName to calculate the number of letters.
Note: you can concatenate an integer and a String and the integer will be converted to a
String. For example, this expression:
"There are "+ 7 + "days in a week."
will be evaluated as the String:
"There are 7 days in a week."
*/

public class Name {
    public static void main(String[] args) {
        String firstName = "Chima";
        String lastName = "Ihueze";
        int fNameLength = firstName.length();
        int lNameLength = lastName.length();

        int nameLength = fNameLength + lNameLength;

        System.out.println("Hello, my full name is " + firstName + " " + lastName + ".");
        System.out.println("There are " + nameLength + " letters in my name.");

    }
}
