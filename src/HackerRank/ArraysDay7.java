package HackerRank;

import java.util.Scanner;

public class ArraysDay7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        input.close();

        for(int k=n-1; k>=0; k--){
            System.out.print(arr[k] + " ");
        }
    }
}
