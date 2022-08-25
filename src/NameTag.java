/*Write a Java function called nametagText(). The access modifier should be public, the
return type should be String, and it should take a String parameter called name. In the
body of the function, return the String “Hello, my name is ” with the name parameter added
to the end. (Hint: use String concatenation.)*/

public class NameTag {
    public static void main(String[] args) {
        System.out.println(nametagText("Chima"));
    }

    public static String nametagText(String name) {
        String intro = "Hello, my name is " + name + ".";
        return intro;
    }
}
