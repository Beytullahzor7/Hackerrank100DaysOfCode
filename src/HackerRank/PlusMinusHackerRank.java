package HackerRank;

import java.util.List;

public class PlusMinusHackerRank {
    public static void main(String[] args) {
        /*
         Example
         arr = [1,1,0,-1,-1]
         There are n=5 elements, two positive, two negative and one zero.
         Their ratios are ,  and . Results are printed as:
         0.400000
         0.400000
         0.200000
         */

        List<Integer> integerList = List.of(-4, 3, -9, 0, 4, 1);
        plusMinus(integerList);
    }

    public static void plusMinus(List<Integer> arr) {

        int length = arr.size();
        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0;

        for (Integer temp : arr) {
            if (temp > 0) positiveNum++;
            else if (temp < 0) negativeNum++;
            else zeroNum++;
        }

        System.out.println((double) positiveNum / length);
        System.out.println((double) negativeNum / length);
        System.out.println((double) zeroNum / length);
    }
}
