package HackerRank;
import java.util.Scanner;

public class RecursionFactorialDay9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        while ( (num = Integer.parseInt(input.nextLine())) != 0){
            System.out.println("Result " + factorial(num));
        }
    }
    public static int factorial(int n){
        if(n < 2)
            return 1;
        else
            return (n * factorial(n-1));
    }
}
