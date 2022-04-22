package HackerRank;

import java.util.Arrays;

public class FindMedianHackerRank {
    public static void main(String[] args) {
        /*
         Example
         arr = [1,1,0,-1,-1]
         Find the median of array
         */

        int[] arr = {1, 1, 5, 6, 3, 0, -1, -1, 15};
        System.out.println(findMedian(arr));
    }

    public static int findMedian(int[] arr) { //[1,1,5,6,3,0,-1,-1,15]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int median = arr.length / 2;
        return arr[median];

    }
}

