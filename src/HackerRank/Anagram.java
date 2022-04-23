package HackerRank;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "anagramm";
        String b = "managram";

        System.out.println(isAnagram(a, b));
    }

    public static boolean isAnagram(String a, String b) {
        char[] charA = a.toLowerCase().toCharArray();
        char[] charB = b.toLowerCase().toCharArray();

        while ((charA.length == charB.length)) {
            Arrays.sort(charA);
            Arrays.sort(charB);

            if (Arrays.equals(charA, charB)) {
                return true;
            }
        }
        return false;
    }
}
