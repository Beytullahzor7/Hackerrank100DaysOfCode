package HackerRank;

public class WordCount {
    public static void main(String[] args) {
        /*
        * Description: Using the Java language, have the function  WordCount(str)
        * take the str string parameter being passed and return the number of
        * words the string contains (ie. "Never eat shredded wheat" would return 4).
        * Words will be separated by single spaces.
        * Note: After completing this problem I checked another users solution and found a more optimal way of doing this:
	    String[] myArray = str.split(" ");
	    Integer count = myArray.length;
	    str = count.toString();
	    return str;
        */

        System.out.println(wordCount("Never eat shredded wheat"));
    }

    public static int wordCount(String str){
        String[] strArray = str.split(" ");
        int count = strArray.length;

        return count;
    }
}
