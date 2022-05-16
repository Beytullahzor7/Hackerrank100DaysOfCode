package HackerRank;

public class SimpleSymbols {
    public static void main(String[] args) {
        /*
Description: Using the Java language, have the function SimpleSymbols(str) take the str parameter being
passed and determine if it is an acceptable sequence by either returning the string true or false.
The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a)
and for the string to be true each letter must be surrounded by a + symbol. So the string to the left would
be false. The string will not be empty and will have at least one letter.
*/
        System.out.println(isSurroundedBySymbols("++d+===+c++=="));
    }

    public static boolean isSurroundedBySymbols(String str){

        if(Character.isLetter(str.charAt(0))){
            return false;

        }else if(Character.isLetter(str.charAt(str.length()-1))){
            return false;
        }

        for(int i=1; i<str.length()-1; i++){ //From second index to end
            if(Character.isLetter(str.charAt(i))){
                if(str.charAt(i-1) != '+' || str.charAt(i+1) != '+'){
                    return false;
                }
            }
        }
        return true;
    }
}
