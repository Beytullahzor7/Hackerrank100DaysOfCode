package HackerRank;

import java.util.Scanner;

public class IsPrimeHackerRankDay25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=0; i<n; i++){
            if(isPrime(input.nextInt())){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
    }

    public static boolean isPrime(int num){
        if(num == 1) return false;

        for(int i=2; i<num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
