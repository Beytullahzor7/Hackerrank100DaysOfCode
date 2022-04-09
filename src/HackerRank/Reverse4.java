package HackerRank;

import java.util.Scanner;

public class Reverse4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        StringBuilder reverse = new StringBuilder();

        for(int i=word.length()-1; i>=0; i--){
            reverse.append(word.charAt(i));
        }
        System.out.println(reverse);
    }
}
