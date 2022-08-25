/*Complete the code in this function to find and return the lowest index in the String array stringArray that the String target occurs.
If the String target does not occur in stringArray, -1 should be returned.
Starting code:
public int indexOfFirstOccurrence(String[] stringArray, String target)
{
return -1;
}
*/

public class LowestIndex {
    public static void main(String[] args) {
        String[] stringArray = {"Learning", "Java", "is", "fun."};
        int indexOfWordJava = indexOfFirstOccurrence(stringArray, "Java");
        System.out.println(indexOfWordJava);
    }

    public static int indexOfFirstOccurrence(String[] stringArray, String target) {
        int arrayLength = stringArray.length;
        for (int i = 0; i < arrayLength; i++) {
            if (stringArray[i].equals(target)) {
                return i;
            }
        }

        return -1;
    }
}
