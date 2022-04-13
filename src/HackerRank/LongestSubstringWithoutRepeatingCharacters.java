package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        /*Given a string s, find the length of the longest substring without repeating characters.

            Input: s = "abcabcbb"
            Output: 3
            Explanation: The answer is "abc", with the length of 3.

            Input: s = "bbbbb"
            Output: 1
            Explanation: The answer is "b", with the length of 1.

            Input: s = "pwwkew"
            Output: 3
            Explanation: The answer is "wke", with the length of 3.
            Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
         */
        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }

    public static int lengthOfLongestSubstring(String s) {

        int a = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));

            }else{
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(a));
                    a++;
                }
                set.add(s.charAt(i));
            }
            max = Math.max(i - a+1,max);
        }
        return max;
    }
}
