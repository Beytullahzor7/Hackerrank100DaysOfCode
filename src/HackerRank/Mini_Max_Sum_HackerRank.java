package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mini_Max_Sum_HackerRank {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(396285104 );
        integerList.add(573261094 );
        integerList.add(759641832 );
        integerList.add(819230764 );
        integerList.add(364801279);
        minimaxSum(integerList);
    }

    public static void minimaxSum(List<Integer> arr){ // [1 3 5 7 9]
        Collections.sort(arr);

        long minSum = arr.get(0);
        long maxSum = arr.get(arr.size()-1);
        long sumOfElements = 0;

        for(Integer temp : arr){
            sumOfElements+=temp;
        }

        long maxResult = sumOfElements - minSum;
        long minResult = sumOfElements - maxSum;
        System.out.println(minResult + " " + maxResult);
    }
}
