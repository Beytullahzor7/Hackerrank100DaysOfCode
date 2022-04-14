package HackerRank;

public class LeetCode633SumOfSquareNumbers {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2));
    }

    public static boolean judgeSquareSum(int n){
        for(long i=0; i*i<=n; i++){
            double d = Math.sqrt(n - i*i);
            if(d == (int) d){
                return true;
            }
        }
        return false;
    }
}
