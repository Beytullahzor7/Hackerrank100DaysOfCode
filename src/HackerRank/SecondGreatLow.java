package HackerRank;

import java.util.Arrays;

public class SecondGreatLow {
    public static void main(String[] args) {
        /*
         * Description: Using the Java language, have the function SecondGreatLow(arr) take the array
         * of numbers stored in arr and return the second lowest and second greatest numbers, respectively,
         * separated by a space. For example: if arr contains [7, 7, 12, 98, 106] the output should be 12
         * 98. The array will not be empty and will contain at least 2 numbers. It can get tricky if
         * there's just two numbers!
         */

        int[] arr = {7,7,12,34,98,106};
        System.out.println(secondGreatLow(arr));
    }

    public static String secondGreatLow(int[] arr){

        int secondLow=0, secondGreat=0;

        Arrays.sort(arr);

        int lowestNumber = arr[0];
        int greatestNumber = arr[arr.length-1];

        while (arr.length >= 2){
            for(int i=1; i<arr.length-1; i++){ // 7 12 98
                if(arr[i] != lowestNumber){
                    secondLow = arr[i];
                    break;
                }
            }

            for(int i=arr.length-2; i>=1; i--){ // 7 12 98
                if(arr[i] != greatestNumber){
                    secondGreat = arr[i];
                    break;
                }
            }
            break;
        }
        return secondLow + " " +secondGreat;
    }
}
