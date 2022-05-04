package HackerRank;

public class VowelCount {
    public static void main(String[] args) {
        /*
         * Description: Using the Java language, have the function  VowelCount(str)
         * take the str string parameter being passed and return the number of vowels
         * the string contains (ie. "All cows eat grass" would return 5). Do not count
         * y as a vowel for this challenge.
         */

        System.out.println(vovelCount("ABCOeUui"));
        System.out.println(vowelCountSecondSolution("All cows eat grass"));

    }

    public static int vovelCount(String str) { //abc

        String vowels = "aeiou";
        int count = 0;

        for(int i=0; i<str.length(); i++){
            for(int j=0; j<vowels.length(); j++){
                if(str.toLowerCase().charAt(i) == vowels.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }

    public static String vowelCountSecondSolution(String str2){
        str2 = str2.toLowerCase();
        int count = 0;
        for(int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' ||
                    str2.charAt(i) == 'o' || str2.charAt(i) == 'u') {
                count++;
            }
        }
        str2 = Integer.toString(count);
        return str2;
    }
}
