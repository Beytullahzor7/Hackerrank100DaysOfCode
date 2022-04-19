package HackerRank;

public class AlphabetSearching {
    public static void main(String[] args) {
        /*Alphabet Searching
        Have the function AlphabetSearching(str) take the str parameter being passed and
        return the string true if every single letter of the English alphabet exists in the string,
        otherwise return the string false. For example: if str is "zacxyjbbkfgtbhdaielqrm45pnsowtuv"
        then your program should return the string true because every character in the alphabet exists in this string
        even though some characters appear more than once.

        Examples
        Input: "abcdefghijklmnopqrstuvwxyyyy"
        Output: false

        Input: "abc123456kmo"
        Output: false
        */

        System.out.println(alphabetSearching("zacxyjbbkfgtbhdaielqrm45pnsowtuv"));
    }

    public static String alphabetSearching(String str){
        String alphabet = "abcdefghijklmnopqrstuwxyz";
        str = str.toLowerCase();

        for(int i=0; i<alphabet.length(); i++){
            if(!str.contains(alphabet.charAt(i)+"")){
                return "false";
            }
        }
        return "true";
    }
}
