package HackerRank;

import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        /*
        *   1 2 3
            4 5 6
            9 8 9

            result = 1+5+9 - (3-5-2) determinantını bul
        * */
    }

    public static int diagonalDifference(List<List<Integer>> arr){
        int leftCorner = 0;
        int rightCorner = 0;

        for(int i=0; i<arr.size(); i++){
            leftCorner += arr.get(i).get(i);
            rightCorner += arr.get(i).get(arr.size()-1-i);
        }
        return Math.abs(leftCorner-rightCorner);
    }
}
