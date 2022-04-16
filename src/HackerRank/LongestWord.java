package HackerRank;

public class LongestWord {
    public static void main(String[] args) {


        System.out.println(longestWord("Hello+++++ asdsadsad New----- World!???????????????????"));
    }

    public static String longestWord(String str){

        //Ignore punctuations
        String[] strArray = str.replaceAll("[^a-zA-Z0-9 ]", "").split(" ");

        String longestWord = "";

        for(String temp : strArray){
            if(temp.length() > longestWord.length()){
                longestWord = temp;
            }
        }
        return longestWord;
    }
}
