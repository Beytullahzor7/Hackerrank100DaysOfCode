package HackerRank;

import java.util.Arrays;

public class FindLastIndexOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 8, 4};
        System.out.println(lastIndex(arr));
    }

    public static int lastIndex(int[] arr) { //5 6 7 1 8 4
        while (arr.length > 0) {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
        return -1;
    }
}
