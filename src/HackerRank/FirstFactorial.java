package HackerRank;

public class FirstFactorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(6));
    }

    public static int getFactorial(int n){
        if(n < 2) return 1;
        else return (n * getFactorial(n-1));
    }
}
