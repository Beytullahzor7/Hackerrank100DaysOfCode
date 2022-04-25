package HackerRank;

public class ABCheck {
    public static void main(String[] args) {
        /*
         * Description: Using the Java language, have the function  ABCheck(str) take
         * the str parameter being passed and return the string true if the characters
         * a and b are separated by exactly 3 places anywhere in the string at least
         * once (ie. "lane borrowed" would result in true because there is exactly
         * three characters between a and b). Otherwise return the string false.
         */

        System.out.println(check("eramnjbt"));

    }

    public static String check(String str) {

        char[] charArray = str.toLowerCase().toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if ((i+4 < str.length() && charArray[i+4] == 'a') && charArray[i] == 'b'){
                return "TRUE";

            }else if((i+4 < str.length() && charArray[i+4] == 'b') && charArray[i] == 'a'){
                return "TRUE";
            }
        }
        return "FALSE";
    }
}
