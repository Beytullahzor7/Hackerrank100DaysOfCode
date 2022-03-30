package HackerRank.InterfacesDay19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        AdvancedArithmetic myCalculator = new Calculator();
        int n = myCalculator.divisorSum(number);
        System.out.printf("DivisorSum of the %d is %d", number, n);
    }
}
