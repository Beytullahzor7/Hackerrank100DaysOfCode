package HackerRank;

import java.util.List;

public class FlippingMatrix {
    public static void main(String[] args) {

    }

    public static int flippingMatrix(List<List<Integer>> matrix) { // 4x4
        int sum = 0;

        int size = matrix.size();

        for(int i=0; i<size/2; i++){
            for(int j=0; j<size/2; j++){
                sum += Math.max(matrix.get(i).get(j), Math.max(matrix.get(i).get(size-1-j), Math.max(matrix.get(size-1-i).get(j), matrix.get(size-1-i).get(size-1-j))));
            }
        }
        return sum;
    }
}
