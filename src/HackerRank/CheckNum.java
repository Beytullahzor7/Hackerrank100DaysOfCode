package HackerRank;

public class CheckNum {
    public static void main(String[] args) {
        System.out.println(checkNum(2, 2));

    }

    public static String checkNum(int num1, int num2){
        if(num1 == num2) return "-1";
        if(num2 > num1) return "TRUE";
        return "FALSE";
    }
}
