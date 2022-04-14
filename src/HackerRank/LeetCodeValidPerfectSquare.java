package HackerRank;

public class LeetCodeValidPerfectSquare {
    public static void main(String[] args) {
        /*Given a positive integer num, write a function which returns True if num is a perfect square else False.
        Follow up: Do not use any built-in library function such as sqrt.

        Example 1:

        Input: num = 16
        Output: true

        Example 2:

        Input: num = 14
        Output: false */

        System.out.println(isPerfectSquare(16));

    }

    public static boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;

        int n = 1;
        while(num > 0){
            num-=n;
            n+=2;
            //System.out.println(num);
        }
        return num == 0;
    }
}
