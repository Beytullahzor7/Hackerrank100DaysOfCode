package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMedianOfList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(6);
        integerList.add(2);
        integerList.add(1);
        integerList.add(9);

        System.out.println(findMedianList(integerList));
    }

    public static int findMedianList(List<Integer> arr) {
        Collections.sort(arr);
        int median = arr.size() / 2;

        return arr.get(median);
    }
}
