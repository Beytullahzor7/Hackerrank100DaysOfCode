package HackerRank;

import java.util.Arrays;

public class SumMultiplier {
    public static void main(String[] args) {
        /*Sum Multiplier
        Have the function SumMultiplier(arr) take the array of numbers stored
        in arr and return the string true if any two numbers can be multiplied
        so that the answer is greater than double the sum of all the elements in the array.
        If not, return the string false. For example: if arr is [2, 5, 6, -6, 16, 2, 3, 6, 5, 3] then
        the sum of all these elements is 42 and doubling it is 84. There are two elements in the array,
        16 * 6 = 96 and 96 is greater than 84, so your program should return the string true.*/

        int[] input = {2, 5, 6, -6, 16, 2, 3, 6, 5, 3};
        System.out.println(sumMultiplier(input));
    }

    public static String sumMultiplier(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int resultSum = Arrays.stream(arr).sum() * 2; //resultSum = 84

//        int sum = 0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        sum = sum*2;

        int result = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                result = arr[i] * arr[j];
                if(result > resultSum){
                    System.out.println(result);
                    return "true";
                }
            }
        }
        return "false";
    }
}
