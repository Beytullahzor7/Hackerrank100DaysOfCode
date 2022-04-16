package HackerRank;

public class SplitString {
    public static void main(String[] args) {
        splitString("What are you waiting for?");
    }

    public static void splitString(String str) {

        String[] strArray = str.split(" ");

        for(String temp : strArray){
            System.out.println(temp);
        }
    }
}
