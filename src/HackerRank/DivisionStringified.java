package HackerRank;

import java.util.Arrays;

public class DivisionStringified {
    public static void main(String[] args) {
        /*
         * Description:  Using the Java language, have the function
         * DivisionStringified(num1,num2) take both parameters being passed, divide
         * num1 by num2, and return the result as a string with properly formatted
         * commas. If an answer is only 3 digits long, return the number with no
         * commas (ie. 2 / 3 should output "1"). For example: if num1 is
         * 123456789 and num2 is 10000 the output should be "12,345".
         */

        System.out.println(divisionStringified(123456789, 10000));
    }

    public static String divisionStringified(int num1, int num2) {

        int result = num1 / num2;
        String[] str = Integer.toString(result).split("");
        System.out.println(Arrays.toString(str));
        int count = 0;
        for (int i = str.length - 2; i >= 0; i--) {
            count++;
            if (count % 3 == 0) {
                str[i] = str[i] + ",";
                count = 0;
            }
        }
        StringBuilder output = new StringBuilder();
        for (int i=0; i<str.length; i++) {
            output.append(str[i]);
        }
        return output.toString();
    }
}
