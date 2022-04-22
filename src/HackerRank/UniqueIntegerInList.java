package HackerRank;

import java.util.*;

public class UniqueIntegerInList {
    public static void main(String[] args) {
        /*
        Given an array of integers, where all elements but one occur twice, find the unique element.

        Example
        a = [1,2,3,4,3,2,1]
        The unique element is 4.

        Function Description
        Complete the lonelyinteger function in the editor below.

        lonelyinteger has the following parameter(s):

        int a[n]: an array of integers
        Returns

        int: the element that occurs only once
        Input Format

        The first line contains a single integer, , the number of integers in the array.
        The second line contains  space-separated integers that describe the values in .
         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(lonelyinteger2(list));

    }

    public static int lonelyinteger(List<Integer> listInt) { // [1,2,3,4,3,2,1]
        int uniq = 0;

        for (int i=0; i<listInt.size(); i++){
            uniq = listInt.get(i);
            listInt.remove(i);

            if (!listInt.contains(uniq))
                return uniq;
            listInt.add(i, uniq);
        }
        return uniq;
    }

    public static int lonelyinteger2(List<Integer> arr) {
        for(int num : arr)
            if(Collections.frequency(arr, num) == 1) return num;

        return 0;
    }
}
