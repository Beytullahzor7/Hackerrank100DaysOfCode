package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

/*
a = [2,3,5,1,4]
Now if we permute the array as [1,4,5,3,2] the result is a zig zag sequence.
Debug the given function findZigZagSequence to return the appropriate zig zag sequence for the given input array.
Note: You can modify at most three lines in the given code. You cannot add or remove lines of code.
To restore the original code, click on the icon to the right of the language selector.
 */

public class ZigZagSequence {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for (int cs = 1; cs <= test_cases; cs++) {
            int n = kb.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
    }

    public static void findZigZagSequence(int[] a, int n) { //[2,3,5,1,4]
        Arrays.sort(a); // 1 2 3 4 5
        int mid = (n - 1) / 2; // 2
        int temp = a[mid]; // a[2] = 3
        a[mid] = a[n - 1]; //a[2] = 5
        a[n - 1] = temp; //a[4] = 3  --> 1 2 5 4 3

        int st = mid + 1; //3
        int ed = n - 2; // 3
        while (st <= ed) {
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
