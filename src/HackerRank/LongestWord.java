package HackerRank;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        /*
        Description: Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and
        return the largest word in the string. If there are two or more words that are the same length, return
        the first word from the string with that length. Ignore punctuation and assume sen will not be empty.
        */

        System.out.println(longestWord("Hello+++++ asdsadsad New----- World!???????????????????"));
    }

    public static String longestWord(String str){

        //Ignore punctuations
        String[] strArray = str.replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
        //System.out.println(Arrays.toString(strArray));

        String longestWord = "";

        for(String temp : strArray){
            if(temp.length() > longestWord.length()){
                longestWord = temp;
            }
        }
        return longestWord;
    }
}
