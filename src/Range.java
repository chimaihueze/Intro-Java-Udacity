/*Complete the function below, which finds the range covered by an integer array. Inside
the function, find the smallest value in the parameter array, and find the largest value, and
return the largest value minus the smallest value. If the array has length 0, return -1.
For example, if the variable myIntArray had the value
{1, 0, 2, 3, -1, 2}
then the function call
findRange(myIntArray)
would return 4. The largest value in the array is 3, the smallest value is -1, and 3−(−1) = 4.
Starting code:
public int findRange(int[] intArray) {
return -1;
}*/

public class Range {
    public static void main(String[] args) {
        int [] intArray = {1, 0, 2, 3, -1, 2};

        System.out.println(findRange(intArray));

    }
    public static int findRange(int[] intArray) {
        int arrayLength = intArray.length;
        int smallestValue = intArray[0];
        int largestValue = intArray[0];

        for (int i = 0; i < arrayLength; i++) {
            if (intArray[i] < smallestValue) {
                smallestValue = intArray[i];
            }
            if (intArray[i] > largestValue) {
                largestValue = intArray[i];
            }
        } return largestValue - smallestValue;
    }
}
