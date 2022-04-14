package HackerRank;

public class LeetCodeSqrt {
    public static void main(String[] args) {
        /*Given a non-negative integer x, compute and return the square root of x.
        Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
        Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

        Example 1:

        Input: x = 4
        Output: 2

        Example 2:

        Input: x = 8
        Output: 2
        Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

        Square Root by Repeated Subtraction
        We know that the sum of the first n odd natural numbers is n2. We will use this fact to find the square root of a number by repeated subtraction. Let us take an example to learn this method. Say, you are required to find the square root of 121, that is, √121. The steps are:

        121 – 1 = 120
        120 – 3 = 117
        117 – 5 = 112
        112 – 7 = 105
        105 – 9 = 96
        96 – 11 = 85
        85 – 13 = 72
        72 – 15 = 57
        57 – 17 = 40
        40 – 19 = 21
        21 – 21 = 0
        Thus, we have subtracted consecutive odd numbers from 121 starting from 1. 0 is obtained in the 11th step. So we have √121 = 11.*/

        System.out.println(mySqrt(8));

    }

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;

        return calculateRoot(x, 1, 0);
    }

    public static int calculateRoot(int x, int y, int count) { //Square Root Formula
        int z = x - y;

        if (z == 0) return count + 1;
        if (z < 0) return count;
        return calculateRoot(z, y + 2, count + 1);
    }
}
