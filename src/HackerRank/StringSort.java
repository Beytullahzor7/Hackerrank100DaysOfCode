package com.turkcell.security;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        /*
        The elements of a String are called characters. The number of characters in a String
        is called the length, and it can be retrieved with the String.length() method.
        Given two strings of lowercase English letters,  and , perform the following operations:

        1-Sum the lengths of  and .
        2-Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
        3-Capitalize the first letter in  and  and print them on a single line, separated by a space.
        */

        sortStringAlphabetically();
    }

    public static void sortStringAlphabetically() {

        Scanner input = new Scanner(System.in);

        String A = input.nextLine();
        String B = input.nextLine();

        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        String resultOfSorting = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(resultOfSorting);

        System.out.println(
                A.substring(0, 1).toUpperCase() + A.substring(1)
                        + " " + B.substring(0, 1).toUpperCase() + B.substring(1)
        );
    }
}
