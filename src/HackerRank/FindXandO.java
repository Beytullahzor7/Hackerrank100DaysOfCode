package HackerRank;

public class FindXandO {
    public static void main(String[] args) {
        /*
         * Description: Using the Java language, have the function  ExOh(str) take
         * the str parameter being passed and return the string true if there is
         * an equal number of x's and o's, otherwise return the string false. Only
         * these two letters will be entered in the string, no punctuation or numbers.
         * For example: if str is "xooxxxxooxo" then the output should return false
         * because there are 6 x's and 5 o's.
         */

        System.out.println(findXandO("ooxxxxooxo"));

    }

    public static boolean findXandO(String str) {

        char[] charArray = str.toLowerCase().toCharArray();

        int countX = 0, countO = 0;

        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == 'x') countX++;
            else if (charArray[i] == 'o') countO++;
        }
        return countX == countO;
    }
}
