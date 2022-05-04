package HackerRank;

import java.util.List;

public class SimpleArraySumHackerRank {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8);
        System.out.println(simpleArraySum(integerList));
    }

    public static int simpleArraySum(List<Integer> ar) {
        int sumArray = ar.stream().mapToInt(Integer::intValue).sum();
        return sumArray;
    }
}

