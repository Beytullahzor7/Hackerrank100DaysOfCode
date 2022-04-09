package HackerRank;

import java.util.Scanner;

public class ReverseString3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        char[] charArray = word.toCharArray();
        for(int i=charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }
    }
}
