package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class ScopeDay14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        input.close();

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }

    static class Difference {
        private int[] elements;
        public int maximumDifference;

        public Difference(int[] arr){
            this.elements = arr;
        }

        public void computeDifference(){
            Arrays.sort(elements);
            maximumDifference = elements[elements.length-1] - elements[0];
        }
    }
}
