package HackerRank;

public class PalindromeString {
    public static void main(String[] args) {
        /*
         * Description: Using the Java language, have the function  Palindrome(str)
         * take the str parameter being passed and return the string true if the
         * parameter is a palindrome, (the string is the same forward as it is backward)
         * otherwise return the string false. For example: "racecar" is also "racecar"
         * backwards. Punctuation and numbers will not be part of the string.
         */

        System.out.println(isStringPalindrome("never odd or even"));
    }

    public static boolean isStringPalindrome(String str){
        System.out.println(str.trim());
        System.out.println(str.strip());

        StringBuilder reverseString = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            reverseString.append(str.charAt(i));
        }
        return reverseString.toString().equals(str); //true
        //false
    }
}
