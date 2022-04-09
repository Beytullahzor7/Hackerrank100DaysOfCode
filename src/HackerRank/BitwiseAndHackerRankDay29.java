package HackerRank;

import java.util.Scanner;

public class BitwiseAndHackerRankDay29 {
    public static void main(String[] args) {

        /*Bitwise And = This operator is a binary operator, denoted by ‘&.’
                        It returns bit by bit AND of input values, i.e.,
                        if both bits are 1, it gives 1, else it shows 0.


                        a = 5 = 0101 (In Binary)
                        b = 7 = 0111 (In Binary)

                        Bitwise AND Operation of 5 and 7
                        0101
                        & 0111
                        ________
                        0101  = 5 (In decimal) */

        Scanner input = new Scanner(System.in);
        int data = input.nextInt();

        for(int i=0; i<data; i++){
            int n = input.nextInt();
            int k = input.nextInt();

            int max = 0;

            for(int b=2; b<=n; b++){
                for(int a=1; a<b; a++){
                    int result = a&b;
                    if(result > max && result < k){
                        max = result;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
