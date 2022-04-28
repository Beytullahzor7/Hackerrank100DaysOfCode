package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CountingSort {
    public static void main(String[] args) {
        /*
        Challenge
        Given a list of integers, count and return the number of times each value appears as an array of integers.

        Function Description

        Complete the countingSort function in the editor below.
        countingSort has the following parameter(s):

        arr[n]: an array of integers

        Returns
        int[100]: a frequency array
        Input Format

        The first line contains an integer , the number of items in .
        Each of the next  lines contains an integer  where .
        */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);

        System.out.println(countingSort(integerList));
    }

    public static List<Integer> countingSort(List<Integer> arr) { // [1 2 3 1 2]
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<100; i++){
            result.add(i,0); //List of Zeros
        }

        for(int k : arr){
            result.set(k, result.get(k)+1);
        }

        return result;
    }
}
