package HackerRank;

import java.util.Set;
import java.util.stream.Collectors;

public class TwoStringsHackerRank {
    public static void main(String[] args) {
        /*
        Given two strings, determine if they share a common substring. A substring may be as small as one character

        Example

        s1 = "and"
        s2 = "art"

        These share the common substring a

        s1 = "be"
        s2 = "cat"

        These do not share a substring

        Function Description

        Complete the function twoStrings in the editor below.
        twoStrings has the following parameter(s):

        string s1: a string
        string s2: another string
        Returns

        string: either YES or NO
         */

        System.out.println(twoStrings("and", "art"));

    }

    public static String twoStrings(String s1, String s2) {
        Set<String> stringS1 = s1.chars().mapToObj(s -> String.valueOf(s)).collect(Collectors.toSet());
        Set<String> stringS2 = s2.chars().mapToObj(s -> String.valueOf(s)).collect(Collectors.toSet());

        boolean isContain = stringS1.stream().anyMatch(s -> stringS2.contains(s));

        return isContain ? "YES" : "NO";
    }
}
