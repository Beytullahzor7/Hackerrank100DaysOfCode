package HackerRank;

import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        StringBuilder output = new StringBuilder();
        output.append(word);
        output.reverse();

        System.out.println(output);
    }
}
