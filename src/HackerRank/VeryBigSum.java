package com.turkcell.business.service.impl;

import java.util.List;

public class VeryBigSum {
    public static void main(String[] args) {
        /*
        In this challenge, you are required to calculate and print the sum of the elements in an array,
        keeping in mind that some of those integers may be quite large.
        Function Description
        Complete the aVeryBigSum function in the editor below.
        It must return the sum of all array elements.
        aVeryBigSum has the following parameter(s):
        int ar[n]: an array of integers .
        Return
        long: the sum of all array elements
         */

        List<Long> a = List.of(1L, 2L, 3L, 4L, 6L);
        System.out.println(aVeryBigSum(a));
    }
    public static long aVeryBigSum(List<Long> ar) {
        long result = ar.stream().reduce((a, b) -> (a + b)).get();

        //Second Way
        long result2 = ar.stream().reduce(Long::sum).get();
        return result;
    }
}
