package HackerRank;

import java.util.Scanner;

public class ExceptionDay16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int n = Integer.parseInt(input.nextLine());
            System.out.println(n);

        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
