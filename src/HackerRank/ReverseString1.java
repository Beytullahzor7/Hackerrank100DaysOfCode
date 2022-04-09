package HackerRank;

import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String reverseString = "";
        char ch;

        for(int i=0; i<str.length(); i++){
           ch = str.charAt(i);
           reverseString = ch + reverseString;
        }
        System.out.println(reverseString);
    }
}
