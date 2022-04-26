package HackerRank;

import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        /*
         * Description: Using the Java language, have the function ArrayAdditionI(arr) take the array
         * of numbers stored in arr and return the string true if any combination of numbers in the
         * array can be added up to equal the largest number in the array, otherwise return the string
         * false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because
         * 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements, and
         * may contain negative numbers.
         */

        int[] arrInput = {4, 6, 23, 10, 3};

        System.out.println(arrayAddition(arrInput));
    }

    public static String arrayAddition(int[] arr) {

        int largestElement = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        int sumOfResult = Arrays.stream(arr).sum() - largestElement;

        String result = sumOfResult >= largestElement ? "True" : "False";

        return result;
    }
}
