package HackerRank;

import java.util.Scanner;

public class EvenOddNumbersInArrayDay6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inp = input.nextLine();

        for(int i=0; i<inp.length(); i++){
            if(i%2 == 0){
                //System.out.println(inp[i] + "  ");
            }
            if(i%2 == 1){
                //System.out.print(inp[i]);
            }
        }
    }
}
