package HackerRank;

public class NumberReverse {
    public static void main(String[] args) {
        /*Number Reverse
        Have the function NumberReverse(str) take the str parameter being passed which
        will be a string of numbers, and return a new string with the numbers in reverse order.

        Examples
        Input: "1 2 3"
        Output: 3 2 1

        Input: "10 20 50"
        Output: 50 20 10
        */

        System.out.println(numberReverse("10 20 50"));
    }

    public static String numberReverse(String str) {
        String[] strArray = str.split(" ");

        String result = "";

        for(int i=strArray.length-1; i>=0; i--){
            result = result + strArray[i]+" ";
        }
        return result;
    }
}
