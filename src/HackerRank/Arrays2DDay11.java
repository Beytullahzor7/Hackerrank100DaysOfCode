package HackerRank;

import java.util.Scanner;

public class Arrays2DDay11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[6][6];
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                arr[i][j] = input.nextInt();
            }
        }

        int max = Integer.MIN_VALUE, temp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (temp > max){
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }
}
