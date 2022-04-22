package HackerRank;

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers(11));
    }
    public static int sumNumbers(int n){
        int result = 0;

        for(int i=1; i<=n; i++){
            result += i;
        }
        return result;
    }
}
