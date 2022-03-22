package HackerRank;

import java.util.Scanner;

public class LoopsDay5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inp = input.nextInt();
        multipleNumbers(inp);
    }

    public static void multipleNumbers(int n){
        int result = 1;

        for(int i=1; i<=10; i++){
            result = n*i;
            System.out.printf("%d x %d = %d%n", n,i, result);
        }
    }
}
