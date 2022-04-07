package HackerRank;

import java.util.Scanner;

public class NestedLogicDay26 {
    public static void main(String[] args) {
        int fine = 0;

        Scanner input = new Scanner(System.in);

        int returnDay = input.nextInt();
        int returnMonth = input.nextInt();
        int returnYear = input.nextInt();

        int dueDay = input.nextInt();
        int dueMonth = input.nextInt();
        int dueYear = input.nextInt();

        if (returnYear < dueYear) {
            fine = 0;
        } else {
            if (returnYear > dueYear) fine = 10000;
            else if (returnMonth > dueMonth) fine = 500 * (returnMonth - dueMonth);
            else if (returnDay > dueDay) fine = 15 * (returnDay - dueDay);
        }

        System.out.println(fine);
    }
}
