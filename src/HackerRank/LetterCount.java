package HackerRank;

public class LetterCount {
    public static void main(String[] args) {
        /*
         * Description: Using the Java language, have the function LetterCountI(str) take the
         * str parameter being passed and return the first word with the greatest number of
         * repeated letters. For example: "Today, is the greatest day ever!" should return
         * greatest because it has 2 e's (and 2 t's) and it comes before ever which also
         * has 2 e's. If there are no words with repeating letters return -1. Words will
         * be separated by spaces.
         */

        System.out.println(letterCount("Today, is the greatest day ever!"));
    }

    public static String letterCount(String str){

        String[] strArray = str.split(" ");

        int count=0, temp=0;

        String word = strArray[0];

        for(int i = 0; i < strArray.length; i++) {
            for(int j = 0; j < strArray[i].length(); j++) {
                temp = 0;
                for(int k = 0; k < strArray[i].length(); k++) {
                    if(strArray[i].charAt(j) == strArray[i].charAt(k)) {
                        temp++;
                    }
                }
                if(count < temp) {
                    count = temp;
                    word = strArray[i];
                }
            }
        }
        if(count == 1){
            return "-1";
        }
        return word;
    }
}

