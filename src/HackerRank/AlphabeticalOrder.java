package HackerRank;

import java.util.Arrays;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        System.out.println(alphabeticalorder("hello"));
    }

    public static String alphabeticalorder(String str){

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        return String.valueOf(charArray);
        //return new String(charArray);
    }
}
